public class Aluno
{

    String nome;
    int nota; 
    
    public boolean estaAprovado(){
        return (nota >= 7);
    }
    
    public Aluno(String n, int nt){
        nome = n;
        nota = nt; 
    }
    
    
    public Aluno(String n){
        nome = n; 
    }
    
}


