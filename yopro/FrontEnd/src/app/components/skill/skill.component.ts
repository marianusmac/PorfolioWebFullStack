import { Component, OnInit } from '@angular/core';
import { Skill } from 'src/app/model/skill.model';
import { SkillServiceService } from 'src/app/service/skill.service';
import { TokenService } from 'src/app/service/token.service';


@Component({
  selector: 'app-skill',
  templateUrl: './skill.component.html',
  styleUrls: ['./skill.component.css']
})
export class SkillComponent implements OnInit {

  radius:number=100;
  modalSwitch: boolean=false;
  skillsList:Skill[]=[];
  roles!: string[];
  isAdmin = false;

  constructor(private skillsDataService: SkillServiceService, private tokenService: TokenService) { }
    
  ngOnInit():void {

    this.cargarSkill();
    this.roles = this.tokenService.getAuthorities();
    this.roles.forEach(rol => {
      if (rol === 'ROLE_ADMIN') {
        this.isAdmin = true;
      }
    });
  }
   
  outerStrokeColor:string=this.color();

  skillColor(progress:number):string{
    if(progress!==0){
      this.outerStrokeColor=this.color();
    }return this.outerStrokeColor
  }

cargarSkill():void{
  this.skillsDataService.getAllSkill().subscribe((data:any[])=>{
    console.log(data);
    this.skillsList=data;
  })
  }

  delete(skill: Skill): void{
    this.skillsList= this.skillsList.filter(p => p.id !== skill.id)
    this.skillsDataService.deleteSkill(this.skillsList, skill).subscribe();
  }


  openModal(){
    this.modalSwitch = true;

  }

  color():string{
    let bg_colour:string="";
    bg_colour= Math.floor(Math.random() * 16777215).toString(16);
      bg_colour = "#" + ("000000" + bg_colour).slice(-6);
      console.log(bg_colour);
      return bg_colour;
      
    }
}



