package personnages;

public class Humain {
	protected String nom;
	protected String fav;
	protected int argent;
	protected int memoiremax=30;
	protected Humain connaissance[] = new Humain[memoiremax];
	protected int nbconnaissance=0;

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
		this.parler("Bonjour ! Je m’appelle " + nom + " et j’aime boire du " + fav+".");
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
		argent=argent+gain;
	}
	
	public void perdreArgent(int perte) {
		argent=argent-perte;
	}
	
	public void memoriser(Humain autrehumain) {
		if (nbconnaissance>=memoiremax) {
			for (int i = 0;i<memoiremax-1;i++) {
				this.connaissance[i]=this.connaissance[i+1];
			}
			this.connaissance[memoiremax-1]=autrehumain;
		} else {
			this.connaissance[nbconnaissance]=autrehumain;
			nbconnaissance++;
		}
	}
	
	public void repondre(Humain autrehumain) {
		this.parler("Bonjour " + this.nom +" !");
		autrehumain.memoriser(this);
	}
	
	public void faireConnaissanceAvec(Humain autrehumain) {
		this.parler("Bonjour " + autrehumain.nom + " !");
		this.memoriser(autrehumain);
		this.repondre(autrehumain);
	}
	
	public void listerConnaissance() {
		System.out.print("("+ nom + ") - "+"Je connais beaucoup de monde dont : ");
		for (int i=0;i<nbconnaissance-1;i++) {
			System.out.print(connaissance[i].nom+", ");
		}
		System.out.println(connaissance[nbconnaissance-1].nom+".");
	}
}
