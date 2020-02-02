import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { PromotionRequest } from './promotion-request.class';
import { User } from './user.class';
import { Superbeing } from './superbeing.class';
import { Location } from './location.class';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private url:string

  constructor(private http:HttpClient) {
    this.url="http://localhost:9000/employee";
   }

   public authenication(user:User): Observable<User> {
    const readUrl = this.url+"/login";
    return this.http.post<User>(readUrl,user);
  }

  public addEmployee(user:User): Observable<User> {
    return this.http.post<User>(this.url,user);
  }

  //add on side
  public promotionList(): Observable<PromotionRequest[]> {
    const promoUrl = this.url + "/promotion"
    return this.http.get<PromotionRequest[]>(promoUrl);
  }
  
  public deletePromotionRequest(promId:number) :Observable<any>{
    const deleteUrl = this.url +'/promotion';
    console.log(deleteUrl)
    console.log(promId)
    return this.http.delete(`${deleteUrl}/${promId}`);
  }

  public promoteLeader(superbeing:Superbeing) {
    const promoLeader ="http://localhost:9000/user/superbeing";
    return this.http.put<Superbeing>(promoLeader,superbeing);
  }
  public locationList(): Observable<Location[]> {
    return this.http.get<Location[]>(this.url+"/location");
  }
  
  public addLocation(location: Location): Observable<Location>{
    return this.http.post<Location>(this.url+"/location",location);
  }
}
