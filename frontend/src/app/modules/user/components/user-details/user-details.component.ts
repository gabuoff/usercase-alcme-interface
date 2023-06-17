import { Component } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { SnackbarService } from 'src/app/shared/services/snackbar/snackbar.service';
import { UserService } from '../../services/user/user.service';
import { User } from 'src/app/core/entities/user.entities';

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

  isLoading: boolean = false;

  constructor(private service: UserService, private snackBar: SnackbarService) { }

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
      this.isLoading = true; // Mostra o spinner de carregamento

      this.service.cadastrarCliente(user).subscribe(
        () => {
          this.isLoading = false; // Oculta o spinner de carregamento
          this.snackBar.showSnackBar('Cliente cadastrado com sucesso', 'success');
        },
        (error: any) => {
          this.isLoading = false; // Oculta o spinner de carregamento
          console.error(error);
          this.snackBar.showSnackBar('Erro ao cadastrar cliente', 'error');
        }
      );
    } catch (error) {
      console.error(error);
      this.snackBar.showSnackBar('Erro ao cadastrar cliente', 'error');
    }
  }

}
