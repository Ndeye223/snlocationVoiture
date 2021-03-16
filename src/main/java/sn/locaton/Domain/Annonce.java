package sn.locaton.Domain;

import java.util.Date;

public class Annonce {
  private  int id;
  private String titre;
  private String prix;
  private String description;
  private Date date;
  private Voiture voiture;

    public Annonce(int id, String titre, String s, String prix, String date) {
        this.prix = prix;
    }

    public Annonce(int id, String titre, long prix, String description, Date date, Voiture voiture) {
        this.id = id;
        this.titre = titre;

        this.description = description;
        this.date = date;
        this.voiture = voiture;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getPrix() {
        return prix;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

}
