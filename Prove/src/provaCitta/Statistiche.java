package provaCitta;

 public class Statistiche {

 
	public Statistiche() {}
	 

    public float mediaVento (Citta cit){
        
        float somma=0;
        for (int i=0; i<cit.GetSizeVento() ; i++) {
            somma += cit.getVento(i);
        }
        return somma/cit.GetSizeVento();
        
    }
    
    public float mediaVis (Citta cit){
        
        float somma=0;
        for (int i=0; i < cit.GetSizeVis() ; i++) {
            somma += cit.getVis(i);
        }
        return somma/cit.GetSizeVis();
    }
    
    
    public float varianzaVento (Citta cit) {
    
    float somma=0; 
    float media = mediaVento(cit);
    
    for (int i=0; i<cit.GetSizeVento(); i++) {
        somma += (cit.getVento(i) - media)*(cit.getVento(i) - media);
        }
    return somma/(cit.GetSizeVento() - 1);
}
    
    public float varianzaVis (Citta cit) {
    
    float somma=0; 
    float media = mediaVis(cit);
    
    for (int i=0; i<cit.GetSizeVis(); i++) {
        somma += (cit.getVis(i) - media)*(cit.getVis(i) - media);
        }
    return somma/(cit.GetSizeVis() - 1);
    }
    
}