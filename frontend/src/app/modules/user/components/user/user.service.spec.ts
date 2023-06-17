import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';
import { UserService } from './user.service';
import { User } from '../../../../core/entities/user.entities';

describe('UserDetailsService', () => {
  let service: UserService;
  let httpMock: HttpTestingController;

  beforeEach(() => {

    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [UserService]
    });

    service = TestBed.inject(UserService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  afterEach(() => {
    httpMock.verify();
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('should send POST request with user data', () => {
    const user: User = {
      name: 'John Doe',
      email: 'johndoe@example.com',
      phone: '1234567890'
    };

    service.cadastrarCliente(user);

    const req = httpMock.expectOne('http://localhost:8080/contatos');
    expect(req.request.method).toBe('POST');
    expect(req.request.body).toEqual(user);
    expect(req.request.headers.get('Content-Type')).toBe('application/json');
  });
});
