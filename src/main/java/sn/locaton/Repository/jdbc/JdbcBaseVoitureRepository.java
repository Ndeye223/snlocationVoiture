package sn.locaton.Repository.jdbc;

import sn.locaton.Domain.Voiture;
import sn.locaton.Repository.VoitureRepository;

public class JdbcBaseVoitureRepository implements VoitureRepository {
    public Voiture[] getAll() {
        return new Voiture[0];
    }

    public Voiture getById(int id) {
        return null;
    }
}
