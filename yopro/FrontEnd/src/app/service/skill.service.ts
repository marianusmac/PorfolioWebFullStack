import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { catchError, Observable, of } from 'rxjs';
import { Skill } from '../model/skill.model';

@Injectable({
  providedIn: 'root'
})
export class SkillServiceService {

  skillUrl = 'https://porfoliomn.herokuapp.com'
  // skillUrl = 'http://localhost:8080'

  
  constructor(private http:HttpClient) { }

  private handleError<T>(operation = 'operation', result?: T){
    return (error: any): Observable<T> => {
      console.error(error); 
      console.log(`${operation} failed: ${error.message}`);
      return of(result as T);
  }
}

  getAllSkill(): Observable<Skill[]>{
    return this.http.get<Skill[]>(this.skillUrl+'/skill/lista').pipe(
      catchError(this.handleError<Skill[]>('getAllSkill',[]))
  );
}
  public saveSkill(newSkill:Skill):Observable<any>{
    return this.http.post<any>(this.skillUrl + '/skill/create',newSkill);
  }

  public getSkill(id: number):Observable<Skill> {
    return this.http.get<Skill>(this.skillUrl + `/skill/detail/${id}`);
  }
 
  public updateSkill(id:number,skill:Skill):Observable<any>{
    return this.http.put<any>(this.skillUrl + `/skill/update/${id}`,skill);
  }

  public deleteSkill(skillsList: Skill[], skillParaBorrar: Skill ): Observable<Skill> {
    skillsList.filter(p => p.id !== skillParaBorrar.id)
    return this.http.delete<any>(this.skillUrl + "/skill/delete/" + skillParaBorrar.id);
  }

}


