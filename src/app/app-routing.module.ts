import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookcabComponent } from './bookcab/bookcab.component';
import { HomeComponent } from './home/home.component';
import { ViewallbookingsComponent } from './viewallbookings/viewallbookings.component';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'home', component: HomeComponent},
  {path: 'bookcab', component: BookcabComponent},
  {path: 'viewallbookings', component: ViewallbookingsComponent},
  { path:"**", component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export class BaseUrls {
  public static readonly BASE_HREF: string = "http://localhost:8080";
  public static readonly HOME_GROUPURL: string = "home";
  public static readonly BOOKCAB_GROUPURL: string = "bookings/storeBooking";
  public static readonly VIEWALLBOOKINGS_GROUPURL: string = "bookings/findAllBookings";

  public static getUrl(key: string): string {
  return '$(this.BASE_HREF)/$(key)'; // /get
  } 
  public static getAddUrl (key: string): string {
  return '$(this.BASE_HREF)/$(key)'; // /add
  }
  public static getUpdateUrl (key: string): string {
  return '$(this.BASE_HREF)/$(key)'; // /update
  }
  public static getDeleteUrl (key: string): string {
  return '$(this.BASE_HREF)/$(key)'; // /delete
  } 
}