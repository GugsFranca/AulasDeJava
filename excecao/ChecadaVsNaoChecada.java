package excecao;


public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
       try {
        geraErro1();     
    } catch (Exception e) {
        System.out.println(e.getMessage());
    } 

        try {
          geraErro2();
        } catch (Exception e) {
            System.out.println("SLC DEU ERRO????" + e.getMessage());
        }
        
    }
    //Exceção NÃO checada ou NÃO verificada //não tem necessidade do throws
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro BiZarRo XD");//Qualquer outra como a ArithmeticException
    }
    //Exceção checada ou verificada //O Exception obrigatoriamente tem que ter o throws para ser lançado
    static void geraErro2() throws Exception{ 
        throw new Exception("Erro todo CaGaDo -_-");
    }
}
