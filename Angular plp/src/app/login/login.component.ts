import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { JsonPipe } from '@angular/common';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private login: AuthService, private router: Router) { }

  ngOnInit() {
  }

  message: string;
  form(loginform: NgForm) {
    console.log(loginform.value);
    this.login.login(loginform.value).subscribe(data => {
      console.log(data);
      if (data.statuscode === 200) {
        const user = data.userBean;
        localStorage.setItem('user', user);
        loginform.reset();
        const adminpanel = localStorage.setItem('panel', JSON.stringify(data));
        this.router.navigateByUrl('/');
      } else {
        this.message = 'Invalid Credentials';
      }
    },
      err => {
        console.log(err);
      });
  }
}
