import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user.class';
import { Errors } from '../errors';
import { UserService } from '../user.service';


@Component({
  selector: 'app-elogin',
  templateUrl: './elogin.component.html',
  styleUrls: ['./elogin.component.css']
})
export class EloginComponent implements OnInit {

  private user: User;
  private errors:Errors;

  constructor(private service:UserService,private router: Router) { 
      this.user = new User();
  }

  ngOnInit() {
    this.user = new User();
  }

  onSubmit(){
    this.service.authenticateUser(this.user).subscribe(res=>this.goToValidate(res),
    error=>{ this.errors = error.error;
  });
  }

  goToValidate(res): void{
    localStorage.setItem('curUserId', JSON.stringify(res.userId));
    localStorage.setItem('curUsername', res.username);
    localStorage.setItem('curRoleId',JSON.stringify(res.role.roleId));
    this.user=new User();
    
    this.router.navigate(['employee/login']);
  }
}

