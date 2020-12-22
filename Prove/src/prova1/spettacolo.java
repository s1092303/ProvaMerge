package prova1;

public class spettacolo {
	
	private String titolo;
	private String compagnia;
	private String dataeora;
	
	private static final int CAPIENZA = 100;
	private persona [] spettatori;
	int postiPrenotati = 0;
	
	public spettacolo ( String titolo , String compagnia ,
			String dataora ) {
			this.titolo = titolo ;
			this.compagnia = compagnia ;
			this.dataeora = dataora ;
			this.spettatori = new persona [CAPIENZA];
			}
	
	public int postiDisponibili () {
		return CAPIENZA - postiPrenotati;	
	}
	
	public boolean prenota ( persona spettatore ) {
		if ( postiDisponibili () >0) {
			spettatori [ postiPrenotati ] = spettatore ;
			postiPrenotati ++;
			return true ;
			}
		else return false ;
		}

	public void stampaPrenotazioni () {
			System . out . println (" Spettacolo " + titolo );
			System . out . println (" Del " + dataeora );
			System.out.println(" Compagnia: " + compagnia);
			System . out . println ();
			for (int i =0; i < postiPrenotati ; i ++) {
				spettatori [i ]. visualizza ();
			}
		}

 
}
