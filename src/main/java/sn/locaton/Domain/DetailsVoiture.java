package sn.locaton.Domain;

public class DetailsVoiture {
   private int idDetails;
   private String annee;
   private String kilometrage;
   private String carburant;


    public DetailsVoiture(int idDetails, String annee, String kilometrage, String carburant) {
        this.idDetails = idDetails;
        this.annee = annee;
        this.kilometrage = kilometrage;
        this.carburant = carburant;
    }

    public int getIdDetails() {
        return idDetails;
    }

    public String getAnnee() {
        return annee;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public String getCarburant() {
        return carburant;
    }
}
