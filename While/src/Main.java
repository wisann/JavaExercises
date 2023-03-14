//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);{

		int senha = s.nextInt();
		int senhaCorreta = 2002;

		while (senha != senhaCorreta) {
		System.out.println("Senha Invalida");
		senha = s.nextInt();
	
	}
		System.out.println("Acesso Permitido!");
		s.close();
}
}}
