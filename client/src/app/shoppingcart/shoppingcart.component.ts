import { Component, OnInit } from '@angular/core';
import { ShoppingcartService } from './shoppingcart.service';


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


// const PRODUCTS: ProductItem[] = [{
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
  selector: 'app-shoppingcart',
  templateUrl: './shoppingcart.component.html',
  styleUrls: ['./shoppingcart.component.css']
})

export class ShoppingcartComponent implements OnInit {
  products: any;
  discountcode: string;


  constructor(
    private shoppingcartService : ShoppingcartService,
    
  ) {
  }

  ngOnInit() {
    this.getTrans();
    // this.products = PRODUCTS;
    this.discountcode = '00000';
  }
  async ondelete(id : any) {
    await this.shoppingcartService.delTransaction(id)
    .subscribe(
      items => {
        debugger
        // this.products = items;
        console.log(items)
      });

      this.getTrans();
  }
  ondiscount() {
    // this.loaded = false;
    debugger
  
    //if (this.products.length == 0) {
      this.shoppingcartService.getDiscount(this.discountcode)
        .subscribe(
          items => {
            debugger
            this.products = items;
            console.log(items)
          });
    
    //}
  }

  oncheckout() {

  }

  getTrans() {
    // this.loaded = false;
    debugger
  
    //if (this.products.length == 0) {
      this.shoppingcartService.getTransaction()
        .subscribe(
          items => {
            debugger
            this.products = items;
            console.log(items)
          });
    
    //}
  }
}
