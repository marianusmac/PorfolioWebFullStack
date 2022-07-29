import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Proyecto } from 'src/app/model/proyecto.model';
import { ProyectoService } from 'src/app/service/proyecto.service';

@Component({
  selector: 'app-new-proyecto',
  templateUrl: './new-proyecto.component.html',
  styleUrls: ['./new-proyecto.component.css']
})
export class NewProyectoComponent implements OnInit {
  nombrePro: string = '';
  descripcionPro: string = '';
  fechaPro: string = '';
  imagenPro: string = '';

  constructor(private proyectoService: ProyectoService, private router: Router) { }

  ngOnInit(): void {
  }

  onCreate(): void {
    const proye = new Proyecto(this.nombrePro, this.descripcionPro, this.fechaPro, this.imagenPro);
    this.proyectoService.save(proye).subscribe(
      data => {
        alert("Proyecto añadido");
        this.router.navigate(['']);
      }, err => {
        alert("Proyecto existente");
        this.router.navigate(['']);
      }
    )
  }

}