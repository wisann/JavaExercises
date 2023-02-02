package vetores1;

import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n,pares ;
		System.out.println("Quantos numeros voce vai digitar?: ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("digite um numero: ");
			vect[i] = sc.nextInt();
			
		}
	    System.out.println("NUMEROS PARES:");

		pares = 0;
		for(int i=0;i<n;i++) {
			if (vect[i] % 2 == 0) {
	        	System.out.println(vect[i]);
	            pares++;
		}
			
		System.out.println("QUANTIDADE DE PARES = " + pares);
		
		sc.close();
	}
	}}
