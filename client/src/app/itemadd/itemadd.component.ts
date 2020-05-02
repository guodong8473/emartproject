import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-itemadd',
  templateUrl: './itemadd.component.html',
  styleUrls: ['./itemadd.component.css']
})
export class ItemaddComponent implements OnInit {
  submitted = false;
  itemForm : FormGroup;

  constructor(   private formBuilder: FormBuilder,) { }
  get formControl() { return this.itemForm.controls; }

  ngOnInit() {
    this.itemForm = this.formBuilder.group({
      categary: ['', Validators.required],
      sub_categary: ['', Validators.required],
      item_name: ['', Validators.required],
      price: ['', Validators.required],
      stock: ['', Validators.required],
      des: ['', Validators.required],
  });
  }

  onSubmit() {

    this.submitted = true;
    // alert(this.signForm.invalid)
    if (this.itemForm.invalid) {
      return;
  }
  alert("SUCCESS");
}
}
