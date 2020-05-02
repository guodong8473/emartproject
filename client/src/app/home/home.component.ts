import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  isSeller() {
    if ((sessionStorage.getItem('user_role') == 'seller')) {
      return true;
    } else{
      return false;
    }


  }
}
