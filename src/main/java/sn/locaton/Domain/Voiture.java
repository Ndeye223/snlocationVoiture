package sn.locaton.Domain;

public class Voiture {
   private int id;
   private int idMarque;
   private int idModele;
   private String libelleMarque;
   private String libelleModele;


    public Voiture(int id, int idMarque, int idModele, String libelleMarque, String libelleModele) {
        this.id = id;
        this.idMarque = idMarque;
        this.idModele = idModele;
        this.libelleMarque = libelleMarque;
        this.libelleModele = libelleModele;
    }

    public int getId() {
        return id;
    }

    public int getIdMarque() {
        return idMarque;
    }

    public int getIdModele() {
        return idModele;
    }

    public String getLibelleMarque() {
        return libelleMarque;
    }

    public String getLibelleModele() {
        return libelleModele;
    }
}
