package personnages;

public class Ronin extends Humain{
	private int honneur=1;
	private int don=0;
	private int force=0;
	
	public Ronin (String nom, String fav, int argent) {
		super(nom, fav, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		don=argent/10;
		this.parler(beneficiaire.nom+" prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
		this.perdreArgent(don);
		don=0;
	}
	
	public void provoquer(Yakuza adversaire) {
		force=honneur*2;
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		
		if (force>=adversaire.reputation) {
			this.gagnerArgent(adversaire.argent);
			honneur=honneur+1;
			this.parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
		}
		else {
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(argent);
			this.perdreArgent(argent);
			honneur=honneur-1;
		}
	}

}
