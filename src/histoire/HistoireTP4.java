package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
	Humain prof= new Humain("prof","kombucha",54);
	Commercant marco= new Commercant("Marco","",20);
	Yakuza yaku= new Yakuza("Yaku le noir","Whisky",30,"Warsong");
	Ronin roro= new Ronin ("Roro","shochu",60);
		
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("kimono", 50);
		
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		roro.direBonjour();
		roro.donner(marco);
		
		roro.provoquer(yaku);
		
	}

}
