import { Component, OnDestroy,  OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  standalone: true,
  selector: 'app-root',
  imports: [CommonModule],
  template: `

  <h1>Hello World!</h1>

  <p *ngIf="initialized">This is Angular Life Cycle Example</p>

  `,
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit{

  initialized: boolean = false;

  constructor(){
    console.log('Constructor called')
  }

  ngOnInit(): void {
      this.initialized=true;
      console.log('Component Initialized')
  }
}
