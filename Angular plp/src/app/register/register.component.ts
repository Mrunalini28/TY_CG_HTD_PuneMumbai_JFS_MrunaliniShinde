import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor( public authService : AuthService) { }

  message : string;
  register(registerform : NgForm) {
    console.log(registerform.value);
    this.authService.register(registerform.value).subscribe(response => {
      console.log(response);
      if(response.statusCode === 200) {
        this.message= "Register Successfully";
        registerform.reset();
      }else{
        this.message= response.description;
      }
    })
  }

  ngOnInit() {
  }

}
