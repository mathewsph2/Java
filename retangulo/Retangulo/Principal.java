

public class Principal
{
    public static void main(String[] args){
        
        Retangulo r1 = new Retangulo ();
        
        r1.comprimento = 10;
        r1.largura = 5; 
        
        System.out.println("Área: " + r1.area());
        System.out.println("Perímetro: " + r1.perimetro());
         
        
    }
   
}