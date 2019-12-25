import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  isadmin() {
    const admindetails = JSON.parse(localStorage.getItem('panel'));
    if (admindetails && admindetails.userBean.userType === 'admin') {
      return true;
    } else {
      return false;
    }
  }

  isuser() {
    const userdetails = JSON.parse(localStorage.getItem('panel'));
    if (userdetails && userdetails.userBean.userType === 'user') {
      return true;
    } else {
      return false;
    }
  }
  isLoggedIn() {
    const logindata = JSON.parse(localStorage.getItem('panel'));
    if (logindata) {
      return true;
    } else {
      return false;
    }
  }

  logout() {
    localStorage.removeItem("panel");
    this.router.navigateByUrl("/");
  }
}
