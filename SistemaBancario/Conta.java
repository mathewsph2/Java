

public class Conta
{
    private String numero;
    private double saldo; 
    private Cliente correntista; 
    private Banco banco; 
    
    
    
    public Conta(String numero, Cliente clilente, Banco banco){
        this.numero = numero;
        this.correntista = correntista;
        this.banco=banco;
        this.saldo=0; 
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor; 
        }
        
    }
    
    public void sacar(double valor){
        if (saldo >= valor && valor > 0){
            saldo -=valor; 
        }
        
    }
    
    
    public void setNome(String nome){
        this.numero=numero;
    }
    public String getNome(){
        return nome; 
    }
    
    
    
    
   
}