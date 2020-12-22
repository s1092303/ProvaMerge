package collezioneArte;

import java.util.Scanner;

public class collezione {
	
	Scanner fs = new Scanner(System.in);

	private String nome;
	private String luogo;
	private quadro [] quadri;
	private scultura [] sculture;
	private static int capQuadri = 20;
	private static int capSculture = 10;
	private int pdQuadri = 0;
	private int pdSculture = 0;
	
	private String DaInsTitolo;
	private String DaInsArtista;
	private double DaInsBase;
	private double DaInsAltezza;
	private double DaInsProfondita;
	private int scelta;
	
	public collezione() {}
	
	public collezione(String nome, String luogo) {
		this.nome = nome;
		this.luogo = luogo;
		quadri = new quadro [capQuadri];
		sculture = new scultura [capSculture];
	}
	
	public void aggiungi() {
		do {
			System.out.println("Menu: ");
			System.out.println("0) esci");
			System.out.println("1) aggiungi un quadro");
			System.out.println("2) aggiungi una scultura");
			scelta = fs.nextInt();
			switch (scelta) {
				case 0 : break;
				case 1 : {
					if (pdQuadri == capQuadri) {
						System.out.println("Posti pieni");
						break;
					}
					System.out.print("Titolo: ");
					DaInsTitolo = fs.next();
					System.out.print("Artista: ");
					DaInsArtista = fs.next();
					System.out.print("Base: ");
					DaInsBase = fs.nextDouble();
					System.out.print("Altezza: ");
					DaInsAltezza = fs.nextDouble();
					quadro q = new quadro(DaInsTitolo,DaInsArtista,DaInsBase,DaInsAltezza);
					quadri[pdQuadri] = q;
					pdQuadri++;
				} break;
				case 2 : {
					if (pdSculture == capSculture) {
						System.out.println("Posti pieni");
						break;
					}
					System.out.print("Titolo: ");
					DaInsTitolo = fs.next();
					System.out.print("Artista: ");
					DaInsArtista = fs.next();
					System.out.print("Base: ");
					DaInsBase = fs.nextDouble();
					System.out.print("Altezza: ");
					DaInsAltezza = fs.nextDouble();
					System.out.print("Profondità: ");
					DaInsProfondita = fs.nextDouble();
					scultura s = new scultura(DaInsTitolo,DaInsArtista,DaInsBase,DaInsAltezza,DaInsProfondita);
					sculture[pdSculture] = s;
					pdSculture++;
				} break;
				default : System.out.println("Usa solo tasti consentiti"); break;
			}
		} while (scelta != 0);
	}
	
	public void visualizza() {
		System.out.println("Nome: " + nome);
		System.out.println("Luogo: " + luogo);
		System.out.println();
		System.out.println("Quadri: ");
		System.out.println();
		for (int i = 0; i < pdQuadri; i++) {
			quadri[i].Stampa();
		}
		System.out.println("Sculture: ");
		System.out.println();
		System.out.println();
		for (int i = 0; i < pdSculture; i++) {
			sculture[i].Stampa();
		}
	}

	public void trova() {
		System.out.println();
		System.out.println("Cosa vuoi cercare?");
		System.out.println("0) cerca un quadro");
		System.out.println("1) cerca una scultura");
		scelta = fs.nextInt();
		switch (scelta) {
			case 0 : {
				System.out.print("Titolo: ");
				DaInsTitolo = fs.next();
				System.out.print("Artista: ");
				DaInsArtista = fs.next();
				System.out.println();
				quadro q = new quadro(DaInsTitolo,DaInsArtista);
				for (int i = 0; i < pdQuadri; i++) {
					if (q.equals(quadri[i])) quadri[i].Stampa();
				}
			} break;
			case 1 : {
				System.out.print("Titolo: ");
				DaInsTitolo = fs.next();
				System.out.print("Artista: ");
				DaInsArtista = fs.next();
				scultura s = new scultura(DaInsTitolo,DaInsArtista);
				System.out.println();
				for (int i = 0; i < pdSculture; i++) {
					if (s.equals(sculture[i])) sculture[i].Stampa();
				} 
			} break;
			default : System.out.println("Usa solo tasti consentiti"); break;
		}
	}
	
	
}
