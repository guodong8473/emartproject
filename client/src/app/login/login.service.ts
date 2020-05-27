import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { FormGroup } from '@angular/forms';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json;charset=UTF-8' })
};

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  // url = 'http://localhost:4200/api';
  // url = 'http://localhost:8090/oauth/token?grant_type=password&client_id=springcloud&client_secret=mysecret&';

  url = 'http://localhost:4200/api/cloud-emart-auth/oauth/token?grant_type=password&client_id=springcloud&client_secret=mysecret&';

  // http://localhost:8090/oauth/token?grant_type=password&client_id=springcloud&client_secret=mysecret&username=kim&password=pass


constructor(private http: HttpClient) { }



postLogin(loginForm: FormGroup) {

  let user = {
    'user_name': loginForm.controls.login_name.value,
    'password': loginForm.controls.login_password.value,
  }
debugger
  let reUrl = this.url + 'username=' + user.user_name + '&password=' + user.password;

  return this.http.post(`${reUrl}`,user
  
  //JSON.stringify(buyerModel)
    );
    
}

}
