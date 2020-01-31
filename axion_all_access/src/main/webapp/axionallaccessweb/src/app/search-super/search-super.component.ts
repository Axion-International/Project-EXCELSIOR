import { Component, OnInit } from '@angular/core';
import { Superbeing } from '../superbeing.class';

@Component({
  selector: 'app-search-super',
  templateUrl: './search-super.component.html',
  styleUrls: ['./search-super.component.css']
})
export class SearchSuperComponent implements OnInit {

  private super:Superbeing;
  
  constructor() { }

  ngOnInit() {
  }

}
