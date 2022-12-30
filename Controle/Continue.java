package Controle;

public class Continue {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1)
				continue;//continue pula a interação que ta acontecendo
			System.out.println(i);	
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			if(i == 5) 
				continue;
			
			System.out.println(i);
		}
	}
}

