export class Skill{
    
  id?:number;
  nombreSkill:string;
  porcentajeSkill:number;
  imagenSkill:string;

  constructor(nombreSkill:string,porcentajeSkill:number,imagenSkill:string){
      
      this.nombreSkill=nombreSkill;
      this.porcentajeSkill=porcentajeSkill;
      this.imagenSkill=imagenSkill;
      

}
}
