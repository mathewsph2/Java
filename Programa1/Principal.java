import java.util.Scanner; 

public class Principal
{
    
    public static void main(String[] args){
        
        Scanner le = new Scanner(System.in);
        
        System.out.println("## ALUNOS ##");
        
        System.out.println("## Informe o nome do aluno 1: ##");
        
        Aluno a1;
        a1 = new Aluno(le.nextLine());
        System.out.println("## Informe a nota do aluno 1: ##");
        a1.nota = le.nextInt();
        
        System.out.println("## Informe o nome do aluno 2: ##");
        
        le.nextLine();
        
        Aluno a2 = new Aluno(le.nextLine());
        
        System.out.println("## Informe a nota do aluno 2: ##");
        
        a2.nota = le.nextInt();
        
        if(a1.estaAprovado()){
            System.out.println(" ALUNO "+a1.nome+" esta aprovado");
        }
            else {
                        System.out.println(" ALUNO "+a1.nome+" esta Reprovado");

            }
            
            
            if(a2.estaAprovado()){
            System.out.println(" ALUNO "+a2.nome+" esta aprovado");
        }
            else {
                        System.out.println(" ALUNO "+a2.nome+" esta Reprovado");

            }
        
            Professor p = new Professor(a1, a2);
            System.out.println("\n# aluno com maior nota " +p.maiorNota().nome);
        
        }
        
    }

