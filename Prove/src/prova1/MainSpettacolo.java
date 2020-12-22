package prova1;

public class MainSpettacolo {

	public static void main(String[] args) {
		
		persona p1 = new persona (" Mario Rossi "," Via Garibaldi 23 ");
		persona p2 = new persona (" Federico Bianchi "," Via Mazzini 44 ");
		studente stud = new studente("Nicola", "Via Marche 76");
		spettacolo s = new spettacolo (" Macbeth "," Attori dilettanti "," 25/12/2013 - 21.00 ");
		
		boolean ok1 = s. prenota ( p1 );
		
		boolean ok2 = s. prenota ( p2 );
		
		boolean ok3 = s.prenota(stud);
		
		if (! ok1 || ! ok2 || ! ok3) System . out . println (" Problemi ... ");
		
		s. stampaPrenotazioni ();
		
		System.out.println();
		
		System . out . println (" Posti disponibili : " +s. postiDisponibili ());
		}
}
