import { NgModule } from "@angular/core";
import { MatButtonModule } from "@angular/material/button";
import { MatCardModule } from '@angular/material/card';
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatIconModule } from "@angular/material/icon";
import { MatInputModule } from '@angular/material/input';
import { MatTableModule } from "@angular/material/table";
import { MatToolbarModule } from "@angular/material/toolbar";
import {MatSnackBarModule} from '@angular/material/snack-bar';
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner'
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {MatMenuModule} from '@angular/material/menu';


@NgModule({
    declarations: [],
    imports: [    
        MatProgressBarModule,
        MatProgressSpinnerModule,
        MatTableModule,
        MatToolbarModule,
        MatButtonModule,
        MatIconModule,
        MatCardModule,
        MatInputModule,
        MatFormFieldModule,
        MatSnackBarModule,
        MatMenuModule
    ],
    exports: [    
        MatProgressBarModule,
        MatProgressSpinnerModule,
        MatTableModule,
        MatToolbarModule,
        MatButtonModule,
        MatIconModule,
        MatCardModule,
        MatInputModule,
        MatFormFieldModule,
        MatSnackBarModule,
        MatMenuModule
    ],
})
export class MaterialModule {}