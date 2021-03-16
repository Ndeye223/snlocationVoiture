package sn.locaton.service.console;


import sn.locaton.Domain.Annonce;
import sn.locaton.Repository.AnnonceRepository;
import sn.locaton.service.DisplayService;
import sn.locaton.service.MenuService;

import java.util.Scanner;

public class ScannerMenuService implements MenuService {
    private final DisplayService displayService;
    private final Scanner scanner;
    private final AnnonceRepository annonceRepository;
    private final AnnonceRepository voitureRepository;

    public ScannerMenuService(DisplayService displayService, AnnonceRepository annonceRepository1, AnnonceRepository voitureRepository) {
        this.displayService = displayService;
        this.annonceRepository = annonceRepository1;
        this.scanner = new Scanner(System.in);
        this.voitureRepository = voitureRepository;

    }


    private String lireChoix() {
        return scanner.next();
    }

    private String afficherMenu(String choix) {
        Annonce[] annonces = annonceRepository.getAll();
        if("l".equalsIgnoreCase(choix)){
            displayService.afficherListeServices(annonces);
            int id = scanner.nextInt();


            Annonce annonce = annonceRepository.getById(id);

            //Annonce[] annonces = annonceRepository.getAll(annonce);
            //afficher les prestataires qui fournissent ce service
            displayService.afficherAnnonces(annonce, annonces);



                int idDetailPrestation = scanner.nextInt();
                if(2 == idDetailPrestation){
                    displayService.afficherDetailsContrat();
                    displayService.afficherDemandeHeure();
                    String heure = scanner.next();
                    displayService.afficherConfirmation(heure);
                }
            }

        if("h".equalsIgnoreCase(choix)){
            displayService.afficherDemandeHeure();
            String heure = scanner.next();


        }
        //afficher le menu inconnu
        else {
            displayService.afficherOptionInconnue();
        }
        return choix;
    }

    public void afficherMenu() {
        String choix = lireChoix();
        afficherMenu(choix );
    }
}
