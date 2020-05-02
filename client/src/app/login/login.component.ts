import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {CanActivate, Router} from '@angular/router';

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
    private router: Router
    
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
  sessionStorage.setItem('token', 'test');
  sessionStorage.setItem('user_role', this.loginForm.controls.login_role.value);
 
  // {
  //   this.userService.postSignIn(value).subscribe(
  //     data => {
  //       console.log(JSON.stringify(data));
  //       const info: any = data;
  //       if (200 === info.code) {
  //           console.log('登录成功，调转详情页');
  //           sessionStorage.setItem('token', info.result.token)
  //           this.router.navigate(['/products']);
  //       } else {
  //         console.log('登录失败，弹出MSG');
  //         this.alerts.push({type : 'danger', message: 'username or password error!'});

  //       }
  //     }
  //   );
  // }

 this.router.navigate(['/home']);
  
  }
}
