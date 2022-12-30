package OO1.Polimorfismo;

public class Pessoa {

    private double peso;

    public Pessoa(double peso){
        setPeso(peso);
    }
    //Polimorfismo din�mico usa classe gen�rica e no main
    public void comer(Comida comida){
        this.peso += comida.getPeso();
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
