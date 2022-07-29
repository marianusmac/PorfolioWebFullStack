import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Educacion } from 'src/app/model/educacion.model';
import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-new-educacion',
  templateUrl: './new-educacion.component.html',
  styleUrls: ['./new-educacion.component.css']
})
export class NewEducacionComponent implements OnInit {
  institucionEdu: string = '';
  descripcionEdu: string = '';
  fechaEdu: string = '';
  imagenEdu: string = '';

  constructor(private educacionService: EducacionService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const educa = new Educacion(this.institucionEdu, this.descripcionEdu, this.fechaEdu, this.imagenEdu);
    this.educacionService.save(educa).subscribe(
      data => {
        alert("Educación añadida");
        this.router.navigate(['']);
      }, err => {
        alert("Falló");
        this.router.navigate(['']);
      }
    )
  }

}