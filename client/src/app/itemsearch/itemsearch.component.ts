import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { connectableObservableDescriptor } from 'rxjs/internal/observable/ConnectableObservable';
// import { ProductItem } from'./interface/ProductItem';
// import { DialogComponent, DialogService } from 'ngx-bootstrap-modal';


interface ProductItem {
  id: string;
  price: number
  title: string;
  desc: string;
  pic: string;
}

const PRODUCTS: ProductItem[] = [{
  id: '1',
  price: 3299,
  title: 'iphone se',
  desc: 'iPhone SE packs A13 Bionic, Portrait mode, 4K video, Touch ID, a Retina HD display, and great battery life into a 4.7” design',
  pic: 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1587214615893&di=941488bce9f57493a71cb29380878ec8&imgtype=0&src=http%3A%2F%2Fimg0.pconline.com.cn%2Fpconline%2F2004%2F16%2Fg_13363665_1587023070013.jpg'
}, {
  id: '2',
  price: 4999,
  title: 'xiaomi 10',
  desc: 'new xiaomi phone',
  pic: 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1587214615893&di=941488bce9f57493a71cb29380878ec8&imgtype=0&src=http%3A%2F%2Fimg0.pconline.com.cn%2Fpconline%2F2004%2F16%2Fg_13363665_1587023070013.jpg'
}
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

  products: ProductItem[];
  current = 0;
  constructor() { 
        this.onSetValueForm();
  }

  ngOnInit() {

    this.products = PRODUCTS;
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
}
