import { Component, OnInit, Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { BookcabComponent } from '../bookcab/bookcab.component';
import { BaseUrls } from '../app-routing.module';

@Injectable ({
  providedIn: 'root'
})

export class BookcabService {
  booking: any;

  constructor(public httpClient: HttpClient) { }
  
  storeBooking():Observable<any>{
    return this.httpClient.post("http://localhost:8080/bookings/storeBooking",booking,{responseType:'json'});
    }
  
  findAllBookings() {
    return this.httpClient.get<any[]>('http://localhost:8080/bookings/findAllBookings');
  }
  
  /*findAllBookings() {
    this.httpClient.get(BaseUrls.getUrl(BaseUrls.VIEWALLBOOKINGS_GROUPURL))
    .subscribe({
      next: ({code, data, message}: any) => {
        this.booking.next(data);
        this.bookingRetreivedBool = true;
      },
      error: (error) => {
        console.log(error);
      }
    })
  } */
  
}

function booking(arg0: string, booking: any, arg2: { responseType: "json"; }): Observable<any> {
  throw new Error('Function not implemented.');
}
