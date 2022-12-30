package OO1.heranca.desafioCarro;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int aceleracao;
    private int delta = 5;

    protected Carro(int velociadeMaxima){
        VELOCIDADE_MAXIMA = velociadeMaxima;
    }

    public void acelerar(Carro carro) {
        if (aceleracao + getDelta() > VELOCIDADE_MAXIMA) {
            aceleracao = VELOCIDADE_MAXIMA;
        } else {
            aceleracao += getDelta();
        }
    }
    public void frear(Carro carro){
        if (aceleracao != 0){
            aceleracao -= 5;
        }
    }
    public int getDelta(){
        return delta;
    }
    public void setDelta(int delta){
        this.delta = delta;
    }


    public String toString(){
        return "Velocidade atual é " + aceleracao + "Km/h.";
    }
}
