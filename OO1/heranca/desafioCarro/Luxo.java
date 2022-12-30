package OO1.heranca.desafioCarro;

public interface Luxo {

    //por padrão todos os métodos em interface são públicos e abstratos
    /*public abstract */void ligarAr();
    void desligarAr();

    default int velociadeDoAr(){
        return 1;
    }
}
