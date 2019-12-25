import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-adduser',
  templateUrl: './adduser.component.html',
  styleUrls: ['./adduser.component.css']
})
export class AdduserComponent implements OnInit {

message: string;
  constructor(private authservice: AuthService) {
  }

  ngOnInit() {
  }

  addemployee(registerform: NgForm) {
    console.log(registerform.value);
    this.authservice.addemployee(registerform.value).subscribe(data => {
     console.log(data);
    })
  }
}
