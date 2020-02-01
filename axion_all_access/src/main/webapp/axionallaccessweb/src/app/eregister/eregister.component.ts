import { Component, OnInit } from '@angular/core';
import { User } from '../user.class';
import { Validators, FormGroup, FormBuilder } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { MustMatch } from '../Validators/must-match.Validator';
import { Router } from '@angular/router';
import { Role } from '../role.class';
import { Errors } from '../errors';
import { UserService } from '../user.service';

@Component({
  selector: 'app-eregister',
  templateUrl: './eregister.component.html',
  styleUrls: ['./eregister.component.css']
})
export class EregisterComponent implements OnInit {

  private user : User;
  private role: Role;
  registerForm: FormGroup;
  submitted = false;
  private errors:Errors;
  
  constructor(private formBuilder: FormBuilder, private service: UserService, private router:Router) { 
    this.user = new User();
  }

  ngOnInit() {
    this.registerForm = this.formBuilder.group({
      username: ['', [Validators.required, Validators.pattern("[A-Za-z0-9_-]{3,20}")]],//Username must be Min 3 char max of 20 all char numbers and underscore valid
      password: ['', [Validators.required, Validators.pattern('^(?=[^A-Z]*[A-Z])(?=[^a-z]*[a-z])(?=\\D*\\d)[A-Za-z\\d!$%@#£€*?&]{6,}$')]], //PW must be > 6char, include 1lowercase, 1uppercase, 1number
      confirmPassword: ['', Validators.required],
      acceptTerms: [false, Validators.requiredTrue]
  }, {
      validator: MustMatch('password', 'confirmPassword')
  });
  }

  get f() { return this.registerForm.controls; }

  onSubmit() {
      this.submitted = true;
      if (this.registerForm.invalid) {
          return;
      }else{
        this.role.roleId=3;
        this.role.roleName="";
        this.user.role=this.role;
        this.service.registerUser(this.user).subscribe(res=>this.reset(), error=>this.errors = error.error);
        
      }
      
  }

  reset(): void{
    this.user=new User();
  }

  onReset() {
      this.submitted = false;
      this.registerForm.reset();
  }

}
