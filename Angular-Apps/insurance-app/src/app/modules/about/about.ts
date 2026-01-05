import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-about',
  imports: [RouterModule,CommonModule],
  templateUrl: './about.html',
  standalone:true,
  styleUrl: './about.css',
})
export class About {

}
