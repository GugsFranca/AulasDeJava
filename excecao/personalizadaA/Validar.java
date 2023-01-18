package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {
    
    private Validar(){}
    public static void usuario(Aluno aluno){
        
        if(aluno == null){
            throw new IllegalArgumentException("O aluno está nulo!!!");
        }
        if(aluno.nome == null || aluno.nome.trim().isEmpty()){ //trim tira os espaços em branco
            throw new StringVaziaException("nome");
        }
        if(aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaIntervaloException("nota");
        }
    }
}