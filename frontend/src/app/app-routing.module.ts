import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserDetailsComponent } from './modules/user/components/user-details/user-details.component';
import { UserListComponent } from './modules/user/components/user-listar/user-listar.component';

const routes: Routes = [
  { path: '', redirectTo: 'cliente-details', pathMatch: 'full' },
  { path: 'cliente-details', component: UserDetailsComponent },
  { path: 'listar-clientes', component: UserListComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }   
