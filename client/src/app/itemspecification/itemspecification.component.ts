import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-itemspecification',
  templateUrl: './itemspecification.component.html',
  styleUrls: ['./itemspecification.component.css']
})
export class ItemspecificationComponent implements OnInit {
  name = '';
  price = '';
  manufactory = '';
  networktype = '';

  constructor() {
    
    this.onSetValueForm();
   }

  ngOnInit() {
  }
  onSetValueForm() {

    this.name = ('IPHONE');
    this.price = ('1000');
    this.manufactory = ('Apple');
    this.networktype = ('5G');
  }
}
