import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-viewemployee',
  templateUrl: './viewemployee.component.html',
  styleUrls: ['./viewemployee.component.css']
})
export class ViewemployeeComponent implements OnInit {


  viewemployees: any[];

  constructor(private authservice: AuthService, private router: Router) {
    this.viewemployee();
  }

  ngOnInit() {
  }

  viewemployee() {
    this.authservice.employeelist('employee').subscribe(data => {
      console.log(data)
      this.viewemployees = data.userList;
    }, err => {
      console.log(err);
    });
  }

}
