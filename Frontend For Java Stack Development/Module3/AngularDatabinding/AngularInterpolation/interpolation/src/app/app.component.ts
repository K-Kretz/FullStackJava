import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  //templateUrl: './app.component.html',
  template: `

    <h1>{{title}}</h1>
    <p>{{message}}</p>

    <p>The Length of the message1 is {{message1.length}}</p>
    <p>The result of 2 + 2 = {{2+2}}</p>
  `,
  styleUrl: './app.component.css'
})
export class AppComponent {
    
    //Binding Component Properties
    title = 'Welcome to Angular';
    message = 'this is an example';

    //Expression Evaluations
    message1 = 'this a new expression message';
}

