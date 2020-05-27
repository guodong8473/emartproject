import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { connectableObservableDescriptor } from 'rxjs/internal/observable/ConnectableObservable';
// import { ProductItem } from'./interface/ProductItem';
// import { DialogComponent, DialogService } from 'ngx-bootstrap-modal';

import { IteamsearchService } from './itemsearch.service';


interface ProductItem {
  id: string;
  price: number
  item_name: string;
  description: string;
  url: string;
}

const PRODUCTS: ProductItem[] = [
//   {
//   id: '1',
//   price: 3299,
//   item_name: 'iphone se',
//   description: 'iPhone SE packs A13 Bionic, Portrait mode, 4K video, Touch ID, a Retina HD display, and great battery life into a 4.7” design',
//   url: './assets/iphonese.jpg'
// }, {
//   id: '2',
//   price: 4999,
//   item_name: 'xiaomi 10',
//   description: 'new xiaomi phone',
//   url: './assets/xiaomi.jpg'
// }
];
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

  //products: ProductItem[];
  products: any = [];
  current = 0;
  constructor(
    private itemsService: IteamsearchService,

  ) { 
        this.onSetValueForm();

  }

  ngOnInit() {

    this.products = PRODUCTS;
    // this.searchitem();
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

  changeItem(item: any) {
    this.current = item;
  }

  searchitem() {
    // this.loaded = false;
    debugger
    let itemSearchModel = {
      start_price : this.start_price.value,
      end_price : this.end_price.value,
      manufactory : this.manufactory.value,
      name : this.name.value,   
    };
    //if (this.products.length == 0) {
      this.itemsService.getItems(itemSearchModel)
        .subscribe(
          items => {
            debugger
            this.products = items;
            console.log(items)
            debugger
          });
    
    //}
  }

}
