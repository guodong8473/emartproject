import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm: FormGroup;
  submitted = false;
  login_role = 'buyer';
  error = '';
  constructor(
    private formBuilder: FormBuilder,
    
  ) { 
    
  }
  get formControl() { return this.loginForm.controls; }

  ngOnInit() {
    this.loginForm = this.formBuilder.group({
        login_name: ['', Validators.required],
        login_password: ['', Validators.required]
    });

}

  onSubmit() {
    this.submitted = true;
    // alert(this.loginForm.invalid)
    if (this.loginForm.invalid) {
      return;
  }
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


  
  }
}
