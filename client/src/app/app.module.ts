import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
// import { BootstrapModalModule } from 'ngx-bootstrap-modal';
// import { ModalModule } from 'ngx-bootstrap/modal';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
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
import { ItemaddComponent } from './itemadd/itemadd.component';
import { StockviewComponent } from './stockview/stockview.component';
import { ItemreportComponent } from './itemreport/itemreport.component';
import { DiscountComponent } from './discount/discount.component';

//import Pipe
import { PercentpipePipe } from './general/pipe/percentpipe.pipe';


//import interceptor
import { HTTP_INTERCEPTORS } from '@angular/common/http';
import { Authinterceptor } from './general/interceptor/auth.interceptor';


@NgModule({
   declarations: [
      AppComponent,
      LoginComponent,
      SignComponent,
      HomeComponent,
      ItemsearchComponent,
      ItemspecificationComponent,
      ShoppingcartComponent,
      PurchasehistoryComponent,
      ItemaddComponent,
      StockviewComponent,
      ItemreportComponent,
      DiscountComponent,
      PercentpipePipe
   ],
   imports: [
      CommonModule,
      BrowserModule,
      AppRoutingModule,
      ReactiveFormsModule,
      FormsModule,
      HttpClientModule,
      //BootstrapModalModule,
      //BootstraptModule
   ],
   providers: [{provide: HTTP_INTERCEPTORS, useClass: Authinterceptor, multi: true}],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
