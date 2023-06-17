import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from 'src/app/core/entities/user.entities';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  users!: any[];

  constructor(private http: HttpClient) { }

  cadastrarCliente(user: User) :  Observable<any>{
    return this.http.post('http://localhost:8080/contatos', user);
  }

  listarCliente() :  Observable<any>{
    return this.http.get<any[]>('http://localhost:8080/listar');
  }
}