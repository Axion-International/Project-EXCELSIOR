import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons, NgbModalOptions} from '@ng-bootstrap/ng-bootstrap';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username : string;
  modalOptions : NgbModalOptions;
  closeResult : string;

  constructor(private modalService: NgbModal) {  
  }

  ngOnInit() {
  }
  
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


  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return  `with: ${reason}`;
    }
  }

  private validUsername(username){
    if(username.match("/^[a-zA-Z]+$/.test(str);")){
      console.log("true");
    }else{
      console.log("false");
    }
  }
}


