package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	
    public static void main(String[] args) {
    	
    	// Test du Humain
//        Humain prof = new Humain("Prof", "kombucha", 54);
//
//        prof.direBonjour();
//        prof.acheter("une boisson", 12);
//        prof.boire();
//        prof.acheter("un jeu", 2);
//        prof.acheter("un kimono", 50);
        
    	// Test du Commerçant
//        Commercant marco = new Commercant("Marco", 20);
//
//        marco.direBonjour();
//        marco.seFaireExtorquer();
//        marco.recevoir(15);
//        marco.boire();
    	
    	// Test du Yakuza
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
        Commercant marco = new Commercant("Marco", 15);
        yakuLeNoir.direBonjour();
        yakuLeNoir.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        yakuLeNoir.extorquer(marco);
        
    }  
}
