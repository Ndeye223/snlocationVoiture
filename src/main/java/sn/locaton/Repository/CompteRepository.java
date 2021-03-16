package sn.locaton.Repository;

import sn.locaton.Domain.Compte;

public interface CompteRepository {
    Compte[] getAll();
    Compte getById(int idCompte);
}
