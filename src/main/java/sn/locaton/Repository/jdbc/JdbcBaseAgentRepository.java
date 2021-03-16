package sn.locaton.Repository.jdbc;

import sn.locaton.Domain.Agent;
import sn.locaton.Repository.AgentRepository;

public class JdbcBaseAgentRepository implements AgentRepository {
    public Agent[] getAll() {
        return new Agent[0];
    }

    public Agent getById(int id) {
        return null;
    }
}
