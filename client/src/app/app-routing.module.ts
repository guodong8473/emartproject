import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SignComponent } from './sign/sign.component';
import { HomeComponent } from './home/home.component';
import { ItemsearchComponent } from './itemsearch/itemsearch.component';
import { ItemspecificationComponent } from './itemspecification/itemspecification.component';


const routes: Routes = [
  // { path: '/', redirectTo :'home' },
  { path: 'login', component: LoginComponent },
  { path: 'sign', component: SignComponent },
  { path: 'home', component: HomeComponent },
  { path: 'itemsearch', component: ItemsearchComponent },
  { path: 'itemspecification', component: ItemspecificationComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
