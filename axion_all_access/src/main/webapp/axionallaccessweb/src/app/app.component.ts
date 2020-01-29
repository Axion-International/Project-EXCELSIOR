import { Component } from '@angular/core';
import { Router } from '@angular/router';
import {NgbModal, ModalDismissReasons, NgbModalOptions} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'axionallaccessweb';
  username : string;
  password : string;
  
  constructor(private modalService: NgbModal, public router: Router){

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
    openeLogin(elogin) {
      this.modalService.open(elogin, { 
      backdrop:'static',
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


  
}
