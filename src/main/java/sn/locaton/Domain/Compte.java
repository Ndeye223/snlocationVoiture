package sn.locaton.Domain;

import java.util.Date;

public class Compte {
    private int idCompte;
    private String login;
    private String password;
    private Date dateOuverture;

    public Compte(int idCompte, String login, String password, Date dateOuverture) {
        this.idCompte = idCompte;
        this.login = login;
        this.password = password;
        this.dateOuverture = dateOuverture;
    }

    public int getIdCompte() {
        return idCompte;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }
}
