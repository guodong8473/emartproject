import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { SignComponent } from './sign/sign.component';
import { HomeComponent } from './home/home.component';
import { ItemsearchComponent } from './itemsearch/itemsearch.component';
import { ItemspecificationComponent } from './itemspecification/itemspecification.component';
import { ShoppingcartComponent } from './shoppingcart/shoppingcart.component';
import { PurchasehistoryComponent } from './purchasehistory/purchasehistory.component';
import { ItemaddComponent } from './itemadd/itemadd.component';
import { StockviewComponent } from './stockview/stockview.component';
import { ItemreportComponent } from './itemreport/itemreport.component';
import { DiscountComponent } from './discount/discount.component';
import {LoginActive} from './general/loginactive';

const routes: Routes = [
  { path: '', redirectTo :'/home', pathMatch: 'full'},
  { path: 'login', component: LoginComponent },
  { path: 'sign', component: SignComponent },
  { path: 'home', component: HomeComponent , canActivate: [LoginActive]},
  { path: 'itemsearch', component: ItemsearchComponent,canActivate: [LoginActive] },
  { path: 'itemspecification', component: ItemspecificationComponent ,canActivate: [LoginActive]},
  { path: 'shoppingcart', component: ShoppingcartComponent ,canActivate: [LoginActive]},
  { path: 'purchasehistory', component: PurchasehistoryComponent ,canActivate: [LoginActive]},
  { path: 'itemadd', component: ItemaddComponent ,canActivate: [LoginActive]},
  { path: 'stockview', component: StockviewComponent ,canActivate: [LoginActive]},
  { path: 'itemreport', component: ItemreportComponent ,canActivate: [LoginActive]},
  { path: 'discount', component: DiscountComponent ,canActivate: [LoginActive]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
