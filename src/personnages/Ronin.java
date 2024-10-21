package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
    }
	
	public void donner(Commercant beneficiaire) {
        // 10% de l'argent 
        int montant = getArgent() / 10;
        perdreArgent(montant);
        parler(beneficiaire.getNom() + " prend ces " + montant + " sous.");
        beneficiaire.recevoir(montant);
    }
	public void provoquer(Yakuza adversaire) {
        int force = honneur * 2;
        int reputationYakuza = adversaire.getReputation();

        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");

        if (force >= reputationYakuza) {
            // Le Ronin gagne
            honneur += 1;
            parler("Je t’ai eu petit yakusa!");
            int gain = adversaire.perdre();
            gagnerArgent(gain);
        } else {
            // Le Ronin perd
            honneur -= 1;
            int argentPerdu = getArgent();
            perdreArgent(argentPerdu);
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
            adversaire.gagner(argentPerdu);
        }
    }
}
