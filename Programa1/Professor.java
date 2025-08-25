public class Professor
{
    
Aluno aluno1, aluno2;

public Professor(Aluno a1, Aluno a2){
    aluno1 = a1;
    aluno2 = a2;
}


public Aluno maiorNota(){
    
    if(aluno1.nota > aluno2.nota){
        return aluno1;
    }
    return aluno2;
    
}

}

