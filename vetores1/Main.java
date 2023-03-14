package vetores1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n; 

		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		int [] vect = new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("digite um numero: ");
			vect[i] = sc.nextInt();
					
		}
		System.out.println("Numeros negativos: ");
		for(int i=0;i<n;i++) {
			if (vect[i] < 0) {
				System.out.print(vect[i]);
			}
		}
		sc.close();
	}

}
