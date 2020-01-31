import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import { Router } from '@angular/router';
import { User } from '../user.class';
import { UserService } from '../user.service';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  private user : User;


  constructor(private router: Router, private service: UserService) {  
    this.user = new User();
  }

  ngOnInit() {
  }



  ////////////////////TESTING BLOCK//////////////////////
  onSubmit(){
    console.dir(this.user);
    this.service.authenticateUser(this.user).subscribe(res=>this.goToValidate());

    //this.router.navigate([this.returnUrl]);
    // .subscribe(res=>this.gotoUserList());
  }

  goToValidate(): void{
    this.user=new User();
    this.router.navigate(['user/login']);
  }
  
}





