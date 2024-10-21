package histoire;

import personnages.Humain;
import personnages.Ronin;
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
    	
    	
		/*
		 * // Test du Yakuza
		 * 
		 * Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		 * 
		 * Commercant marco = new Commercant("Marco", 15);
		 * 
		 * yakuLeNoir.direBonjour(); yakuLeNoir.
		 * parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?"
		 * ); yakuLeNoir.extorquer(marco);
		 */
        
		/*
		 * // Test du Ronin
		 * 
		 * Commercant marco = new Commercant("Marco", 20);
		 * 
		 * Ronin roro = new Ronin("Roro", "shochu", 60);
		 * 
		 * roro.direBonjour(); // Le ronin donne 10% de son argent à Marco
		 * roro.donner(marco);
		 */
        
        
        // Création du commerçant Marco
        Commercant marco = new Commercant("Marco", 15);

        // Création du Yakuza Yaku Le Noir
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");

        // Le Yakuza extorque Marco
        yakuLeNoir.direBonjour();
        yakuLeNoir.extorquer(marco);

        // Création du Ronin Roro
        Ronin roro = new Ronin("Roro", "shochu", 60);

        // Le Ronin donne de l'argent à Marco
        roro.direBonjour();
        roro.donner(marco);

        // Le Ronin provoque le Yakuza en duel
        roro.provoquer(yakuLeNoir);
        
    }  
}
