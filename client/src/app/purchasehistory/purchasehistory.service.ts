import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json;charset=UTF-8' })
};

@Injectable({
  providedIn: 'root'
})
export class PurchasehistoryService {


  url = 'http://localhost:4200/api';

constructor(private http: HttpClient) { }

getHistory() {


  return this.http.get(`${this.url}/cloud-emart-history/history`
  
  //JSON.stringify(buyerModel)
    );
}

addPurchase(itemModel: any) {
  debugger
  return this.http.post(`${this.url}/cloud-emart-history/register`,itemModel
  
  //JSON.stringify(buyerModel)
    );}

}
