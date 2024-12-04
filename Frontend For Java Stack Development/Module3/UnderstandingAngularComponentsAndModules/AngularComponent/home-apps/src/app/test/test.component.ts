import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-test',
  standalone: true,
  imports: [CommonModule],
  template: `
    <p>
      test works!
    </p>
  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent {

}
