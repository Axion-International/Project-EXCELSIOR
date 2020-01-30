import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Superbeing } from './superbeing.class';
import { Team } from './team.class';
import { RequestStatus } from './request-status.class';
import { PromotionRequest } from './promotion-request.class';
import { User } from './user.class';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private url:string

  constructor(private http:HttpClient) {
    this.url="http://localhost:9000/employee";
   }

   public authenication(user:User): Observable<User> {
    const readUrl = this.url;
    return this.http.get<User>(readUrl)
  }

  public addEmployee(user:User): Observable<User> {
    return this.http.post<User>(this.url,user);
  }

   public getAllSuperbeings(): Observable<Superbeing[]> {
    const readUrl = this.url+"/superbeing";
    return this.http.get<Superbeing[]>(readUrl)
  }

   public getBySuperName(superName:string): Observable<Superbeing> {
     const readUrl = this.url+"/superbeing/"+superName;
     return this.http.get<Superbeing>(readUrl)
   }

   public updateSuperbeing(superbeing:Superbeing): Observable<Superbeing> {
    const updateUrl = this.url+"/superbeing";
    return this.http.put<Superbeing>(updateUrl,superbeing)
  }
  
  public getAllTeams(): Observable<Team[]> {
    const readUrl = this.url+"/team";
    return this.http.get<Team[]>(readUrl)
  }

  public getByTeamName(teamName:string): Observable<Team> {
    const readUrl = this.url+"/team/"+teamName;
    return this.http.get<Team>(readUrl)
  }

  public deleteTransferRequest(id:number): void {
    const deleteUrl = this.url+"/transferRequest/"+id;
    this.http.delete<RequestStatus>(deleteUrl)
  }

  public deletePromotionRequest(id:number): void {
    const deleteUrl = this.url+"/promotionRequest/"+id;
    this.http.delete<PromotionRequest>(deleteUrl)
  }
}
