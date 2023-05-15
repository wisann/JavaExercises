package model.services;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
	private List <Product> lista = new ArrayList<>();

	public CarrinhodeCompras(List<Product> lista) {
		super();
		this.lista = lista;
	}
	
	 public double calcularValorTotal() {
	        double valorTotal = 0;
	        
	        for (Product produto : lista) {
	            double preco = produto.getPrice();
	            double desconto = produto.calcularDesconto();
	            
	            valorTotal += preco - desconto;
	        }
	        
	        return valorTotal;
	    }
	
}
