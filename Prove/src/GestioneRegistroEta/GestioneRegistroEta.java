package GestioneRegistroEta;

import java.util.Scanner;

public class GestioneRegistroEta {

	public static void main(String[] args) {
		
		Scanner finput = new Scanner(System.in);
		boolean flag = false;
		String nome;
		int scelta1;
		
		NomeEta n = new NomeEta();
		n.lettura();

		do {
			System.out.println("Menu");
			System.out.println("0) esci");
			System.out.println("1) Visualizza");
			System.out.println("2) Incrementa");
			System.out.println("3) Aggiungi una persona");
			System.out.println("4) Elimina una persona");
			System.out.println("5) Salva");
			System.out.print("Scelta: ");
			int scelta = finput.nextInt();
			switch (scelta) {
				case 0 : {
					if (!(n.GetSalvato())) {
						System.out.println("Non hai salvato!");
						System.out.println("Vuoi salvare?");
						System.out.println("1) salva");
						System.out.println("2) non salva");
						scelta1 = finput.nextInt();
						switch (scelta1) {
							case 1 : n.Scrittura(); break;
							case 2 : break;
							default : System.out.println("Usa solo tasti consentiti"); break;
						}
					}
					flag = true;
				} break;
				case 1 : n.Visualizza(); break;
				case 2 : {
					System.out.println("Scegli un nome: ");
					nome = finput.next();
					n.Incremento(nome);
				}; break;
				case 3 : {
					System.out.println("Nome: ");
					nome = finput.next();
					System.out.println("Eta: ");
					scelta1 = finput.nextInt();
					n.aggiungi(nome, scelta1);
				} break;
				case 4 : {
					System.out.println("Nome: ");
					nome = finput.next();
					n.elimina(nome);
				} break;
				case 5 : n.Scrittura(); break;
				default : System.out.println("Usa solo tasti consentiti"); break;
			}
		} while (!flag);
		finput.close();
	}

}
