package collezioneArte;

public class quadro extends operadarte{
	/**
	 * 
	 * @author ronch
	 */
	private double altezza;
	private double base;
	
	public quadro() {};
	
	public quadro(String titolo, String artista, double altezza, double base) {
		super(titolo, artista);
		this.altezza = altezza;
		this.base = base;
	}
	
	public quadro(String titolo, String artista) {
		super(titolo, artista);
	}
	
	public double ingombro() {
		return base*altezza;
	}
	
	public String getTitolo() {
		return titolo;
	}
	/**
	 * 
	 * @return <code>String</code> artista
	 * 
	 */
	public String getArtista() {
		return artista;
	}
	
	
	public void Stampa() {
		System.out.println("Titolo:" + getTitolo());
		System.out.println("Artista:" + getArtista());
		System.out.println("Base:" + base);
		System.out.println("Altezza:" + altezza);
		System.out.println("Ingombro:" + ingombro());
		System.out.println();
	}
	
}
