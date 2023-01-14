package excecao;

public class basico {
    public static void main(String[] args) {
        Aluno a1 = null;

        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro na impressão do usuário");
        }
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Divir por zero da nada BLEEEH XD");
        }

        System.out.println("Fim :)");
    }

    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
