import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {
  title = 'ReactiveForms';

  myForm: FormGroup = new FormGroup({});

  constructor(private formBuilder: FormBuilder){

  }

  ngOnInit():void{
    this.myForm = this.formBuilder.group({

      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
    })
  }



  submitForm(){
    console.log("submit form");
  }


}
