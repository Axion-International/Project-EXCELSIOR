import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Superbeing } from './superbeing.class';
import { Observable } from 'rxjs';
import { Team } from './team.class';
import { RequestStatus } from './request-status.class';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private url:string;
  //change urls in methods they are not set for the spring controller
  constructor(private http:HttpClient) {
    this.url="http://localhost:9000";
   }

   public getAllSuperbeings(): Observable<Superbeing[]> {
    const readUrl = this.url+"/superbeing";
    return this.http.get<Superbeing[]>(readUrl);
  }

   public getBySuperName(superName:string): Observable<Superbeing> {
     const readUrl = this.url+"/superbeing/"+superName;
     return this.http.get<Superbeing>(readUrl);
   }

   public updateSuperbeing(superbeing:Superbeing): Observable<Superbeing> {
    const updateUrl = this.url+"/superbeing";
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

}
