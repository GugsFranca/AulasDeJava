package OO1.heranca.desafioCarro;

public interface Luxo {

    //por padr�o todos os m�todos em interface s�o p�blicos e abstratos
    /*public abstract */void ligarAr();
    void desligarAr();

    default int velociadeDoAr(){
        return 1;
    }
}
