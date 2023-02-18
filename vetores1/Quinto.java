package vetores1;

import java.util.Scanner;

public class Quinto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, posicao;
		
		System.out.println("Quantos numeros voce vai digitar?: ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("digite um numero: ");
			vect[i] = sc.nextInt();
		}
		posicao = 0;
		double max = vect[0];
	      for (int i = 1; i < n; i++) {
	         if (vect[i] > max) {
	        	 max = vect[i];
	         	 posicao = i;}}
	      
	      
	    System.out.println("O maior valor é: " + max);
	    System.out.println("Posição do maior valor: " + posicao);
		sc.close();
	      
		
	}

}
