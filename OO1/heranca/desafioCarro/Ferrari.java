package OO1.heranca.desafioCarro;

public class Ferrari extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo;
    private boolean ligarAr;

   public Ferrari(){
        this(315);
    }
    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    public void frear(Carro carro){
        if (aceleracao != 0){
            aceleracao -= getDelta();

        }
    }

    @Override
    public void ligarTurbo() {
       ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
       ligarTurbo = false;
    }

    public void ligarAr() {
       ligarAr = true;
    }
    public void desligarAr(){
        ligarAr = false;
    }

    @Override
    public int getDelta() {
       if (ligarTurbo && !ligarAr){
        return 35;
       }else if (ligarTurbo && ligarAr){
           return 30;
       }else if (!ligarTurbo && !ligarAr){
           return 20;
       }
       return 15;
    }

    //    @Override
////    void acelerar(Carro carro){
////        aceleracao += 15;
////   }

}
