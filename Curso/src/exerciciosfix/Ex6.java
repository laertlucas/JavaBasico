package exerciciosfix;

public class Ex6 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;
		
		System.out.println(num2);
		System.out.println(num1);
		
		for(int i = 0; i < 100; i++) {
			num1 = num1 + num2;
			num2 = num1 - num2;
			
			System.out.println(num1);
		}
	}

}
