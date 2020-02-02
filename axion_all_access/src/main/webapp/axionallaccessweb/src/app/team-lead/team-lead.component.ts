import { Component, OnInit } from '@angular/core';
import { TeamTransferRequest } from '../team-transfer-request.class';
import { Superbeing } from '../superbeing.class';
import { UserService } from '../user.service';
import { Router } from '@angular/router';
import { Team } from '../team.class';
import { User } from '../user.class';
import { RequestStatus } from '../request-status.class';

@Component({
  selector: 'app-team-lead',
  templateUrl: './team-lead.component.html',
  styleUrls: ['./team-lead.component.css']
})
export class TeamLeadComponent implements OnInit {

  private user:User;
  private transfers:TeamTransferRequest[];
  private updateSuper:Superbeing;
  private newTeam:Team;
  private updateStatus:RequestStatus;

  constructor(private service:UserService,private router:Router) { }

  ngOnInit() {
    //this.user.superbeing = JSON.parse(localStorage.getItem('curSuperbeing'));
    this.service.getTeamTransfers().subscribe(res=>this.transfers=res);
    console.dir(this.transfers);
  }
  
  process(id:number,value:number,being:Superbeing,transfer:TeamTransferRequest){
    if(value == 1){
      this.newTeam = this.user.superbeing.team;
      this.updateSuper=being;
      this.updateSuper.team=this.newTeam;
      this.service.updateSuperbeing(this.updateSuper).subscribe();
      this.updateStatus.statusId=1;
      this.updateStatus.statusName="Approve";
      transfer.requestStatus=this.updateStatus;
      this.service.updateTeamTransfers(transfer).subscribe(res=>this.ngOnInit());
    }else {
      this.updateSuper = being;
      this.service.updateSuperbeing(this.updateSuper).subscribe();
      this.updateStatus.statusId=2;
      this.updateStatus.statusName="Reject";
      transfer.requestStatus=this.updateStatus;
      this.service.updateTeamTransfers(transfer).subscribe(res=>this.ngOnInit());
    }
   
  }
}