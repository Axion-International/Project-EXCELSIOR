import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MustMatch } from '../Validators/must-match.Validator';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
  registerForm: FormGroup;
  submitted = false;

  constructor(private formBuilder: FormBuilder) { }
  // 
  // , Validators.pattern("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})")
  ngOnInit() {
      this.registerForm = this.formBuilder.group({
          username: ['', [Validators.required, Validators.pattern("[A-Za-z0-9_-]{3,20}")]],//Username must be Min 3 char max of 20 all char numbers and underscore valid
          password: ['', [Validators.required, Validators.pattern("[0-9]{3,}")]], //PW must be > 6char, include 1lowercase, 1uppercase, 1number, 1specialChar
          confirmPassword: ['', Validators.required],
          acceptTerms: [false, Validators.requiredTrue]
      // }, {
      //     validator: MustMatch('password', 'confirmPassword')
      });
  }


  // convenience getter for easy access to form fields
  get f() { return this.registerForm.controls; }

  onSubmit() {
      this.submitted = true;

      // stop here if form is invalid
      if (this.registerForm.invalid) {
          return;
      }

      // display form values on success
      alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.registerForm.value, null, 4));
  }

  onReset() {
      this.submitted = false;
      this.registerForm.reset();
  }

}
