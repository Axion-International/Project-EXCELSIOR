import { Component, OnInit } from '@angular/core';
import { Superbeing } from '../superbeing.class';
import { User } from '../user.class';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { Location } from '../location.class';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { subscribeOn } from 'rxjs/operators';
import { invalid } from '@angular/compiler/src/render3/view/util';
import { Alignment } from '../alignment.class';


@Component({
  selector: 'app-userpage',
  templateUrl: './userpage.component.html',
  styleUrls: ['./userpage.component.css']
})
export class UserpageComponent implements OnInit {
  private locations: Location[];
  teamQuery;
  heroQuery;
  Heroes: Superbeing[];
  registerForm: FormGroup;
  private User: User;

  
  cityId : number;

  newSuper : Superbeing;
  newLoc : Location;
  submitted = false;
  newSetLoc : Location;
  newAlign : Alignment;

  constructor(private service: UserService, private router: Router,private formBuilder: FormBuilder) {
    this.teamQuery = "";
    this.heroQuery = "";
    this.User = new User();
    this.newSuper = new Superbeing();
    this.newLoc = new Location();
    this.newSetLoc = new Location();
    this.newAlign = new Alignment();
    

  }

  // roleId: number;
  // roleName: string;

  ngOnInit() {
    this.service.locationList().subscribe(data=>{this.locations = data;});
    this.User.username = localStorage.getItem('curUsername')
    this.User.userId = parseInt(localStorage.getItem('curUserId'));
    this.User.role = JSON.parse(localStorage.getItem('curRole'));
    this.User.superbeing = JSON.parse(localStorage.getItem('curSuperbeing'));
    this.registerForm = this.formBuilder.group({
      supername: ['', [Validators.required, Validators.pattern("[A-Za-z0-9- ]{3,20}")]],//supername must be Min 3 char max of 20 all char numbers and space valid
      baseloc: ['', [Validators.required, Validators.pattern("[A-Za-z- ]{3,20}")]], //base location min 3 character max of 20 only letters
      firstname: ['', [Validators.required, Validators.pattern("[A-Za-z]{3,20}")]], //base location min 3 character max of 20 only letters
      lastname: ['', [Validators.required, Validators.pattern("[A-Za-z]{3,20}")]], //base location min 3 character max of 20 only letters
      strength: ['', [Validators.required, Validators.pattern("^([1-9][0-9]{0,2}|1000)$")]], //number 1 - 1000
      agility: ['', [Validators.required, Validators.pattern("^([1-9][0-9]{0,2}|1000)$")]], //number 1 - 1000
      constitution: ['', [Validators.required, Validators.pattern("^([1-9][0-9]{0,2}|1000)$")]], //number 1 - 1000
      intelligence: ['', [Validators.required, Validators.pattern("^([1-9][0-9]{0,2}|1000)$")]], //number 1 - 1000
      alignment: ['', Validators.required],
      abilities: ['', Validators.required],
      teamlead: [''],
    });

  }

  // convenience getter for easy access to form fields
  get f() { return this.registerForm.controls; }

  onSubmit() {
    this.submitted = true;
    // stop here if form is invalid
    if (this.registerForm.invalid) {
      console.log("invalid")
        return;
    }else{
      for(let loc of this.locations){
        if(this.newLoc.city == loc.city){
            this.cityId = loc.locationId;
            this.newSuper.location = loc;
        }
      }
      if(this.cityId == null || this.cityId == undefined){
        this.service.addLocation(this.newLoc).subscribe(res=>{
          this.newSetLoc = res;
          this.newSuper.location = res;  // setting location
        });
      }

      if(this.newAlign.alignment_id == 1){
        this.newAlign.alignment = "Hero";
      }else if(this.newAlign.alignment_id == 2){
        this.newAlign.alignment = "Neutral";
      }else if(this.newAlign.alignment_id == 3){
        this.newAlign.alignment = "Villain";
      }

      
      this.newSuper.alignment = this.newAlign;  // setting alignment

      console.dir(this.newSuper);

      this.service.addSuperbeing(this.newSuper).subscribe(res=>this.toUser());
    }
    
  }
  toUser(){
    this.User=new User();
    this.router.navigate(['/user']);
}

  onReset() {
    this.submitted = false;
    this.registerForm.reset();
}


  searchHeroes() {

    if (this.heroQuery == "") {
      console.log("Blank Query!");
      this.searchError("Search field cannot be blank");
      return;
    }

    this.Heroes = null;
    if (isNaN(this.heroQuery)) {
      //Search by name
      console.log("Searching for " + this.heroQuery)


      this.service.getBySuperName(this.heroQuery).subscribe(data => {
        this.Heroes = data;this.updateHeroes();
      });
      
      return;
    } else {
      //Search by ID
      return;
    }
  }

  updateHeroes() {
    var element = document.getElementById("SuperBeings");
    if (this.Heroes != null && this.Heroes.length > 0) {
      //Successful Gather
      
      this.searchError("");
      element.classList.remove("d-none");
    } else {
      
      //hide the window
      element.classList.remove("d-none");
      element.classList.add("d-none");
      this.searchError("No results.");
      return;
    }

    //Activate the Heroes Result screen

    //Pass this result to aggregate stats
  }

  updateStats(Heroes: Superbeing[]) {
  }

  searchError(ErrorText: string) {
    var errormessage = document.getElementById("searchErrorText");
    let errorZone = document.getElementById("searchError");
    if (ErrorText == "") {
      //Remove box
      errorZone.classList.remove("d-none");
      errorZone.classList.add("d-none");
      return;
    } else {
      errormessage.innerHTML = ErrorText;
      //Show box
      errorZone.classList.remove("d-none");
      return;
    }
  }

  populateTeams() {
    //Search for a team
  }

  connectUserToSuperbeing(currentSuperbeing: Superbeing) {
    this.User.superbeing = currentSuperbeing;
    this.service.updateUser(this.User).subscribe(res=>{
      this.User = res;
    })
  }

  kickSuperHeroFromTeam(currentSuperbeing: Superbeing) {
    currentSuperbeing.team = null;
    console.dir(currentSuperbeing);
    this.service.updateSuperbeing(currentSuperbeing).subscribe(res=>{
      // this.heroQuery = res[0].name;
      // this.searchHeroes();
    })
  }

}
