package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP5 {

	public static void main(String[] args) {
	Commercant chonin= new Commercant("Chonin","",40);
	Commercant marco= new Commercant("Marco","",20);
	Commercant kumi = new Commercant("Kumi","", 10);
	Yakuza yaku= new Yakuza("Yaku le noir","Whisky",30,"Warsong");
	Ronin roro= new Ronin ("Roro","shochu",60);
		
		marco.direBonjour();
		roro.direBonjour();
		chonin.direBonjour();
		yaku.direBonjour();
		kumi.direBonjour();
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
	}
}	