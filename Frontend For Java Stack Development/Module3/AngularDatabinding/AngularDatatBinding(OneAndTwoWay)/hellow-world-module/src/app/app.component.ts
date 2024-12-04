import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  
  //One way Binding, the data has flown from component to HTML
  status = 'pending';

  //Two way Binding, 
  country = 'US';

  displayCountry(){
    status = this.country;
  }
}
