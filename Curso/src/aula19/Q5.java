package aula19;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * i;
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
		}
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i]);
		}
	}

}
