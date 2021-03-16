package sn.locaton.Repository.jdbc;

import sn.locaton.Domain.Annonce;
import sn.locaton.Domain.Voiture;
import sn.locaton.Repository.AnnonceRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcBaseAnnonceRepository implements AnnonceRepository {
    private final DataSource dataSource;
    public JdbcBaseAnnonceRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Annonce[] getAll() {
        //requête sql pour récupèrer les infos
        String query = "SELECT id, titre, prix, description, date  FROM annonce";
        //mapper le résultat
        List<Annonce> annonces = new ArrayList<Annonce>();

        try {
            Connection connection = dataSource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                int id = rs.getInt("id");
                String titre = rs.getString("titre");
                String prix = rs.getString("prix");
                String description = rs.getString("description");
                String date = rs.getString("date");
                //mapping retour db (relationnel) avec objet Prestation
                Annonce annonce = new Annonce( id, titre, prix, description, date);

                annonces.add(annonce);
            }
            return annonces.toArray(new Annonce[0]);

        }
        catch (SQLException e) {
            return new Annonce[0];
        }
        catch (Exception ex){
            return new Annonce[0];
        }
    }

    public Annonce getById(int id) {
        String query = "SELECT id, titre, prix, description, date from annonce where id = ?";
        try {
            Connection connection = dataSource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            int retrievedId = rs.getInt("id");
            String titre = rs.getString("titre");
            String prix = rs.getString("prix");
            String description = rs.getString("description");
            String date = rs.getString("date");
            Annonce annonce = new Annonce( id, titre, prix, description, date);
            return annonce;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }




}
