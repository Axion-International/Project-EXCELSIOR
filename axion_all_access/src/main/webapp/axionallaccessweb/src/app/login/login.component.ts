import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import { Router } from '@angular/router';
import { User } from '../user.class';
import { UserService } from '../user.service';
import { Errors } from '../errors';
import { ok } from 'assert';


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
    this.service.authenticateUser(this.user).subscribe(res=>this.goToValidate(res),
      error=>{ this.errors = error.error;
    });
 
  }

  goToValidate(res): void{
    //adding res to local storage
    localStorage.setItem('curUserId', JSON.stringify(res.userId));
    localStorage.setItem('curUsername', res.username);
    localStorage.setItem('curRole',JSON.stringify(res.role));
    localStorage.setItem('curSuperbeing', JSON.stringify(res.superbeing));
    this.user=new User();
    
    this.router.navigate(['user/login']);
  }
  
}

// userId: number;
// username: string;
// password: string;
// superbeing: Superbeing;
// role: Role;



