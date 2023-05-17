import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.println("how many students for course A?: ");
		Integer n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			Integer number = sc.nextInt();
			a.add(number);
		}
		System.out.println("how many students for course B?: ");
		Integer j = sc.nextInt();
		for(int i=1;i<=j;i++) {
			Integer number = sc.nextInt();
			a.add(number);
		}
		System.out.println("how many students for course C?: ");
		Integer l = sc.nextInt();
		for(int i=1;i<=l;i++) {
			Integer number = sc.nextInt();
			a.add(number);
		}
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());
		

		sc.close();
	}

}
