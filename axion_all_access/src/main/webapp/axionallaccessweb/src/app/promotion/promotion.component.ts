import { Component, OnInit } from '@angular/core';
import { Superbeing } from '../superbeing.class';
import { PromotionRequest } from '../promotion-request.class';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
import { NgbModal, ModalDismissReasons } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-promotion',
  templateUrl: './promotion.component.html',
  styleUrls: ['./promotion.component.css']
})
export class PromotionComponent implements OnInit {
  private promotions:PromotionRequest[];
  private superbeing:Superbeing;
  closeResult: string;
  id:number;
  
  constructor(
    private service:EmployeeService, 
    private router:Router,
    private modalService:NgbModal
    ) { }

  ngOnInit() {
    this.service.promotionList().subscribe(data=>{
      this.promotions=data;
    });
    
  }
  pocessPromo(id:number,value:number,being:Superbeing){
    if(value == 1){
      being.leader=true;
      
    }else {
      being.leader=false;
    }
    this.service.promoteLeader(being).subscribe(data=>{
      this.superbeing=data;
    });
    this.service.deletePromotionRequest(id).subscribe(res=>this.ngOnInit());
  }
  open(content,id) {
    this.id=id;
    this.modalService.open(content,{size:'xl',centered:true}).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
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
