import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Team } from './team.class';
import { Superbeing } from './superbeing.class';

@Injectable({
  providedIn: 'root'
})
export class TeamService {

  private url:string;

  constructor(private http:HttpClient) { 
    this.url="http://localhost:9000";
  }

  public getByTeamName(teamName:string): Observable<Team>{
    const readUrl = this.url+"/team/"+teamName;

    return this.http.get<Team>(readUrl);
  }

  public getTeamMembers(teamname:string): Observable<Superbeing[]>{
    const readUrl = this.url+"/team/member/" + teamname;
    console.log(readUrl)
    return this.http.get<Superbeing[]>(readUrl);
  }
}
