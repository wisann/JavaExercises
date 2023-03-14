//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
import java.util.Scanner;

public class Exercicio2 { 

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		while (x > 0 && y > 0) {
			System.out.println("Primeiro quadrante");
			x = s.nextInt();
			y = s.nextInt();
		}
		while (x < 0 && y > 0 ) {
			System.out.println("Segundo quadrante");
			x = s.nextInt();
			y = s.nextInt();
	}
		while (x > 0 && y < 0) {
			System.out.println("Terceiro quadrante");
			x = s.nextInt();
			y = s.nextInt();
		}
		while (x < 0 && y < 0) {
			System.out.println("Quarto quadrante");
			x = s.nextInt();
			y = s.nextInt();
		
		}

		s.close();
}}
