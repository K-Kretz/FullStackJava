import { Component, Input, Output } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  standalone: true,
  selector: 'app-root',
  imports: [CommonModule],
  template: `<h1>Hello World!</h1>`,
  styleUrls: ['./app.component.css'],
})

export class AppComponent {
  title = 'homes';
  @Input() data!: string;
  @Output() params!: string;
}
