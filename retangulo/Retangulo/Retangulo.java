public class Retangulo
{
    double comprimento;
    double largura;
    
    // Construtor Padrão 
    public Retangulo(){
    }
    
    // Método para calcular a área 
    public double area(){
        double area = this.comprimento * this.largura;
        return area;
    }
    
    
    // Método para calcular o perímetro
    public double perimetro(){
        double perimetro = this.comprimento + this.comprimento + this.largura + this.largura; 
        return perimetro; 
    }
}