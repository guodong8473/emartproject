import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-sign',
  templateUrl: './sign.component.html',
  styleUrls: ['./sign.component.css']
})
export class SignComponent implements OnInit {
  signForm: FormGroup;
  sellerForm: FormGroup;
  submitted = false;
  sellersubmitted = false;
  sign_role = 'buyer';
  error = '';
  constructor(
    private formBuilder: FormBuilder,
  ) { }

  get formControl() { return this.signForm.controls; }
  get sellerformControl() { return this.sellerForm.controls; }
  ngOnInit() {
    this.signForm = this.formBuilder.group({
        sign_name: ['', Validators.required],
        sign_password: ['', Validators.required],
        confirm_password: ['', Validators.required],
        email: ['', Validators.required],
        mobile: ['', Validators.required],
    });
    this.sellerForm = this.formBuilder.group({
      seller_sign_name: ['', Validators.required],
      seller_sign_password: ['', Validators.required],
      seller_confirm_password: ['', Validators.required],
      company_name: ['', Validators.required],
      company_GSTIN: ['', Validators.required],
      company_post: ['', Validators.required],
      company_brief: ['', Validators.required],
      company_website: ['', Validators.required],
      company_email: ['', Validators.required],
      company_contact: ['', Validators.required],
  });

}

onSubmit() {
  this.sellersubmitted = false;
  this.submitted = true;
  // alert(this.signForm.invalid)
  if (this.signForm.invalid) {
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

onsellerSubmit() {
  this.submitted = false;
  this.sellersubmitted = true;

  // alert(this.signForm.invalid)
  if (this.sellerForm.invalid) {
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