package OO1.heranca.Teste;

import OO1.heranca.jogo.Direcao;
import OO1.heranca.jogo.Heroi;
import OO1.heranca.jogo.Jogador;
import OO1.heranca.jogo.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Jogador monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi(10, 11);

        System.out.println(monstro.vida);
        System.out.println(heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.OESTE);

        monstro.atacar(heroi);
        heroi.atacar(monstro);




        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem ==> " + monstro.vida);
        System.out.println("Herói tem ==> " + heroi.vida);

        System.out.println("O Monstro esta em ==> " + " xy("+monstro.x +","+monstro.y+")");
        System.out.println("O Herói esta em ==> " + " xy("+heroi.x +","+heroi.y+")");

    }
}
