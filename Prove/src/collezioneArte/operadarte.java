package collezioneArte;

public abstract class operadarte {

	protected String titolo;
	protected String artista;
	
	public operadarte() {};
		
	public operadarte(String titolo, String artista) {
		this.titolo = titolo;
		this.artista = artista;
	}
	
	public abstract double ingombro();
	
	public abstract void Stampa();
	
	public abstract String getTitolo();
	
	public abstract String getArtista();
	
	public boolean equals(Object o) {
		if (o instanceof quadro) 
			if (titolo.equals(((quadro) o).titolo)
			&& artista.equals(((quadro) o).artista)) return true;
			else return false;
		if (o instanceof scultura) 
			if (titolo.equals(((scultura) o).titolo)
			&& artista.equals(((scultura) o).artista)) return true;
			else return false;
		return false;
		
	}
	
	
}
