package OO1.composicao.Curso;

public class CursoTeste {
    public static void main(String[] args) {

    Aluno aluno1 = new Aluno("Marcos");
    Aluno aluno2 = new Aluno("Pedro");
    Aluno aluno3 = new Aluno("Jao");

    Curso curso1 = new Curso("Java Basico");
    Curso curso2 = new Curso("Web 2023");
    Curso curso3 = new Curso("Sistemas Informacao");

    curso1.adicionarAluno(aluno1);
    curso1.adicionarAluno(aluno3);

    curso2.adicionarAluno(aluno3);
    curso2.adicionarAluno(aluno2);

  aluno1.adicionarCurso(curso3);
  aluno2.adicionarCurso(curso3);
  aluno3.adicionarCurso(curso3);

  for (Aluno aluno: curso1.alunos){
      System.out.println("Estou matriculado no curso " + curso1.nome);
      System.out.print(" e o meu nome e" + aluno.nome + "e o meu nome e " + aluno.nome);
      System.out.println("\n");
  }
        System.out.println(aluno3.cursos.get(0));
        System.out.println(aluno3.cursos.get(0).alunos);

        var Encontrar = aluno3.obterCursoPorNome("wEB 2023");

    if (Encontrar != null){
        System.out.println(Encontrar);
        System.out.println(Encontrar.alunos);

    }

    }
}
