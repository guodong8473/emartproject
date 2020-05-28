import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {CanActivate, Router} from '@angular/router';
import { LoginService } from './login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  submitted = false;

  error = '';
  constructor(
    private formBuilder: FormBuilder,
    private router: Router,
    private loginService: LoginService

    
  ) { 
    
  }
  get formControl() { return this.loginForm.controls; }

  ngOnInit() {
    sessionStorage.clear();
    this.loginForm = this.formBuilder.group({
        login_name: ['', Validators.required],
        login_password: ['', Validators.required],
        login_role: ['buyer', Validators.required]
        
    });

}

  onSubmit() {

    this.submitted = true;
    // alert(this.loginForm.invalid)
    if (this.loginForm.invalid) {
      return;
  }
  
  {
    this.loginService.postLogin(this.loginForm).subscribe(
      data => {
        debugger
        console.log(JSON.stringify(data));
        const info: any = data;

        console.log('登录成功，调转详情页');
        sessionStorage.setItem('token', info.access_token)
        sessionStorage.setItem('user_role', this.loginForm.controls.login_role.value);
        this.router.navigate(['/home']);

        debugger
  
      }
    );

  }

  // sessionStorage.setItem('token', 'test');
  // 

  }
}
