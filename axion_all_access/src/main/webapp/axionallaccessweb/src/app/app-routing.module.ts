import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { EloginComponent } from './elogin/elogin.component';
import { LoginComponent } from './login/login.component';
import { PrivacyComponent} from './privacy/privacy.component';
import { CustServComponent} from './cust-serv/cust-serv.component';
import { AboutUsComponent} from './about-us/about-us.component';
import { CareersComponent } from './careers/careers.component';
import { UserpageComponent } from './userpage/userpage.component';
import { RegisterComponent } from './register/register.component';
import { User } from './user.class';
import { EpageComponent } from './epage/epage.component';


const routes: Routes = [
{path: '',  redirectTo: '/login', pathMatch: 'full' },
{path: 'login',component:LoginComponent},
{path: 'user',component:UserpageComponent},
{path: 'employee',component:EloginComponent},
{path: 'privacy',component:PrivacyComponent},
{path: 'cserve',component:CustServComponent},
{path: 'aboutus',component:AboutUsComponent},
{path: 'careers',component:CareersComponent},
{path: 'register',component:RegisterComponent},
{path: 'user',component:User},
{path: 'user/login',component:UserpageComponent},
{path: 'employee/login',component:EpageComponent},
{path: 'logout', component:LoginComponent}

]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
