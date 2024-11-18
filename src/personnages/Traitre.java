package personnages;

public class Traitre extends Samourai{
	private int gain=0;
	private int traitrise=0;

	public Traitre (String nom, String seigneur, String fav, int argent) {
		super(nom, seigneur,fav, argent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mais je suis un traître et mon niveau de traîtrise est : "+traitrise+". Chut !");
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.nom + ", si tu tiens à la vie donne moi ta bourse !");
		gain=victime.seFaireExtorquer();
		this.gagnerArgent(gain);
		this.parler("J’ai piqué les " + gain +" sous de "+victime.nom+", ce qui me fait "+argent +
				" sous dans ma poche. Hi ! Hi !");
		traitrise=traitrise+1;
		gain=0;
	}
}