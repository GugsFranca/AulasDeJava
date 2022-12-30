package OO1.composicao.Carro;

public class Carro {

    Motor motor;
    Porta porta;
    Carro() {
        this.motor = new Motor(this);
        this.porta = new Porta();
    }
    boolean portaAberta(){
        return porta.aberta = true;
    }
    boolean portaFechada(){
        return porta.aberta = false;
    }

    void acelerar(){
        if (motor.fatorInjecao < 2.5){
        motor.fatorInjecao += 0.4;}
    }
    void frear() {
        if (motor.fatorInjecao > 0.5){
          motor.fatorInjecao -= 0.4;}
    }

    void ligado(){
        motor.ligado = !porta.aberta;

    }
    void desligado(){
        motor.ligado = false;
    }
    boolean estaLigado(){
        return motor.ligado;
    }
}
