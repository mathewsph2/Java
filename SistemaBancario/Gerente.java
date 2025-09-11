

public class Gerente extends Pessoa
{
   // private Banco banco;
   
   public Gerente(){
       
   }
   
   public Gerente(String nome, String cpf, int idade, char sexo, double salario){
       
       this.nome = nome; 
       // super.nome = nome; 
       setCpf(cpf);
       setIdade(idade);
       setSexo(sexo);
       setSalario(salario); 
       
       
   }
}