package GestioneRegistroEta;

import java.io.*;
import java.util.Vector;
import java.util.Scanner;

public class NomeEta {
	
	public Vector<String> nomi = new Vector<String> ();
	public Vector<Integer> eta = new Vector<Integer> ();
	public boolean salvato = true;
	
	public NomeEta() {}

	public void lettura() {
	try {
		Scanner fin =
		new Scanner(new BufferedReader(new FileReader("nomeeta.txt")));
		while (fin.hasNext()) {
			nomi.add(fin.next());
			eta.add(fin.nextInt());	
			}
		fin.close();
	} 
	catch (IOException e) {
		System.out.println("Errore di IO");
		System.out.println();
	     }
	}
	
	public void Scrittura() {
		try {
			PrintWriter fout = 
			new PrintWriter(new BufferedWriter(new FileWriter("nomeeta.txt")));
			for (int i = 0; i < nomi.size(); i++) {
				fout.println(nomi.get(i) + " " + eta.get(i));
			}
			fout.close();
		}
		catch (IOException e) {
			System.out.println("Errore di IO");
			System.out.println(e);
		}
		salvato = true;
	}
	
	public void Visualizza() {
		for (int i = 0; i < nomi.size(); i++) {
			System.out.println("Nome: " + nomi.get(i) + " Età: " + eta.get(i));
		}
	}
	
	public void SetSalvato() {
		salvato = false;
	}
	
	public boolean GetSalvato() {
		return salvato;
	}
	
	public void Incremento(String nome) {
		for (int i = 0; i < nomi.size(); i++) {
			if (nome.equals(nomi.get(i))) {
				int c = eta.get(i) + 1;
				eta.set(i,c);
				SetSalvato();
				return;
			}
		}
		System.out.println("Nome non trovato");
	}
	
	public void aggiungi(String nome, Integer e) {
		nomi.add(nome);
		eta.add(e);
		SetSalvato();
	}
	
	public void elimina(String nome) {
		for (int i = 0; i < nomi.size(); i++) {
			if (nome.equals(nomi.get(i))) {
				nomi.remove(i);
				eta.remove(i);
				SetSalvato();
			}
		}
	}
	
}
