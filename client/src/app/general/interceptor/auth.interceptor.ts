import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor
} from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable()
export class Authinterceptor implements HttpInterceptor {

  constructor() {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    const token = sessionStorage.getItem('token');
    // console.log('token:' + token);
    if (token) {
      request = request.clone({
        setHeaders: {
          // 'Content-Type': 'application/json',
          Authorization: token
        }
      });
    }

    return next.handle(request);
  }
}
