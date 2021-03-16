package sn.locaton.Repository.jdbc;

import sn.locaton.Domain.DetailsVoiture;
import sn.locaton.Repository.DetailsVoitureRepository;

public class JdbcBaseDetailsVoitureRepository implements DetailsVoitureRepository {
    public DetailsVoiture[] getAll() {
        return new DetailsVoiture[0];
    }
}
