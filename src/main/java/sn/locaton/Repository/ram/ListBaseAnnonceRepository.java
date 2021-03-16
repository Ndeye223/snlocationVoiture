package sn.locaton.Repository.ram;



import sn.locaton.Domain.Annonce;
import sn.locaton.Repository.AnnonceRepository;
import sn.locaton.Repository.jdbc.DataSource;

import java.util.ArrayList;
import java.util.List;

public class ListBaseAnnonceRepository implements AnnonceRepository {
    private final List<Annonce> annonces;

    public ListBaseAnnonceRepository(DataSource annonces) {
        //this.annonce = annonce;
        this.annonces = new ArrayList<Annonce>();
    }


    public Annonce[] getAll(Annonce annonce){
        annonces.add(new Annonce(1, "Toyota", "150000","Toyota a louer", "2021/01/12"));
        annonces.add(new Annonce(2, "4X4", "180000","Voiture à louer", "2020/11/05"));
        annonces.add(new Annonce(3, "Range Rover", "1100000","Ranger à bon prix", "2021/02/14"));
        annonces.add(new Annonce(4, "Ford", "190000","Ford a louer", "2021/01/17"));

        //return prestataires.toArray();
        return annonces.toArray(new Annonce[0]);
    }


   /* public Prestataire findById(int idPrestataire) {
        return null;
    }*/

    public Annonce[] getAll() {
        return new Annonce[0];
    }

    public Annonce getById(int id) {
        return null;
    }
}
