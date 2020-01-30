import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
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
    return this.http.get<User>(readUrl);
  }

  public addEmployee(user:User): Observable<User> {
    return this.http.post<User>(this.url,user);
  }

  public deletePromotionRequest(id:number): void {
    const deleteUrl = this.url+"/promotionRequest/"+id;
    this.http.delete<PromotionRequest>(deleteUrl);
  }
}
