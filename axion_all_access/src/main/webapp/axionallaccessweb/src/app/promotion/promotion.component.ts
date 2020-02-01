import { Component, OnInit } from '@angular/core';
import { Superbeing } from '../superbeing.class';
import { PromotionRequest } from '../promotion-request.class';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-promotion',
  templateUrl: './promotion.component.html',
  styleUrls: ['./promotion.component.css']
})
export class PromotionComponent implements OnInit {
  private promotions:PromotionRequest[];
  private superbeing:Superbeing;
  constructor(
    private service:EmployeeService, 
    private router:Router
    ) { }

  ngOnInit() {
    this.service.promotionList().subscribe(data=>{
      this.promotions=data;
    });
    
  }
  pocessPromo(id:number,value:number,being:Superbeing){
    if(value == 1){
      being.leader=true;
      this.service.promoteLeader(being).subscribe(data=>{
        this.superbeing=data;
      });
    }else {
      being.leader=false;
    }
   
    this.service.deletePromotionRequest(id).subscribe(res=>this.ngOnInit());
  }

  gotoEpage(){
    this.router.navigate(['epage']);
  }

}
