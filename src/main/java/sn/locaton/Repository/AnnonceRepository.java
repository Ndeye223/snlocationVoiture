package sn.locaton.Repository;

import sn.locaton.Domain.Annonce;
import sn.locaton.Domain.Voiture;

public interface AnnonceRepository {
    Annonce[] getAll();
    Annonce getById(int id);
}
