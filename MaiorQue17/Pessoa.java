import java.time.LocalDate;

public class Pessoa
{
    String nome;
    int anoNascimento; 
    String email; 
    
    public Pessoa(){
        
    }
    
    public int calcularIdade(){
        int idade = LocalDate.now().getYear() - this.anoNascimento; 
        
        return idade; 
        }
        
        public boolean maiorDeIdade(){
            return calcularIdade() > 17; 
        }
    }
