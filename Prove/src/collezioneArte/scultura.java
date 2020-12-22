package collezioneArte;

public class scultura extends operadarte{

	private double base;
	private double altezza;
	private double profondita;
	
	public scultura() {}
	
	public scultura(String titolo, String artista,
			        double base, double altezza, double profondita) {
		this.titolo = titolo;
		this.artista = artista;
		this.base = base;
		this.altezza = altezza;
		this.profondita = profondita;
	}
	
	public scultura(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
}
	
	public double ingombro() {
		return base*altezza*profondita;
	}
	
	public String getTitolo() {
		return titolo;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void Stampa() {
		System.out.println("Titolo:" + getTitolo());
		System.out.println("Artista:" + getArtista());
		System.out.println("Base:" + base);
		System.out.println("Altezza:" + altezza);
		System.out.println("Profondità:" + profondita);
		System.out.println("Ingombro:" + ingombro());
		System.out.println();
	}
}
