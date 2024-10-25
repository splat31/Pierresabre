package personnages;

public class Humain {
	protected String nom;
	protected String fav;
	protected int argent;

	public Humain(String nom, String fav,int argent) {
		this.nom = nom;
		this.fav = fav;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte) {
		System.out.println("("+ nom + ") - " + texte );
	}
	public void direBonjour() {
		this.parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + fav);
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de " + fav + "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix > argent) {
			this.parler("Je n'ai plus que "+ argent +" sous en poche. Je ne peux meme pas m'offrir un" + bien + " à " + prix + "sous");
		} else {
		    this.parler("J'ai "+argent +" sous en poche. Je vais pouvoir m'orir un " + bien + " à " + prix + " sous ");
		    perdreArgent(prix);
		}
		
	}
	
	public void gagnerArgent(int gain) {
		
	}
	
	public void perdreArgent(int perte) {
		argent=argent-perte;
	}

}
