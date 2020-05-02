import { Injectable } from '@angular/core';
import {CanActivate, Router} from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class LoginActive implements CanActivate {

  constructor(private router: Router) {
  }

  canActivate() {
    if (!sessionStorage.getItem('token')) {
      alert('Please Login')
      this.router.navigate(['/login']);
    } else{
      return true;
    }
  }
}
