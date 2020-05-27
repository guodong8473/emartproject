import { Component, OnInit } from '@angular/core';
import { PurchasehistoryService } from './purchasehistory.service';


interface ProductItem {
  id: string;
  number_of_items: string;
  item: {
    id: string;
    price: number
    item_name: string;
    description: string;
    url: string;
  }  

};

// const PRODUCTS: ProductItem[] = [
//   {
//   id: '1',
//   price: 3299,
//   title: 'iphone se',
//   desc: 'iPhone SE packs A13 Bionic, Portrait mode, 4K video, Touch ID, a Retina HD display, and great battery life into a 4.7” design',
//   pic: './assets/iphonese.jpg',
//   buycount: 1
// }, {
//   id: '2',
//   price: 4999,
//   title: 'xiaomi 10',
//   desc: 'new xiaomi phone',
//   pic: './assets/xiaomi.jpg',
//   buycount: 2
// }
// ];

@Component({
  selector: 'app-purchasehistory',
  templateUrl: './purchasehistory.component.html',
  styleUrls: ['./purchasehistory.component.css']
})
export class PurchasehistoryComponent implements OnInit {
  // products: ProductItem[];
  products: any;
  current = 0;
  constructor(
    private purchasehistoryService: PurchasehistoryService,

  ) { }

  ngOnInit() {
    
    this.getHistory();
    // this.products = PRODUCTS;
  }
 onview(item) {
  this.current = item;
 }

 getHistory() {
  // this.loaded = false;
  debugger

  //if (this.products.length == 0) {
    this.purchasehistoryService.getHistory()
      .subscribe(
        items => {
          debugger
          this.products = items;
          console.log(items)
        });
  
  //}
}

}
