import { Component, OnInit } from '@angular/core';
import { Superbeing } from '../superbeing.class';
import { User } from '../user.class';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-userpage',
  templateUrl: './userpage.component.html',
  styleUrls: ['./userpage.component.css']
})
export class UserpageComponent implements OnInit {
  teamQuery;
  heroQuery;
  Heroes: Superbeing[];

  private User: User;
  submitted = false;

  constructor(private service: UserService, private router: Router) {
    this.teamQuery = "";
    this.heroQuery = "";
    this.User = new User();
    //////////////////////TESTING THIS///////////////////////////////
    console.log(localStorage.getItem('currentUser'));
  }

  ngOnInit() {
    this.User = this.service.getUserSession();
  }

  searchHeroes() {

    if (this.heroQuery == "") {
      console.log("Blank Query!");
      this.searchError("Search field cannot be blank");
      return;
    }

    this.Heroes = null;
    if (isNaN(this.heroQuery)) {
      //Search by name
      console.log("Searching for " + this.heroQuery)


      this.service.getBySuperName(this.heroQuery).subscribe(data => {
        this.Heroes = data;this.updateHeroes();
      });
      
      return;
    } else {
      //Search by ID
      return;
    }
  }

  updateHeroes() {
    if (this.Heroes != null && this.Heroes.length > 0) {
      //Successful Gather
      var element = document.getElementById("SuperBeings");
      this.searchError("");
      element.classList.remove("d-none");
    } else {
      //Whoops
      var element = document.getElementById("SuperBeings");

      //hide the window
      element.classList.remove("d-none");
      element.classList.add("d-none");
      this.searchError("No results.");
      return;
    }

    //Activate the Heroes Result screen

    //Pass this result to aggregate stats
  }

  updateStats(Heroes: Superbeing[]) {
  }

  searchError(ErrorText: string) {
    var errormessage = document.getElementById("searchErrorText");
    let errorZone = document.getElementById("searchError");
    if (ErrorText == "") {
      //Remove box
      errorZone.classList.remove("d-none");
      errorZone.classList.add("d-none");
      return;
    } else {
      errormessage.innerHTML = ErrorText;
      //Show box
      errorZone.classList.remove("d-none");
      return;
    }

  }

  populateTeams() {
    //Search for a team


  }

}
