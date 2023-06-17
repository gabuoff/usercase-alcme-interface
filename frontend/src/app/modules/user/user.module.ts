import { NgModule } from "@angular/core";
import { UserDetailsComponent } from "./components/user-details/user-details.component";
import { HttpClientModule } from "@angular/common/http";
import { ReactiveFormsModule } from "@angular/forms";
import { BrowserModule } from "@angular/platform-browser";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { InputMaskModule } from "@ngneat/input-mask";
import { AppRoutingModule } from "src/app/app-routing.module";
import { AppComponent } from "src/app/app.component";
import { SharedModule } from "src/app/shared/shared.module";
import { ProgressBarIndeterminateComponent } from "./components/loading-spinner/progress-bar.component";
import { UserService } from "./components/user/user.service";
import { UserListComponent } from "./components/user-listar/user-listar.component";


@NgModule({
  declarations: [UserDetailsComponent, ProgressBarIndeterminateComponent, UserListComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    SharedModule,
    InputMaskModule.forRoot()
  ],
  exports: [UserDetailsComponent, ProgressBarIndeterminateComponent, UserListComponent],
  providers: [UserService],
  bootstrap: [AppComponent],
})
export class UserModule {}
