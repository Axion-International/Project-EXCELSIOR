import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Superbeing } from './superbeing.class';
import { UserService } from './user.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{
  title = 'axionallaccessweb';
  username : string;
  password : string;
  superbeing : Superbeing;
  registerForm: FormGroup;
  submitted = false;

  constructor( public router: Router, private service: UserService){
    ////////////////TESTING//////////////////////
    //service.getRole();
  }

  ngOnInit() {
  }

  public logout(){
    localStorage.clear();
    this.service.userLogout();
    this.router.navigate(['/login']);
  }
}
