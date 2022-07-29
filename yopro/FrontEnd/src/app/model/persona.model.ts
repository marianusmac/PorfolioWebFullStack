export class persona{
  id?: number;
  nombre: string;
  apellido: string;
  img: string;
  email: string;
  titulo: string;
  nacionalidad: string;
  nacimiento: string;
  sobremi: string;

  constructor(nombre: string, apellido: string, img: string, email: string, titulo: string, nacionalidad: string, nacimiento: string, sobremi: string){
    this.nombre = nombre;
    this.apellido = apellido;
    this. img = img;
    this.email = email;
    this.titulo = titulo;
    this.nacionalidad = nacionalidad;
    this.nacimiento = nacimiento;
    this.sobremi = sobremi;
  }
}