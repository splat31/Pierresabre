package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String fav, int argent) {
		super(nom, fav, argent);
		this.fav="thé";
	}
	
	public String getFav() {
		return fav;
	}

	
	public int seFaireExtorquer() {
		this.parler("J’ai tout perdu! Le monde est trop injuste..."); 
		return argent;
	}
	
	public void recevoir(int argent2) {
		argent = argent+argent2;
		this.parler(argent2+" sous ! Je te remercie généreux donateur");
	}
}
