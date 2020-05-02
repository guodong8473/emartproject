import { Component, OnInit } from '@angular/core';


interface ProductItem {
  id: string;
  price: number
  title: string;
  desc: string;
  pic: string;
  buycount: number;
};

const PRODUCTS: ProductItem[] = [{
  id: '1',
  price: 3299,
  title: 'iphone se',
  desc: 'iPhone SE packs A13 Bionic, Portrait mode, 4K video, Touch ID, a Retina HD display, and great battery life into a 4.7” design',
  pic: './assets/iphonese.jpg',
  buycount: 1
}, {
  id: '2',
  price: 4999,
  title: 'xiaomi 10',
  desc: 'new xiaomi phone',
  pic: './assets/xiaomi.jpg',
  buycount: 2
}
];

@Component({
  selector: 'app-shoppingcart',
  templateUrl: './shoppingcart.component.html',
  styleUrls: ['./shoppingcart.component.css']
})

export class ShoppingcartComponent implements OnInit {
  products: ProductItem[];
  discountcode = '';

  constructor() { 

  }

  ngOnInit() {
    this.products = PRODUCTS;
    this.discountcode = '00000';
  }
  ondelete() {

  }
  ondiscount() {

  }

  oncheckout() {

  }
}
