package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class file2 {
	//*esse programa cria um novo arquivo onde vc indicar o caminho
	public static void main(String[] args) {

		String[] lines = new String[] { "Good morning", "Good afternoon", "Good evening" };
		String path = "C:\\Users\\wisan\\OneDrive\\Documentos\\out.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path ))) {//* se vc adicionar uma virgula e um true, ele nao vai recriar o arquivo se ele ja existe, e sim escrever no final
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
