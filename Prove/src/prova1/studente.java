package prova1;

public class studente extends persona {
	
	private int matricola;
	private int anno;
	
	private static int ultimaMatr = 0;
	
	public studente(String nome, String indirizzo) {
		super(nome, indirizzo);
		
		this.matricola = ultimaMatr + 1;
		ultimaMatr++;
		this.anno = 1;
	}
	
	public void visualizza () {
		System . out . println ("      Nome : " + nome);
		System . out . println (" Indirizzo : " + indirizzo);
		System . out . println (" Matricola : " + matricola );
		System . out . println ("      Anno : " + anno );
	}


}
