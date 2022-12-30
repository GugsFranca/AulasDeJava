package fundamentos.Operadores;

public class OperadorTernario {
	public static void main(String[] args) {
		
		double media = 7.9;
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);
		
		boolean passoupormedia = media >= 7;
		boolean bomcomportamento = true;
		boolean temdesconto = bomcomportamento && passoupormedia;
		String resultado = temdesconto ? "Sim!" : "Não.";
		
		System.out.printf("O aluno tem desconto? %s " , resultado);
	}
}
