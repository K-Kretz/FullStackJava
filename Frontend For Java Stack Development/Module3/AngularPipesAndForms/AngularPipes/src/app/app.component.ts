import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'PipesAndForms';

  value: string = "Hello Angular!";
  cureentDate: Date = new Date();
  amount: number = 99.99;
}
