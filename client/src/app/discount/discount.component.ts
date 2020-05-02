import { Component, OnInit } from '@angular/core';


interface Discount {
  id: string;
  percent: number
  desc: string;

};
const DISCOUNTS: Discount[] = [{
  id: '1',
  percent: 0.1,
  desc: '10% off onsale',
}, {
  id: '2',
  percent: 0.2,
  desc: '20% off onsale',
}
];

@Component({
  selector: 'app-discount',
  templateUrl: './discount.component.html',
  styleUrls: ['./discount.component.css']
})
export class DiscountComponent implements OnInit {
  discounts: Discount[];
  constructor() {
    this.discounts = DISCOUNTS;
   }

  ngOnInit() {
  }

}
