import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {NgbModal, ModalDismissReasons, NgbModalOptions} from '@ng-bootstrap/ng-bootstrap';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Superbeing } from './superbeing.class';

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

  constructor(private modalService: NgbModal, public router: Router, private formBuilder: FormBuilder){

  }
  ngOnInit() {
    this.registerForm = this.formBuilder.group({
        supername: ['', Validators.required, Validators.pattern("[^A-Za-z0-9]")],
        firstName: ['', Validators.required, Validators.pattern("[^A-Za-z]")],
        lastName: ['', Validators.required, Validators.pattern("[^A-Za-z]")],
        username: ['', Validators.required, Validators.pattern("[^A-Za-z0-9] {3,}")],
        password: ['', [Validators.required, Validators.pattern("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})")]],  //PW must be > 8char, include 1lowercase, 1uppercase, 1number, 1specialChar
        confirmPassword: ['', Validators.required],
    // }, {
    //     validator: MustMatch('password', 'confirmPassword')
    });
  }

  get f() { return this.registerForm.controls; }

    openLogin(login) {
      this.modalService.open(login, { 
      backdrop:'static',
      backdropClass:'customBackdrop',
      centered: true });
    }
    
    openRegister(registration) {
      this.modalService.open(registration, { 
      backdrop:'static',
      size: 'xl',
      backdropClass:'customBackdrop',
      centered: true });
    }

    openeLogin(elogin) {
      this.modalService.open(elogin, { 
      backdrop:'static',
      backdropClass:'customBackdrop',
      centered: true });
    }
    
    // private getDismissReason(reason: any): string {
    //   if (reason === ModalDismissReasons.ESC) {
    //     return 'by pressing ESC';
    //   } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
    //     return 'by clicking on a backdrop';
    //   } else {
    //     return  `with: ${reason}`;
    //   }
    // }


    onSubmit() {
      this.submitted = true;
      console.log("Firing");
      // stop here if form is invalid
      if (this.registerForm.invalid) {
          return;
      }

      // display form values on success
      alert('SUCCESS!! :-)\n\n' + JSON.stringify(this.registerForm.value, null, 4));
  }
  
}
