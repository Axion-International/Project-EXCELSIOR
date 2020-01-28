import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EloginComponent } from './elogin/elogin.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
{ path: '**', redirectTo: 'login', pathMatch: 'full' },
{path: 'login',component:LoginComponent},
{path: 'employee',component:EloginComponent},
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
