import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Proyecto } from 'src/app/model/proyecto.model';
import { ProyectoService } from 'src/app/service/proyecto.service';

@Component({
  selector: 'app-edit-proyecto',
  templateUrl: './edit-proyecto.component.html',
  styleUrls: ['./edit-proyecto.component.css']
})
export class EditProyectoComponent implements OnInit {
  editPro: Proyecto = null;

  constructor(private proyectoService: ProyectoService, private activatedRouter: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.proyectoService.detail(id).subscribe(
      data =>{
        this.editPro = data;
      }, err =>{
        alert("Error al modificar proyecto");
        this.router.navigate(['']);
      }
    )
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.proyectoService.update(id, this.editPro).subscribe(
      data => {
        this.router.navigate(['']);
      }, err =>{
         alert("Error al modificar proyecto");
         this.router.navigate(['']);
      }
    )
  }
}
