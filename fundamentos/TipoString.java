package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));//concat adiciona algo na string
		System.out.println(s + "!!!!");//Faz a mesma coisa que o concat
		System.out.println(s.startsWith("Boa"));//Pergunta se começa ou não com Boa
		System.out.println(s.startsWith("tarde"));//teste para ver se é burro
		System.out.println(s.toLowerCase().startsWith("boa"));//Lower case faz a frase toda ser minuscula
		System.out.println(s.toUpperCase().endsWith("TARDE"));// P contrario de lower e Upper
		System.out.println(s.length());//Verifica quantos caracteries tem
		System.out.println(s.toLowerCase().equals("boa tarde"));// equals verifica a igualdade do que é verificado
		System.out.println(s.equalsIgnoreCase("boa TarDe"));// Somoando com IgnoreCase ignora caps ou não
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12324.546;
		
		String outraFrase = String.format("Nome: " + nome + "\nSobrenome: " + sobrenome
				+ "\nIdade: " + idade + "\nSalario: " + salario +"\n");
		System.out.println(outraFrase);		
				
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome
				+ "\nIdade: " + idade + "\nSalario: " + salario +"\n");
		
		//Identico ao printf do c++
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualque".contains("qual"));//verifica se tem na frase
		System.out.println("Frase qualque".indexOf("qual"));//Verifica onda essa palavra ta na frase
		
	}
}
