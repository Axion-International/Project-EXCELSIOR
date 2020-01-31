import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons, NgbModalOptions} from '@ng-bootstrap/ng-bootstrap';
import { Router } from '@angular/router';
import { User } from '../user.class';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-elogin',
  templateUrl: './elogin.component.html',
  styleUrls: ['./elogin.component.css']
})
export class EloginComponent implements OnInit {
  modalOptions : NgbModalOptions;
  private user: User;
  eloginFrom : FormGroup;
  submitted = false;

  constructor(
    private modalService: NgbModal,
    private formBuilder: FormBuilder, 
    private service:EmployeeService,
    private router: Router
    ) { 
      
      this.user = new User();
      
    }

  ngOnInit() {
    this.eloginFrom = this.formBuilder.group ({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  get f() { return this.eloginFrom.controls;}

  onSubmit() {
    this.submitted=true;
  
    if (this.eloginFrom.invalid){
      return;
    }
    this.user.username=this.f.username.value;
    this.user.password=this.f.password.value;
    this.service.authenication(this.user)
    .subscribe(data =>{
      this.router.navigate(['/'])
    });
    
    
  }
}

