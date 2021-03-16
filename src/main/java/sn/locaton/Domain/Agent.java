package sn.locaton.Domain;

public class Agent {
    private int id;
    private String nom;
    private String adresse;
    private String tel;

    public Agent(int id, String nom, String adresse, String tel) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTel() {
        return tel;
    }
}
