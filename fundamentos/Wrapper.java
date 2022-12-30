package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		Float f =100000F;
		Double d = 1000.100;
		Boolean bo = true;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i.toString());
		System.out.println(l);
		System.out.println(f / d);
		
		System.out.println(bo.toString().toUpperCase());
	}
}
