package application;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Livro;
import model.services.CarrinhodeCompras;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo!");
		System.out.print("Qual o nome do livro?: ");
		String nome = sc.next();
		System.out.print("Qual o preço do livro?: ");
		double preco = sc.nextDouble();
		Livro livro = new Livro(nome, preco);
		System.out.println("Qual a quantidade?: ");
		int quantidade = sc.nextInt();
		CarrinhodeCompras carrinho = new CarrinhodeCompras(List.of(livro));
		double valorTotal = carrinho.calcularValorTotal() * quantidade;
		System.out.println("o preço total é: " + valorTotal);
		sc.close();
	}

}
