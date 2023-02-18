package lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many emplooyes will be registered?: ");
		int n = sc.nextInt();
		List<Entities> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			System.out.println("Employee #" + (i + 1) + " :");
			sc.nextLine();
			System.out.println("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Salary: ");
			Double salario = sc.nextDouble();
			Entities emp = new Entities(id, name, salario);
			list.add(emp);	
		}
		System.out.println("Enter the employee id that will have the salary increase: ");
		int id = sc.nextInt();
		Entities emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.IncreaseSalary(percentage);
	}
		System.out.println("List of employees: ");
		for (Entities obj : list) {
			System.out.println(obj);
	}}
	public static boolean hasId(List<Entities> list, int id) {
		Entities emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}}




