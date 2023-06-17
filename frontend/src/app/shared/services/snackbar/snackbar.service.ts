import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable()
export class SnackbarService {
  constructor(private snackBar: MatSnackBar) {}

  showSnackBar(message: string, panelClass: string): void {
    this.snackBar.open(message, '', {
      duration: 2000,
      panelClass: [panelClass],
    });
  }
}