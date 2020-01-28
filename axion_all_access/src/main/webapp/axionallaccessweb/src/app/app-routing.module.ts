import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EloginComponent } from './elogin/elogin.component';
import { LoginComponent } from './login/login.component';
import { PrivacyComponent} from './privacy/privacy.component';
import { CustServComponent} from './cust-serv/cust-serv.component';
import { AboutUsComponent} from './about-us/about-us.component';
import { CareersComponent } from './careers/careers.component';

const routes: Routes = [
{path: '',  redirectTo: '/login', pathMatch: 'full' },
{path: 'login',component:LoginComponent},
{path: 'employee',component:EloginComponent},
{path: 'privacy',component:PrivacyComponent},
{path: 'cserve',component:CustServComponent},
{path: 'aboutus',component:AboutUsComponent},
{path: 'careers',component:CareersComponent},
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
