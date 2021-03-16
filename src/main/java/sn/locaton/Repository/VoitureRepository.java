package sn.locaton.Repository;

import sn.locaton.Domain.Voiture;

public interface VoitureRepository {
    Voiture[] getAll();
    Voiture getById(int id);
}
