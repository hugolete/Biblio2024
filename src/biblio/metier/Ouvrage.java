package biblio.metier;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Ouvrage {
    protected String titre;
    protected byte ageMin;
    protected LocalDate dateParution;
    protected TypeOuvrage typeOuvrage;
    protected double prixLocation;
    protected String langue;
    protected String genre;
    protected ArrayList<Auteur> listeAuteurs = new ArrayList<>();

    public Ouvrage(){

    }
    public Ouvrage(String titre,byte ageMin,LocalDate dateParution,TypeOuvrage typeOuvrage,double prixLocation,String langue, String genre){
        this.titre=titre;
        this.ageMin=ageMin;
        this.dateParution=dateParution;
        this.typeOuvrage=typeOuvrage;
        this.prixLocation=prixLocation;
        this.langue=langue;
        this.genre=genre;
    }

    public void listerExemplaires(){

    }
    public void listerExemplaires(boolean enLocation){

    }
    public abstract double amendeRetard(int njours);

    public ArrayList<Auteur> getListeAuteurs;

    public String getTitre() {
        return titre;
    }
}
