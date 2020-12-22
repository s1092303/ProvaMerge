package prova1;

public class prof extends persona{

	private String codiceDocente ; 
	private String dipartimento ; 

	public prof( String nome , String indirizzo ,
			String codiceDocente ,
			String dipartimento ) {
			super (nome , indirizzo );
			this . codiceDocente = codiceDocente ;
			this . dipartimento = dipartimento ;
	}
	
	public String getCodiceDocente () { return codiceDocente ; }
	
	public String getDipartimento () { return dipartimento ; }

	public void visualizza () {
		System . out . println (" Nome : Prof . " + nome);
		System . out . println (" Indirizzo : " + indirizzo);
		System . out . println (" Codice : " + codiceDocente );
		System . out . println (" Dipartimento : " + dipartimento );
		System . out . println ();
	}
}
