package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String fav, int argent) {
		super(nom, fav, argent);
	}
	
	commercant.getArgent();
	Commercant.getNom();
	
	public int seFaireExtorquer() {
		return argent;
	}
	
	public void recevoir(int argent2) {
		argent = argent+argent2;
	}
}
