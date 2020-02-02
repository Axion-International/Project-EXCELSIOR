import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { EloginComponent } from './elogin/elogin.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { CustServComponent } from './cust-serv/cust-serv.component';
import { CareersComponent } from './careers/careers.component';
import { PrivacyComponent } from './privacy/privacy.component';
import { UserpageComponent } from './userpage/userpage.component';
import { UserService } from './user.service';
import { EmployeeService } from './employee.service';
import { RegisterComponent } from './register/register.component';
import { HttpClientModule,HTTP_INTERCEPTORS } from '@angular/common/http';
import { EregisterComponent } from './eregister/eregister.component';
import { EpageComponent } from './epage/epage.component';
import { SearchSuperComponent } from './search-super/search-super.component';
import { SearchTeamComponent } from './search-team/search-team.component';
import { HttpInterceptor } from './http-interceptor';
import { PromotionComponent } from './promotion/promotion.component';
import { LocationComponent } from './location/location.component';
import { TeamInfoComponent } from './team-info/team-info.component';


// TO INSTALL -- npm i moduleName  (ie  npm i @ng-bootstrap/ng-bootstrap)
// REQUIRED-- npm i tslib



@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    EloginComponent,
    AboutUsComponent,
    CustServComponent,
    CareersComponent,
    PrivacyComponent,
    UserpageComponent,
    RegisterComponent,
    EregisterComponent,
    EpageComponent,
    SearchSuperComponent,
    SearchTeamComponent,
    PromotionComponent,
    LocationComponent,
    TeamInfoComponent,

  ],
  imports: [
    BrowserModule,
    FormsModule,
    NgbModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
   ],
  providers: [
    UserService, 
    EmployeeService, 
    {provide: HTTP_INTERCEPTORS,useClass: HttpInterceptor, multi: true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
