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
    PrivacyComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    NgbModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
