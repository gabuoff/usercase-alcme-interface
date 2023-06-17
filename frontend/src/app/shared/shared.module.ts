import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MaterialModule } from './material.module';
import { SnackbarService } from './services/snackbar/snackbar.service';
import { HttpClientModule } from '@angular/common/http';
import { HeaderComponent } from './components/header/header.component';


@NgModule({
  declarations: [
    HeaderComponent
  ],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    MaterialModule
  ],
  exports: [
    HeaderComponent,
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    MaterialModule,
    HttpClientModule,
  ],
    providers: [ SnackbarService ]
})
export class SharedModule { }
