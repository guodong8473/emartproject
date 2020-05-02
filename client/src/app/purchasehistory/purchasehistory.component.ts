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
  selector: 'app-purchasehistory',
  templateUrl: './purchasehistory.component.html',
  styleUrls: ['./purchasehistory.component.css']
})
export class PurchasehistoryComponent implements OnInit {
  products: ProductItem[];
  current = 0;
  constructor() { }

  ngOnInit() {
    this.products = PRODUCTS;
  }
 onview(item) {
  this.current = item;
 }
}
