import { Component } from '@angular/core';
import {Router} from '@angular/router';
// import { DialogService } from "ngx-bootstrap-modal";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
  
})
export class AppComponent {
  title = 'Jins eMart';
  
  constructor(private router: Router) { }

   isSignin: boolean;

  ngOnInit(): void {
    if (sessionStorage.getItem('token')){
      this.isSignin = true;
    } else {
      this.isSignin = false;
    }
  }
  ngDoCheck(): void {

    if (sessionStorage.getItem('token')){
      this.isSignin = true;
    } else {
      this.isSignin = false;
    }
  }
  logOut() {
    sessionStorage.removeItem('token');
    this.router.navigate(['/login']);
  }
}
