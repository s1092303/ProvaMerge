package provaCitta;

import java.util.*;

public class provaMain {

	public static void main(String[] args) {
		
		
		Statistiche s = new Statistiche();
		Scanner fs = new Scanner(System.in);		
		String nome;
		float daIns;
		Citta c = new Citta("Roma", 12, 14);
		Citta ci = new Citta("Londra", 13, 14);
		
		Vector<Citta> lista = new Vector<Citta> ();
		
		lista.add(c);
		lista.add(ci);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Nome: "+ lista.get(i).getNome());
			lista.get(i).visualizza();
		}
	
		System.out.print("Città: ");
		
		nome = fs.next();
		
		for (int i = 0; i < lista.size(); i++) {
			if (nome.equals(lista.get(i).getNome())) {
				System.out.print("Vento: ");
				daIns = fs.nextFloat();
				lista.get(i).setVento(daIns);
				System.out.print("Visiblità: ");
				daIns = fs.nextFloat();
				lista.get(i).setVis(daIns);
				break;
			}
		}
		
		
		System.out.println(lista.get(1).GetSizeVento());
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("Media vento:" + s.mediaVento(lista.get(i)));
			System.out.println("Varianza vento: " + s.varianzaVento(lista.get(i)));
		}
				
		/*		
				
		System.out.print("Città: ");
		
		nome = fs.next();
		
		/*for (int i = 0; i < lista.size(); i++) {
			if (nome.equals(lista.get(i).getNome())) {
				lista.get(i).visualizza();
				fs.close();
				return;
			}
		}
		
		*/
		
		System.out.println("Seconda parte di codice(API)");
		
		
		Vector<String> IDCitta = new Vector<String> ();
		IDCitta.add("london,uk");
		IDCitta.add("Roma");
		String url;
		GestioneJSON ge = new GestioneJSON();
		
		
		for (int i = 0; i < IDCitta.size(); i++) {
			System.out.println();
			System.out.println(IDCitta.get(i));
			System.out.println();
			url = "https://api.openweathermap.org/data/2.5/weather?q=" + IDCitta.get(i) + "&appid=bcf6ba556143b256c30423368e21ab52"; 
			ge.chiamataAPI(url, true);
		}
		
		fs.close();
	}

}
