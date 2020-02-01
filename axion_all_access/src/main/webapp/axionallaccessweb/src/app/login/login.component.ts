import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import { Router } from '@angular/router';
import { User } from '../user.class';
import { UserService } from '../user.service';
import { Errors } from '../errors';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private user : User;
  private errors:Errors;

  constructor(private router: Router, private service: UserService) {  
    this.user = new User();
  }

  ngOnInit() {
  }

  onSubmit(){
    this.service.authenticateUser(this.user).subscribe(res=>this.goToValidate(),
    error=>{ 
      this.errors = error.error;
    });
  }

  goToValidate(): void{
    this.user=new User();
    this.router.navigate(['user/login']);
  }
  
}





