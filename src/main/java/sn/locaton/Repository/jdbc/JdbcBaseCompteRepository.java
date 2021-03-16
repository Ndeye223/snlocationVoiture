package sn.locaton.Repository.jdbc;

import sn.locaton.Domain.Annonce;
import sn.locaton.Domain.Compte;
import sn.locaton.Repository.CompteRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcBaseCompteRepository implements CompteRepository {
    private final DataSource dataSource;

    public JdbcBaseCompteRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Compte[] getAll() {

        String query = "SELECT idCompte, login, passw, dateOuverture  FROM compte";
        //mapper le résultat
        List<Compte> comptes = new ArrayList<Compte>();

        try {
            Connection connection = dataSource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                int id = rs.getInt("idCompte");
                String login = rs.getString("login");
                String passw = rs.getString("passw");
                Date dateOuverture = rs.getDate("dateOuverture");

                Compte compte = new Compte( id, login, passw , dateOuverture);

                comptes.add(compte);
            }
            return comptes.toArray(new Compte[0]);

        }
        catch (SQLException e) {
            return new Compte[0];
        }
        catch (Exception ex){
            return new Compte[0];
        }
    }

    public Compte getById(int idCompte) {

        String query = "SELECT idCompte, login, passw, dateOuverture from annonce where id = ?";
        try {
            Connection connection = dataSource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, idCompte);
            ResultSet rs = statement.executeQuery();
            int id = rs.getInt("idCompte");
            String login = rs.getString("login");
            String passw = rs.getString("passw");
            Date dateOuverture = rs.getDate("dateOuverture");

            Compte compte = new Compte( id, login, passw , dateOuverture);
            return compte;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
