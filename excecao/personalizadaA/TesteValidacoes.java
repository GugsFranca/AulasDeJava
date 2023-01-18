package excecao.personalizadaA;


import excecao.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Ana", 7);;

        try {        
            Validar.usuario(aluno);
            Validar.usuario(null);
        } 
        catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Fim :)");
    }
}
