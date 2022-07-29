export class Proyecto {
  id? : number;
  nombrePro : string;
  descripcionPro : string;
  fechaPro : string;
  imagenPro : string;


  constructor(nombrePro: string, descripcionPro: string, fechaPro: string, imagePro: string){
      this.nombrePro = nombrePro;
      this.descripcionPro = descripcionPro;
      this.fechaPro = fechaPro;
      this.imagenPro = imagePro;

  }
}