package Controle;

public class Break {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i == 5) {
				break;//para laços de repetição e não o IF
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
