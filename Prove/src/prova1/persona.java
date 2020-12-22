package prova1;

public class persona {
	
	protected String nome;
	protected String indirizzo;
	
	public persona(String nome, String indirizzo) {
		this.nome = nome;
		this.indirizzo = indirizzo;
	}

public void visualizza() {
	System.out.println("     Nome: " + nome);
	System.out.println("Indirizzo: " + indirizzo);
	System.out.println();
    }

}