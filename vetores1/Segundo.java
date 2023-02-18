package vetores1;

import java.util.Scanner;

public class Segundo {
	public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	int n;
	System.out.println("Quantos numeros voce vai digitar?: ");
	n = sc.nextInt();
	int[] vect = new int[n];
	
	for(int i=0;i<n;i++) {
		System.out.println("digite um numero: ");
		vect[i] = sc.nextInt();
	}
	int soma = 0;
	for(int i=0;i<n;i++) {
		soma += vect[i];
	}
	System.out.println("Valores: ");

    for (int i=0; i<n; i++) {
    	System.out.print( vect[i]+ " ");
    
    }
    System.out.println();
	System.out.println("Soma: " + soma);
	int media = soma/n;
	System.out.println("Media:" + media);
	
	
	
	sc.close();
	
	
	
}}
