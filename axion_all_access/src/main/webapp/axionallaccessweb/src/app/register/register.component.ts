import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MustMatch } from '../Validators/must-match.Validator';
import { User } from '../user.class';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { Errors } from '../errors';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent implements OnInit {

  private user : User;
  registerForm: FormGroup;
  submitted = false;
  private errors:Errors;

  constructor(private formBuilder: FormBuilder, private service: UserService, private router: Router ) { 
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

  // convenience getter for easy access to form fields
  get f() { return this.registerForm.controls; }

  onSubmit() {
      this.submitted = true;
      // stop here if form is invalid
      if (this.registerForm.invalid) {
          return;
      }else{
        this.service.registerUser(this.user).subscribe(res=>this.gotoUserList(),error=>this.errors = error.error);
      }
  }

  gotoUserList(): void{
    this.user=new User();
    this.router.navigate(['/user']);
  }

  onReset() {
      this.submitted = false;
      this.registerForm.reset();
  }
}
