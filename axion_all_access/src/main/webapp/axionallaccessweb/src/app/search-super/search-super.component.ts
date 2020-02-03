import { Component, OnInit } from '@angular/core';
import { Superbeing } from '../superbeing.class';
import { FormGroup, FormBuilder } from '@angular/forms';
import { UserService } from '../user.service';
import { ModalDismissReasons, NgbModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-search-super',
  templateUrl: './search-super.component.html',
  styleUrls: ['./search-super.component.css']
})
export class SearchSuperComponent implements OnInit {

  private supers:Superbeing[];
  beingForm:FormGroup;
  submitted = false;
  loading = false;
  id:number;
  closeResult: string;
  
  constructor(private service:UserService, private formBuilder:FormBuilder,private modalService:NgbModal) {
    
   }

  ngOnInit() {
    this.beingForm = this.formBuilder.group ({
      superName: ['']
    })
    
  }
  get f() { return this.beingForm.controls }

  onSubmit(){
    this.submitted =true;
    if(this.beingForm.invalid){
      return;
    }else{
      this.service.getBySuperName(this.f.superName.value).subscribe(data=>{
        this.supers = data;
        this.loading = true;
      });
    }
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
