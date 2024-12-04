import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'eventBinding';


//Binding Event Handlers
  onButtonClick(){
    console.log("clicked");
  }

//Event Data
  onKeyUp(event: any){
    console.log("Key PRessed: ", event.key);
  }
}
