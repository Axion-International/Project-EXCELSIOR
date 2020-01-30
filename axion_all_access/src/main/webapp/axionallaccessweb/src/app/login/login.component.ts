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
  

 

  private validUsername(username){
    if(username.match("/^[a-zA-Z]+$/.test(str);")){
      console.log("true");
    }else{
      console.log("false");
    }
  }
}


