package sn.locaton.Repository.jdbc;


import java.sql.Connection;

public interface DataSource {
    Connection createConnection();
}
