package sn.locaton.Repository;

import sn.locaton.Domain.Agent;

public interface AgentRepository {

    Agent[] getAll();
    Agent getById(int id);
}
