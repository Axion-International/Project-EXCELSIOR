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

  constructor(private service:EmployeeService,private router: Router) { 
      this.user = new User();
  }

  ngOnInit() {
  }

  onSubmit(){
    this.service.authenication(this.user).subscribe(res=>this.goToValidate());
  }

  goToValidate(): void{
    this.user=new User();
    this.router.navigate(['user/login']);
  }
}

