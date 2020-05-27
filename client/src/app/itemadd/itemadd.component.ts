import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ItemaddService } from './itemadd.service';

@Component({
  selector: 'app-itemadd',
  templateUrl: './itemadd.component.html',
  styleUrls: ['./itemadd.component.css']
})
export class ItemaddComponent implements OnInit {
  submitted = false;
  itemForm : FormGroup;

  constructor(   private formBuilder: FormBuilder,
    private itemaddService: ItemaddService,
    ) { }
  get formControl() { return this.itemForm.controls; }

  ngOnInit() {
    this.itemForm = this.formBuilder.group({
      categary: ['', Validators.required],
      sub_categary: ['', Validators.required],
      item_name: ['', Validators.required],
      price: ['', Validators.required],
      stock: ['', Validators.required],
      des: ['', Validators.required],
      gstin: ['', Validators.required],
  });
  }

  onSubmit() {

    this.submitted = true;
    // alert(this.signForm.invalid)
    if (this.itemForm.invalid) {
      return;
  }

  {
    this.itemaddService.postSign(this.itemForm).subscribe(
      data => {
        debugger
        console.log(JSON.stringify(data));
        const info: any = data;
        if (200 == info) {
            console.log('登录成功，调转详情页');
            // sessionStorage.setItem('token', info.result.token)
        } else {
          console.log('登录失败，弹出MSG');
          // this.alerts.push({type : 'danger', message: 'username or password error!'});
  
        }
      }
      // onmessage(this:window,any);
    );
  }

}
}
