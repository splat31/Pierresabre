package personnages;

public class Commercant extends Humain {
	private int perte;
	
	public Commercant(String nom, String fav, int argent) {
		super(nom, fav, argent);
		this.fav="thé";
	}
	
	public String getFav() {
		return fav;
	}

	
	public int seFaireExtorquer() {
		this.parler("J’ai tout perdu! Le monde est trop injuste..."); 
		perte=argent;
		argent=0;
		return perte;
	}
	
	public void recevoir(int recu) {
		this.gagnerArgent(recu);
		this.parler(recu+" sous ! Je te remercie généreux donateur !");
	}
}
