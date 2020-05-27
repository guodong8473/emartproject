import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { StockviewService } from './stockview.service';


interface ProductItem {
  id: string;
  price: number
  item_name: string;
  description: string;
  url: string;
  stock_number: number;
}

// const PRODUCTS: ProductItem[] = [{
//   id: '1',
//   price: 3299,
//   title: 'iphone se',
//   desc: 'iPhone SE packs A13 Bionic, Portrait mode, 4K video, Touch ID, a Retina HD display, and great battery life into a 4.7” design',
//   pic: './assets/iphonese.jpg',
//   stock: 100
// }, {
//   id: '2',
//   price: 4999,
//   title: 'xiaomi 10',
//   desc: 'new xiaomi phone',
//   pic: './assets/xiaomi.jpg',
//   stock: 200
// }
// ];



@Component({
  selector: 'app-stockview',
  templateUrl: './stockview.component.html',
  styleUrls: ['./stockview.component.css']
})
export class StockviewComponent implements OnInit {
  products: any;
  current = 0;
  new_stock = new FormControl(0);
  constructor(
    private stockviewService : StockviewService

  ) { }

  ngOnInit() {
    // this.products = PRODUCTS;
    this.searchitem();
  }
 onview(item) {
  this.current = item;
 }
 onupdate(cur, n_stock) {
  // this.loaded = false;

  //if (this.products.length == 0) {


    let itemModel = {
      id : this.products[cur].id,
      stock_number : n_stock.value,
    };

    this.stockviewService.updateStock(itemModel)
      .subscribe(
        items => {
          debugger
          this.products = items;
          console.log(items)
        });
  
  alert("update Success,UPDATE" + n_stock.value);
  //  this.products[cur].stock = n_stock.value;
  // //update stock and reset the stock
  // this.new_stock.setValue(0);
  this.products[cur].stock_number = n_stock.value;

 }

 searchitem() {
  // this.loaded = false;

  //if (this.products.length == 0) {
    this.stockviewService.getItems()
      .subscribe(
        items => {
          debugger
          this.products = items;
          console.log(items)
        });
  
  //}
}
}
