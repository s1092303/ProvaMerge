package provaIO;
//prova IO

import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class IO {

	public static void main(String[] args) {
		
		try {
			int next;
			FileReader reader = new FileReader("prova.txt");
			FileWriter writer = new FileWriter("prova2.txt");
			do {
				next = reader.read();
				if (next != -1) {
					char c = (char) next;
					System.out.print(c);
					writer.write(c);
				}
			} while (next != -1);
			
			reader.close();
			writer.close();
		}
		catch (IOException e) {
		System.out.println("Errore di IO");
		System.out.println(e);
		}
	}

}
