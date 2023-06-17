import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  isLoading = true;

  ngOnInit() {
    // Simulando um tempo de carregamento de 2 segundos
    setTimeout(() => {
      this.isLoading = false;
    }, 2000);
  }
}