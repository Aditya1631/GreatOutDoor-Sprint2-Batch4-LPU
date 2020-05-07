import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WishlistAddComponent } from './wishlist-add/wishlist-add.component';
import { WishlistViewComponent } from './wishlist-view/wishlist-view.component';



const routes: Routes = [
  { path:'wishlistAdd', component: WishlistAddComponent },
  { path: 'wishlistView', component: WishlistViewComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
