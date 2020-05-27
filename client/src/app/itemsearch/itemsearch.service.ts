import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json;charset=UTF-8' })
};

@Injectable({
  providedIn: 'root'
})
export class IteamsearchService {
  // url = 'https://jsonplaceholder.typicode.com/users';
  url = 'http://localhost:4200/api';

constructor(private http: HttpClient) { }


getItems(itemSearchModel) {


  return this.http.post(`${this.url}/cloud-emart-item/getItemInfo`,itemSearchModel
  
  //JSON.stringify(buyerModel)
    );
}

}
