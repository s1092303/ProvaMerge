package oggettoLanciato;

public class OggettoLanciato {
	
	private int CasiPossibili;
	
	public OggettoLanciato() {};
	
	public OggettoLanciato(int CasiPossibili) {
		this.CasiPossibili = CasiPossibili;
	}
	
	public int Lancio() {
		if (CasiPossibili == 6) return (int)(Math.random()*CasiPossibili) + 1;
		else if(CasiPossibili == 2) return (int)(Math.random()*CasiPossibili);
		else return 0;
	}
	
	public void Stampa() {
		System.out.println(Lancio());
	}

}
