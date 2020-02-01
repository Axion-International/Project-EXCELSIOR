import { Component, OnInit } from '@angular/core';
import { Superbeing } from '../superbeing.class';
import { User } from '../user.class';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userpage',
  templateUrl: './userpage.component.html',
  styleUrls: ['./userpage.component.css']
})
export class UserpageComponent implements OnInit {
  teamQuery;
  heroQuery;
  Hero: Superbeing;

  private user : User;
  submitted = false;

  constructor(private service: UserService, private router: Router ) { 
    this.teamQuery = "";
    this.heroQuery="";
    
    this.user = new User();
    this.user.username= "user";
  }

  ngOnInit() {
  }

  searchHeroes()  {
    if(this.heroQuery == "")
      return;

    if(isNaN(this.heroQuery)) {
      console.log("Searching for " + this.heroQuery)
      //Search by name
      this.service.getBySuperName(this.heroQuery).subscribe(data=>{
        this.Hero=data;
      });
      return;
     }else{
       //Search by ID
       return 
     }
  }

  updateHeroes(Heroes : Superbeing[]){

    //Blank out the list
    if (Heroes = null){
      return;
    }

    //Activate the Heroes Result screen

    //Pass this result to aggregate stats
  }

  updateStats(Heroes : Superbeing[] ){

  }
  populateTeams(){
    //Search for a team


  }

}
