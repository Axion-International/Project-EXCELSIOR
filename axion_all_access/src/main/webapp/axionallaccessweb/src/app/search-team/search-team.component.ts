import { Component, OnInit } from '@angular/core';
import { Team } from '../team.class';
import { TeamService } from '../team.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Superbeing } from '../superbeing.class';

@Component({
  selector: 'app-search-team',
  templateUrl: './search-team.component.html',
  styleUrls: ['./search-team.component.css']
})
export class SearchTeamComponent implements OnInit {

  private team:Team;
  teamForm:FormGroup;
  private superbeings:Superbeing[];
  submitted = false;
  loading = false;
  
  constructor(private service:TeamService,private formBuilder:FormBuilder) {
    this.team = new Team();
   }

  ngOnInit() {
    this.teamForm = this.formBuilder.group ({
      teamName: ['',Validators.required]
    })
  }
  get f() { return this.teamForm.controls }

  onSubmit(){
    this.submitted =true;
    console.log(this.f.teamName.value)
    if(this.teamForm.invalid){
      return;
    }else{
      this.service.getByTeamName(this.f.teamName.value).subscribe(data=>{
        this.team = data;
        console.log(this.team);
        this.loading = true;
      });
     
    }
    // if(this.loading) {
    //   this.service.getTeamMembers(this.team.name).subscribe(data=>{
    //     this.superbeings = data;
    //   })
    // }
  }
}
