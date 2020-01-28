import { Component, OnInit } from '@angular/core';
import {NgbModal, ModalDismissReasons, NgbModalOptions} from '@ng-bootstrap/ng-bootstrap';
import { Router } from '@angular/router';

@Component({
  selector: 'app-elogin',
  templateUrl: './elogin.component.html',
  styleUrls: ['./elogin.component.css']
})
export class EloginComponent implements OnInit {
  modalOptions : NgbModalOptions;

  constructor(private modalService: NgbModal, public router: Router) { }

  ngOnInit() {
  }

}

