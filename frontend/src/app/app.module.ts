import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { MaterialModule } from './shared/material.module';
import { InputMaskModule } from '@ngneat/input-mask';
import { SharedModule } from './shared/shared.module';
import { UserModule } from './modules/user/user.module';
@NgModule({
  declarations: [AppComponent],
  imports: [
    UserModule,
    BrowserModule,
    MaterialModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    SharedModule,
    InputMaskModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
