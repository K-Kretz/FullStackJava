import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TestComponent } from './test/test.component';

@Component({
  standalone: true,
  imports: [CommonModule,TestComponent],
  selector: 'app-root',
  template: `

  <div>Welcome</div>
  <app-test></app-test>

  `,
  styleUrls: ['./app.component.css'],
})

export class AppComponent {
  title = 'homes';
}
