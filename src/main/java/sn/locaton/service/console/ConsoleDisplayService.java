package sn.locaton.service.console;


import sn.locaton.Domain.Annonce;
import sn.locaton.service.DisplayService;

public class ConsoleDisplayService implements DisplayService {



    public void afficherBienvenu() {
        System.out.println("Bienvenu sur la plateforme de location Voiture!");
    }



    public void afficherMenuPrincipal() {
        System.out.println("> l pour lister les Annones disponibles ");
        System.out.println("> h Heure de livraison ");
    }

    public Annonce[] afficherListeServices(Annonce[] annonces) {
        System.out.println("Les Annonces disponibles sont:");
        System.out.println("1 - TITRE : Toyota");
        System.out.println(">>>PRIX : 150000");
        System.out.println(">>>DESCRIPTION : Toyota a louer");
        System.out.println(">>>DATE : 2021/01/12");
        System.out.println("==================================================");
        System.out.println("==================================================");

        System.out.println("2 - TITRE : 4X4");
        System.out.println(">>>PRIX : 180000");
        System.out.println(">>>DESCRIPTION : Voiture à louer");
        System.out.println(">>>DATE : 2020/11/05");
        System.out.println("==================================================");
        System.out.println("==================================================");

        System.out.println("3 - TITRE : Range Rover");
        System.out.println(">>>PRIX : 1100000");
        System.out.println(">>>DESCRIPTION : Ranger à bon prix");
        System.out.println(">>>DATE : 2021/02/14");
        System.out.println("==================================================");
        System.out.println("==================================================");

        System.out.println("4 - TITRE : Ford");
        System.out.println(">>>PRIX : 190000");
        System.out.println(">>>DESCRIPTION : Ford a louer");
        System.out.println(">>>DATE : 2021/01/17");
       return annonces;

    }

    public void afficherAnnonces(Annonce annonce, Annonce[] annonces) {

    }

    public void afficherDetailsVoiture() {

    }


    public void afficherDetailsContrat() {
        System.out.println(" Publication Annonce :  ");
    }

    public void afficherDemandeHeure() {
        System.out.println("Pour quelle heure ? (hh:mm) ?");
    }

    public void afficherConfirmation(String heure) {
        System.out.println(String.format("OK pour %s", heure));
    }

    public void afficherOptionInconnue() {
        System.out.println("Choix inconnu");
    }
}
