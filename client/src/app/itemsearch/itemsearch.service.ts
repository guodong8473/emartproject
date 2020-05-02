import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class IteamsearchService {
  // url = 'https://jsonplaceholder.typicode.com/users';
  url = 'localhost:8080/itemsearch';

constructor(private http: HttpClient) { }


getItems() {
  return this.http.get(this.url);
}

}
