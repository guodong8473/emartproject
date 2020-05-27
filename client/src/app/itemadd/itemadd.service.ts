import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { FormGroup } from '@angular/forms';



const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json;charset=UTF-8' })
};

@Injectable({
  providedIn: 'root'
})
export class ItemaddService {

  url = 'http://localhost:4200/api';
  constructor(private http: HttpClient) { }
  

  postSign(itemForm: FormGroup) {

    let itemModel = {
      'category_id': itemForm.controls.categary.value,
      'subcategory_id': itemForm.controls.sub_categary.value,
      'item_name': itemForm.controls.item_name.value,
      'price': itemForm.controls.price.value,
      'stock_number': itemForm.controls.stock.value,
      'description': itemForm.controls.des.value,
      'gstin': itemForm.controls.gstin.value,
      

    }
  debugger
    return this.http.post(`${this.url}/cloud-emart-item/register`,itemModel
    
    //JSON.stringify(buyerModel)
      );
      
  }

}
