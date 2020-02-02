import { Component, OnInit, Input } from '@angular/core';
import { Superbeing } from '../superbeing.class';
import { TeamService } from '../team.service';
import { Team } from '../team.class';
import { NgbModal, ModalDismissReasons } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-team-info',
  templateUrl: './team-info.component.html',
  styleUrls: ['./team-info.component.css']
})
export class TeamInfoComponent implements OnInit {
  @Input() team:Team
  private superbeings:Superbeing[];
  closeResult: string;
  id:number;
  
  constructor(private service:TeamService, private modalService:NgbModal) {
    
  }

  ngOnInit() {
      this.service.getTeamMembers(this.team.name).subscribe(data=>{
        this.superbeings = data;
      });
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
