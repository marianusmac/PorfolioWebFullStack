export class Educacion {
  id? : number;
  institucionEdu : string;
  descripcionEdu : string;
  fechaEdu : string;
  imagenEdu : string;


  constructor(institucionEdu: string, descripcionEdu: string, fechaEdu: string, imageEdu: string){
      this.institucionEdu = institucionEdu;
      this.descripcionEdu = descripcionEdu;
      this.fechaEdu = fechaEdu;
      this.imagenEdu = imageEdu;

  }
}