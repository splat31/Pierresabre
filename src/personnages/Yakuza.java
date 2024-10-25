package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int gain=0;
	private int perte=0;
	public int reputation=0;

	public Yakuza(String nom, String fav, int argent, String clan) {
		super(nom, fav, argent);
		this.clan=clan;
	}
	
	public String getClan() {
		return clan;
	}
	
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.nom + ", si tu tiens à la vie donne moi ta bourse !");
		gain=victime.seFaireExtorquer();
		this.gagnerArgent(gain);
		this.parler("J’ai piqué les " + gain +" sous de "+victime.nom+", ce qui me fait "+argent +
				" sous dans ma poche. Hi ! Hi !");
		reputation=reputation+1;
		gain=0;
	}
	
	
	public int perdre() {
		perte=argent;
		this.perdreArgent(argent);
		this.parler("J’ai perdu mon duel et mes "+perte+" sous, snif... J'ai déshonoré le clan de"+clan);
		return perte;
	}
	
	public void gagner(int gainduel) {
		this.gagnerArgent(gainduel);
		reputation=reputation+1;
		this.parler("Ce ronin pensait vraiment battre "+nom+" du clan de "+clan+
				" ? Je l'ai dépouillé de ses "+gainduel+" sous.");
	}
		


}
