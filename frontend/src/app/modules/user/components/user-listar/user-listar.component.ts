import { Component } from "@angular/core";
import { UserService } from "../user/user.service";

@Component({
  selector: 'app-user-listar',
  templateUrl: './user-listar.component.html',
  styleUrls: ['./user-listar.component.css']
})
export class UserListComponent {
  users: any[] = [{name: 'Gabriel', email: 'gabrielmeloc@gmail.com', phone: '21999999999'}];
  
  constructor(private service: UserService) { }

  ngOnInit() {
    this.fetchUsers();
  }

  fetchUsers() {
   this.service.listarCliente().subscribe(
    users => {
      this.users = users;
    },
    error => {
      console.error(error);
    }
  );
}
}
