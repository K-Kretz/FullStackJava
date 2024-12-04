import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'propertyBinding';

//Property Binding Component Properties to Element Properties
  isButtonDisabled = "true";

  //Expression Evaluation
  getInitialValue() {
    return "Initial Value";
  }
}
