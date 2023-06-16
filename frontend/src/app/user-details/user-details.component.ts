import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormGroupDirective, NgForm } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ErrorStateMatcher } from '@angular/material/core';
interface User {
  name: string  | null | undefined;
  email: string  | null | undefined;
  phone: string  | null | undefined;
}
@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent {
  form = new FormGroup({
    name: new FormControl('', Validators.required),
    email: new FormControl('', Validators.required),
    phone: new FormControl('', Validators.required)
  });

  constructor(private http: HttpClient, private snackBar: MatSnackBar) { }
  cadastrarCliente(): void {

    const userName = this.form.get('name')?.value;
    const userEmail = this.form.get('email')?.value;
    const userPhone = this.form.get('phone')?.value;
    const user: User = {
      name: userName,
      email: userEmail,
      phone: userPhone
    };
    try {
      console.log(user);
    this.http.post('http://localhost:8080/contatos', user);
    } catch (error) {
      console.error(error);
      this.showSnackBar('Erro ao cadastrar cliente', 'error');
    }
    
  }

  showSnackBar(message: string, panelClass: string): void {
    this.snackBar.open(message, '', {
      duration: 2000,
      panelClass: [panelClass],
    });
  }
}
