package numIntero;

import java.util.Scanner;
import java.util.InputMismatchException;

public class quaCubo {

	public static void main(String[] args) {
		
		Scanner fs = new Scanner(System.in);
		int p;
		boolean b;
		
		System.out.print("Inserisci un numero: ");
	
		do {
		
		try {
			b = true;
			p = fs.nextInt();
			
			numero q = new numero(p);
			quadrato qua = new quadrato(p);
			cubo c = new cubo(p);
			
			System.out.println("Numero: " + q.ritor());
			System.out.println("Quadrato: " + qua.ritor());
			System.out.println("Cubo: " + c.ritor());
		}
		catch (InputMismatchException e) {
			fs.nextLine();
			System.out.println("Ritenta: ");
			b = false;
		}  
		
		}while(!b);

		fs.close();
	}

}
