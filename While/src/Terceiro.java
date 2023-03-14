import java.util.Scanner;

public class Terceiro {
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); {
		int alcool = s.nextInt();
		int gasolina = s.nextInt();
		int diesel = s.nextInt();
		int fim = s.nextInt();
		
		
		
		while (alcool == 1 && alcool <=4) {
			alcool = alcool + 1;
			alcool = s.nextInt();
		}
		while (gasolina == 2 && gasolina <=4) {
			gasolina = gasolina + 1;
			gasolina = s.nextInt();
		}
		while (diesel == 3 && diesel <=4) {
			diesel = diesel + 1;
			diesel = s.nextInt();
		}
		if (fim == 4) {
			System.out.println("Muito obrigado");
		
		System.out.println("Muito obrigado");
		System.out.println("Alcool " + alcool);
		System.out.println("Gasolina " + gasolina);
		System.out.println("Diesel " + diesel);
		

	}


}}}
