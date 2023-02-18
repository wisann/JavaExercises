package lista;

import java.util.List;

public class Entities {
	private Integer id;
	private String name;
	private Double salario;
	
	
	public Entities() {};
	
	public Entities(Integer id, String name, Double salario) {
		super();
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public void IncreaseSalary(double percentage) {
		 salario += salario * percentage / 100.; 
	
}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salario ;
	}
	private static boolean hasId(List<Entities> list, Integer id) {
		return false;
	
	}}