import java.util.ArrayList; 
public class Banco 
{
    
    private String cnjp;
    private Gerente gerente; 
    private ArrayList<Conta> contas;
    
    public Banco(){}
    
    public Banco (String nome, String cnpf,
    Gerente gerente){
        this.nome =nome;
        this.cnpj = cnpj;
        this.gerente=gerente; 
        
       public void setGerente(Gerente gerente){
            this.gerente = gerente;
        }
        
               
    }
