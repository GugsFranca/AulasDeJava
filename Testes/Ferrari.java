package Testes;

public class Ferrari extends Carro{

    Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        acelercao = 20;
        frenagem = 5;
    }
    //aceleração = ++ 15
    //frear = 5
   @Override
   public void acelerar() {
       super.acelerar();
   }
    @Override
    public void frear() {
        super.frear();
    }
}
