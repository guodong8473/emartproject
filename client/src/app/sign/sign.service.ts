import { Injectable } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json;charset=UTF-8' })
};

@Injectable({
  providedIn: 'root'
})
export class SignService {
  url = 'http://localhost:4200/api';
constructor(private http: HttpClient) { }


postSign(signForm: FormGroup) {

  let buyerModel = {
    'user_name': signForm.controls.sign_name.value,
    'password': signForm.controls.sign_password.value,
    'email': signForm.controls.email.value,
    'mobile_number': signForm.controls.mobile.value   
  }

  return this.http.post(`${this.url}/cloud-emart-buyer/register`,buyerModel
  
  //JSON.stringify(buyerModel)
    );
    
}

postSellerSign(sellerForm: FormGroup) {
debugger
  let sellerModel = {
    'user_name': sellerForm.controls.seller_sign_name.value,
    'password': sellerForm.controls.seller_sign_password.value,
    'company_name': sellerForm.controls.company_name.value,
    'gstin': sellerForm.controls.company_GSTIN.value,
    'postal_address': sellerForm.controls.company_post.value,
    'company_brief': sellerForm.controls.company_brief.value,
    'website': sellerForm.controls.company_website.value,
    'email': sellerForm.controls.company_email.value,
    'contact_number': sellerForm.controls.company_contact.value,
  }

  return this.http.post(`${this.url}/cloud-emart-seller/register`,sellerModel
  
  //JSON.stringify(buyerModel)
    );
    
}
}
