package biblio.metier;

import java.time.LocalDate;
import java.util.ArrayList;

public class Lecteur {
    private String numLecteur;
    private String nom;
    private String prenom;
    private LocalDate dateNaiss;
    private String mail;
    private String adresse;
    private String tel;
    private ArrayList<Location> listeLocations = new ArrayList<>();

    public Lecteur(){

    }
    public Lecteur(String numLecteur,String nom,String prenom,LocalDate dateNaiss,String mail,String adresse,String tel){
        this.numLecteur=numLecteur;
        this.nom=nom;
        this.prenom=prenom;
        this.dateNaiss=dateNaiss;
        this.mail=mail;
        this.adresse=adresse;
        this.tel=tel;
    }



    public void listerExemplairesEnLoc(){

    }
    public void listerExemplairesLoues(){

    }

    public ArrayList<Location> getListeLocations() {
        return listeLocations;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString(){
        return "Num lecteur : "+numLecteur+" Nom : "+nom+" Prenom : "+prenom+" Date naiss : "+dateNaiss+" Adresse : "+adresse+" Mail : "+mail+" Tel : "+tel;
    }
}
