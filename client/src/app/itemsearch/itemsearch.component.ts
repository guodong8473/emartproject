import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
// import { DialogComponent, DialogService } from 'ngx-bootstrap-modal';

@Component({
  selector: 'app-itemsearch',
  templateUrl: './itemsearch.component.html',
  styleUrls: ['./itemsearch.component.css']
})
export class ItemsearchComponent implements OnInit {

  start_price = new FormControl('');
  end_price = new FormControl('');
  manufactory = new FormControl('');
  name = new FormControl('');
  friend01 = new FormControl('');
  friend02 = new FormControl('');

  constructor() { 
        this.onSetValueForm();
  }

  ngOnInit() {
  }

  onSetValueForm() {
    this.start_price.setValue('0');
    this.end_price.setValue('1000');
    this.manufactory.setValue('samsung');
    this.name.setValue('Phone');
  }
  onResetForm() {
    this.start_price.setValue('');
    this.end_price.setValue('');
    this.manufactory.setValue('');
    this.name.setValue('');

  }
}
