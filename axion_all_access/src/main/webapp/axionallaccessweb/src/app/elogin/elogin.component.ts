import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons, NgbModalOptions} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-elogin',
  templateUrl: './elogin.component.html',
  styleUrls: ['./elogin.component.css']
})
export class EloginComponent implements OnInit {
  modalOptions : NgbModalOptions;

  constructor(private modalService: NgbModal) { }

  ngOnInit() {
  }
  openLogin(login) {
    this.modalService.open(login, { 
    backdrop:'static',
    backdropClass:'customBackdrop',
    centered: true });
  }
}

