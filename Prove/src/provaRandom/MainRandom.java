package provaRandom;

public class MainRandom {

	public static void main(String[] args) {
		
		int contatore = 0;
		int n = 10;
		
		for (int i = 0; i < n; i++) {
		int x = (int)(Math.random()*20);
		int y = (int)(Math.random()*15);
		System.out.println(x);
		System.out.println(y);
		if (x + y >= 30) contatore++;
		}
		System.out.println(((double)contatore/n));
	}

}
