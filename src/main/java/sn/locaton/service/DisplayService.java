package sn.locaton.service;


import sn.locaton.Domain.Annonce;

public interface DisplayService {
    void afficherBienvenu();

    void afficherMenuPrincipal();

    Annonce[] afficherListeServices(Annonce[] annonces);

    void afficherAnnonces(Annonce annonce, Annonce[] annonces);

    void afficherDetailsVoiture();

    void afficherDetailsContrat();

    void afficherDemandeHeure();

    void afficherConfirmation(String heure);

    void afficherOptionInconnue();
}
