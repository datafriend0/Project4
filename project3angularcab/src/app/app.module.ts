import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookcabComponent } from './bookcab/bookcab.component';
import { ViewallbookingsComponent } from './viewallbookings/viewallbookings.component';
import { HomeComponent } from './home/home.component';
import { BookcabService } from './services/bookcab.service';

@NgModule({
  declarations: [
    AppComponent,
    BookcabComponent,
    ViewallbookingsComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule, 
    FormsModule, 
    ReactiveFormsModule, 
    AppRoutingModule,
    HttpClientModule,
  ],
  exports: [],
  providers: [BookcabService],
  bootstrap: [AppComponent]
})
export class AppModule { }