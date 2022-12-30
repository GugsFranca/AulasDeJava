package Testes;

public class Carro {
    final int VelocidadeMaxima;
    int velocidade = 0;
    int acelercao = 5;
    int frenagem = 2;

    Carro(int velocidadeMaxima){
        this.VelocidadeMaxima = velocidadeMaxima;
    }
    public void acelerar(){
        if(velocidade>=VelocidadeMaxima){
            velocidade = VelocidadeMaxima;
        }else{
            velocidade += acelercao;
        }
    }
    public void frear(){
        if (velocidade > 0 ){
            velocidade -=  frenagem;
        }else{
            System.out.println("Você ja está parado");
        }
    }

    public String toString(){
        return "Sua velocidade é de: "+velocidade+"KM/h";
    }
}
