import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) {
  }

  api = `http://localhost:8080/`;

  login(user): Observable<any> {
    return this.http.post<any>(`${this.api}login`, user);
  }

  register(user): Observable<any> {
    return this.http.post<any>(`${this.api}adduser`, user);
  }

  employeelist(type): Observable<any> {
    return this.http.get<any>(`${this.api}getUser?userType=${type}`);
  }

  addemployee(user) {
    return this.http.post<any>(`${this.api}addEmployee`,user);
  }
}
