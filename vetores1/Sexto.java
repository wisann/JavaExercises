package vetores1;

import java.util.Locale;
import java.util.Scanner;

public class Sexto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int n, c;
		System.out.println("Quantos valores vai ter cada vetor?: ");
		n = sc.nextInt();
		int[] vect = new int [n];
		int[] vect2 = new int [n];
		int[] vect3 = new int[n];
		System.out.println("Vetor 1 ");
		for(int i=0;i<n;i++) {
			System.out.println("digite um numero: ");
			vect[i] = sc.nextInt();
		}
		c = 0;
		System.out.println("Vetor 2");
		for(int i=0;i<n;i++) {
			System.out.println("digite um numero: ");
			vect2[i] = sc.nextInt();
		}
		System.out.println("Vteor 3");
		
		for(int i=0;i<n;i++) {
			vect3[i] = vect[i] + vect2[i];
		}
		System.out.println("a soma é" + c);
		 for (int i=0; i<n; i++) {
		    	System.out.printf("%d\n", vect3[i]);}
		sc.close();
	}

}
