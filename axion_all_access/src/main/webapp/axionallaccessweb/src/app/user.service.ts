import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Superbeing } from './superbeing.class';
import { Observable } from 'rxjs';
import { Team } from './team.class';
import { RequestStatus } from './request-status.class';
import { User } from './user.class';
import { Role } from './role.class';


@Injectable({
  providedIn: 'root'
})
export class UserService {
  currentUser: User = new User;

  role : Role = new Role;

  private url:string;
  //change urls in methods they are not set for the spring controller
  constructor(private http:HttpClient) {
    this.url="http://localhost:9000";
   }

   public getAllSuperbeings(): Observable<Superbeing[]> {
    const readUrl = this.url+"/user/superbeing";
    return this.http.get<Superbeing[]>(readUrl);
  }

   public getBySuperName(superName:string): Observable<Superbeing[]> {
     const readUrl = this.url+"/user/superbeing/name/"+superName;
     return this.http.get<Superbeing[]>(readUrl);
   }

   public updateSuperbeing(superbeing:Superbeing): Observable<Superbeing> {
    const updateUrl = this.url+"/user/superbeing";
    return this.http.put<Superbeing>(updateUrl,superbeing);
  }
  
  public getAllTeams(): Observable<Team[]> {
    const readUrl = this.url+"/team";
    return this.http.get<Team[]>(readUrl);
  }

  public getByTeamName(teamName:string): Observable<Team> {
    const readUrl = this.url+"/team/"+teamName;
    return this.http.get<Team>(readUrl);
  }

  public updateTransferRequest(requestStatus:RequestStatus): Observable<RequestStatus> {
    const updateUrl = this.url+"/transferRequest/";
    return this.http.put<RequestStatus>(updateUrl,requestStatus);
  }

  public registerUser(user : User){
    const updateUrl = this.url + "/user";
    this.role.roleId = 1;
    this.role.roleName = "";
    user.role = {	"roleId" : 1,
    "roleName" : ""};
    return this.http.post<User>(updateUrl,user);

    // Run in H-2 to populate temporary roles
    /*
    Insert into role (role_id, role_name) values (1, 'User');
    Insert into role (role_id, role_name) values (2, 'Employee');

    select * from role;
    */
  }

  /*Returns the current session user so that pages that require a login can use it.
  Currently only returns dummy user. */


  public getUserSession(): User{
    let sessionUser = new User();
    sessionUser.username = localStorage.getItem('curUsername');;
    sessionUser.userId =  parseInt(localStorage.getItem('curUserId'));

    return sessionUser;
  }
  
  public authenticateUser(user : User):Observable <User>{
    const updateUrl = this.url+"/user/login";
    return this.http.post<User>(updateUrl, user);
    
  }

  public userLogout(){
    const updateUrl = this.url+"/logoff";
    return this.http.get(updateUrl);
  }


  public getRole(): number{
  
    let curRoleId = parseInt(localStorage.getItem('curRoleId'));

    return curRoleId;
  }
}
