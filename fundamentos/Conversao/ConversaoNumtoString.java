package fundamentos.Conversao;

public class ConversaoNumtoString {
	public static void main(String[] args) {
		Integer num1 = 100;
		System.out.println(num1.toString().length());
		
		int num2 = 1000;
		System.out.println(("" + num2).length());
		System.out.println(Integer.toString(num2).length());
	}
}
