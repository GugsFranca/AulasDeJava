package fundamentos.Operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean cond1 =true;
		boolean cond2 = 2<1;
		
		System.out.println(cond1 && !cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);
		System.out.println(!!cond1);
		System.out.println(!cond2);
		
		System.out.println("\nTabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
//	    System.out.println(false && true);
//	    System.out.println(false && false);
	    
	    System.out.println("\nTabela verdade OU (OR)");
//	    System.out.println(true || true);
//	    System.out.println(true || false);
	    System.out.println(false || true);
	    System.out.println(false || false);
	    
	    System.out.println("\nTabela verdade ou exclusivo (XOR)");//xor não funciona 
	     System.out.println(true ^ true);						//quando temos dois iguais
	    System.out.println(true ^ false);
	    System.out.println(false ^ true);
	    System.out.println(false ^ false);					
	   
	    
	    System.out.println("\nTabela verdade NOT (not)");
	    System.out.println(!true);
	    System.out.println(!false);
	  
	}
}
