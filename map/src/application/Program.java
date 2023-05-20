package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a full file path: ");
		String path = sc.nextLine();
		Map<String, Integer> votes = new LinkedHashMap<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader((path)));
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name =fields[0];
				int count = Integer.parseInt(fields[1]);
				if (votes.containsKey(name)) {
					int votesSoFar = votes.get(name);
					votes.put(name, count + votesSoFar);
				}
				else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			br.close();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sc.close();

		}
	}


