import { Component, OnInit } from '@angular/core';
import { Team } from '../team.class';

@Component({
  selector: 'app-search-team',
  templateUrl: './search-team.component.html',
  styleUrls: ['./search-team.component.css']
})
export class SearchTeamComponent implements OnInit {

  private team:Team;
  
  constructor() { }

  ngOnInit() {
  }

}
