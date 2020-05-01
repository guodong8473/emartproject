import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
// import { BootstrapModalModule } from 'ngx-bootstrap-modal';
// import { ModalModule } from 'ngx-bootstrap/modal';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
// import { BootstraptModule} from './node_modules/bootstrap/';
import { LoginComponent } from './login/login.component';
import { SignComponent } from './sign/sign.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { ItemsearchComponent } from './itemsearch/itemsearch.component';
import { ItemspecificationComponent } from './itemspecification/itemspecification.component';
import { ShoppingcartComponent } from './shoppingcart/shoppingcart.component';
// import { ProductItem } from'./interface/ProductItem';
import { PurchasehistoryComponent } from './purchasehistory/purchasehistory.component';

@NgModule({
   declarations: [
      AppComponent,
      LoginComponent,
      SignComponent,
      HomeComponent,
      ItemsearchComponent,
      ItemspecificationComponent,
      ShoppingcartComponent,
      PurchasehistoryComponent
   ],
   imports: [
      CommonModule,
      BrowserModule,
      AppRoutingModule,
      ReactiveFormsModule,
      FormsModule,
      //BootstrapModalModule,
      //BootstraptModule
   ],
   providers: [],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
