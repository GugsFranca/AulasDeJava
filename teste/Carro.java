package teste;

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
            System.out.println("Voc� ja est� parado");
        }
    }

    public String toString(){
        return "Sua velocidade � de: "+velocidade+"KM/h";
    }
}
