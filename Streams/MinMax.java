package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import Controle.IfElse;

public class MinMax {
    public static void main(String[] args) {

    Aluno a1 = new Aluno("Ana", 7.1);
    Aluno a2 = new Aluno("Luna", 6.1);
    Aluno a3 = new Aluno("Gui", 8.1);
    Aluno a4 = new Aluno("Gabi", 10);

    List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);

    Comparator<Aluno> melhornota = (alun1, alun2) -> {
        if (alun1.nota > alun2.nota) return 1;
        if (alun1.nota < alun2.nota) return -1;
        return 0;
    };
    Comparator<Aluno> piornota = (alun1, alun2) -> {
        if (alun1.nota > alun2.nota) return -1;
        if (alun1.nota < alun2.nota) return 1;
        return 0;
    };

    System.out.println(alunos.stream().max(melhornota).get());
    System.out.println(alunos.stream().min(piornota).get());

    System.out.println(alunos.stream().max(piornota).get());
    System.out.println(alunos.stream().min(melhornota).get());


}
}
