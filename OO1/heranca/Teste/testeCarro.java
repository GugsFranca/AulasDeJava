package OO1.heranca.Teste;

import OO1.heranca.desafioCarro.Carro;
import OO1.heranca.desafioCarro.Civic;
import OO1.heranca.desafioCarro.Ferrari;

public class testeCarro {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        Carro civic = new Civic(120);

        civic.acelerar(civic);
        civic.acelerar(civic);
        civic.acelerar(civic);
        civic.frear(civic);
        System.out.println(civic);

        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.frear(ferrari);
        System.out.println(ferrari);


        ferrari.ligarTurbo();//antes de acelerar né lol
        ferrari.ligarAr();
        ferrari.acelerar(ferrari);
        System.out.println(ferrari.velociadeDoAr());
        ferrari.desligarAr();
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);
        ferrari.acelerar(ferrari);


        System.out.println(ferrari);

        civic.acelerar(civic);
        civic.acelerar(civic);
        civic.acelerar(civic);
        civic.acelerar(civic);
        civic.acelerar(civic);

        System.out.println(civic);
    }
}
