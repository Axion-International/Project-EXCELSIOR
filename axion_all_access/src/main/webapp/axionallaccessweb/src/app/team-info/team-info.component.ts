import { Component, OnInit, Input } from '@angular/core';
import { Superbeing } from '../superbeing.class';
import { TeamService } from '../team.service';
import { Team } from '../team.class';

@Component({
  selector: 'app-team-info',
  templateUrl: './team-info.component.html',
  styleUrls: ['./team-info.component.css']
})
export class TeamInfoComponent implements OnInit {
  @Input() team:Team
  private superbeings:Superbeing[];
  constructor(private service:TeamService) {
    
  }

  ngOnInit() {
      this.service.getTeamMembers(this.team.name).subscribe(data=>{
        this.superbeings = data;
      });
    
   

    
   
  }



}
