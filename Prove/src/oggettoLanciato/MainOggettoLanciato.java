package oggettoLanciato;

public class MainOggettoLanciato {

	public static void main(String[] args) {
		
		Dado dado = new Dado();
		Moneta moneta = new Moneta();
		
		for(int i = 0; i < 1; i++) {
			System.out.println("Dado: " + dado.Lancio());
			if (moneta.Lancio() == 1) System.out.println("Moneta: testa");
			else System.out.println("Moneta: croce");
		}

	}

}
