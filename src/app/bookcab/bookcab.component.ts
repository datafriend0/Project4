import { Component, OnInit, EventEmitter, Input, Output, Injectable, ɵsetAllowDuplicateNgModuleIdsForTest } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FormControl, FormGroup, FormBuilder } from '@angular/forms';
import { BookcabService } from '../services/bookcab.service';
import { BaseUrls } from '../app-routing.module';

@Component({
  selector: 'app-bookcab',
  templateUrl: './bookcab.component.html',
  styleUrls: ['./bookcab.component.css']
})

export class BookcabComponent implements OnInit {
  
  bookcabModel: Bookings | undefined;
  bookings: Bookings[] = [];
  errorMsg: string | undefined;

  // @Input()
  // public bookingInfo:any;

  // @Output()
  // public closeModel: EventEmitter<void> = new EventEmitter<void>();

  ngOnInit(): void {
    this.bs.findAllBookings();
    // this.bs.booking.subscribe(() => {
    //   //if(list.length !==0) this.booking = list;
    // })
  }

  constructor(
    private BookcabService: BookcabService,
    public bs: BookcabService) {}
  
  bookingsObservable = new Observable<any[]>();
  // booking = this.BookcabService.findAllBookings();

  bookcabForm: FormGroup = new FormGroup ({
      passengerid: new FormControl(),
      passengercount: new FormControl(),
      pickuplocation: new FormControl(),
      dropofflocation: new FormControl(),
      traveldistance: new FormControl(),
      cabnumber: new FormControl(),
      basefare: new FormControl(),
      addfees: new FormControl(),
      gratuity: new FormControl(),
      totalfare: new FormControl()
    }
  )

  storeBooking() {
    let booking = this.bookcabForm.value;
    console.log(booking);
    this.bs.storeBooking().subscribe({ // booking was taken out of the storeBooking()
      next:(result:any)=> {
        alert(result)
        console.log(result) 
      },
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    });
    this.bookcabForm.reset();
  }

  /* findAllBookings() {
    if (!this.showbookingsModal) {
      this.http.get(BaseUrls.getUrl(BaseUrls.VIEWALLBOOKINGS_GROUPURL))
      .subscribe ({
        next: ({ code, message, data }: any) => {
          this.booking.next (Object.assign([], data))
          this.showbookingsModal = true
        },
        error: (error: any) => { console.log(error); }
      })
    }
  } */

  // addBookingToDB(){}
}

export interface Bookings {
  bookingid?: number;
  passengerid?: string;
  passengercount?: number;
  pickuplocation?: string;
  dropofflocation?: string;
  traveldistance?: number;
  cabnumber?: number;
  basefare?: number;
  addfees?: number;
  gratuity?: number;
  totalfare?: number;
}
