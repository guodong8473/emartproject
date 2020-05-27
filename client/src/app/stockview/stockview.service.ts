import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json;charset=UTF-8' })
};

@Injectable({
  providedIn: 'root'
})
export class StockviewService {


  url = 'http://localhost:4200/api';

  constructor(private http: HttpClient) { }
  
  
getItems() {


  return this.http.get(`${this.url}/cloud-emart-item/stockview`,
  
  //JSON.stringify(buyerModel)
    );
}
updateStock(itemModel) {
  debugger
  return this.http.post(`${this.url}/cloud-emart-item/updatestock`,itemModel);
}
}
