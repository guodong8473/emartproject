import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ShoppingcartService {

  url = 'http://localhost:4200/api';

constructor(private http: HttpClient) { }

getTransaction() {


  return this.http.get(`${this.url}/cloud-emart-trans/trans`
  
  //JSON.stringify(buyerModel)
    );
}
delTransaction(id) {


  return this.http.post(`${this.url}/cloud-emart-trans/deltrans`,id
  
  //JSON.stringify(buyerModel)
    );
}
getDiscount(code) {
  return this.http.post(`${this.url}/cloud-emart-trans/discount`,code
  
  //JSON.stringify(buyerModel)
    );

}


}
