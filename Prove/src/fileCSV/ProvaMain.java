package fileCSV;

import java.util.*;
import java.io.*;

public class ProvaMain {

	public static void main(String[] args) {
		
		
		Vector<String> testo = new Vector<String> ();
		
		try {
		Scanner fin = 
		new Scanner(new BufferedReader(new FileReader("hey.txt")));
		fin.useDelimiter("%");
		while (fin.hasNext()) {
			testo.add(fin.next());
		     }
		} catch (FileNotFoundException e) {
			System.out.println("File non trovato");
			System.out.println(e);
		}
		for (int i = 0; i < testo.size(); i++) 
				System.out.print(testo.get(i));
	}

}
