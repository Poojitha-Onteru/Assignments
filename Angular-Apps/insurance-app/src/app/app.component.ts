import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
 import { Navbar } from './shared/navbar/navbar';

@Component({
  selector: 'app-root',
  imports: [RouterModule, Navbar],
  standalone:true,
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Insurance Service Portal';
}
