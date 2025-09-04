

public class Principal
{
   public static void main (String [] args){
       
   Pessoa p1 = new Pessoa();
   
   p1.nome = "Matheus";
   p1.anoNascimento = 2007; 
   p1.email = "matheuspribeiro@gmail.com"; 
       
   
    System.out.println("A pessoa tem " + p1.calcularIdade() + " anos.  \nÉ maior de idade? " + p1.maiorDeIdade());

   }
}