package provaCitta;

import java.util.*;

public class Citta {

	private String nome;
	private Vector<Float> venti = new Vector<Float> (); 
	private Vector<Float> vis = new Vector<Float> ();
	
	public Citta(String nome, float ven
			, float visi) {
		this.nome = nome;
		venti.add(ven);
		vis.add(visi);
	}
	
	public void visualizza() {
		System.out.println("Giorno   ||      Vento||   Visibilità");
		for (int i = 0; i < venti.size(); i++) {
			System.out.println((i+1) + "        ||      " + venti.get(i) + " ||            " + vis.get(i));	
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setVento(float ins) {
		venti.add(ins);
	}
	
	public void setVis(float ins) {
		vis.add(ins);
	}
	
    public float getVento (int n) {
        return venti.get(n);
    }
   
    public float getVis (int n) {
        return vis.get(n);
    }
    
    public int GetSizeVento() {
    	return venti.size();
    }
    
    public int GetSizeVis() {
    	return vis.size();
    }
	
}
