package biblio.metier;

import java.util.ArrayList;

public class Exemplaire{
    private String matricule;
    private String descriptionEtat;
    private Ouvrage o;
    private Rayon rayon;
    private ArrayList<Location> listeLocations = new ArrayList<>();

    public Exemplaire(){

    }
    public Exemplaire(String matricule, String descriptionEtat){
        this.matricule=matricule;
        this.descriptionEtat=descriptionEtat;
    }

    public Exemplaire(String matricule, String descriptionEtat, Ouvrage o){
        this.matricule=matricule;
        this.descriptionEtat=descriptionEtat;
        this.o=o;
    }

    public void modifierEtat(String etat){

    }
    public void lecteurActuel(){

    }
    public void lecteurs(){

    }
    public void envoiMailLecteurActuel(Mail mail){

    }
    public void envoiMailLecteurs(Mail mail){

    }
    public boolean enRetard(){
        return true;
    }
    public int joursRetard(){
        return 0;
    }
    public boolean enLocation(){
        return true;
    }

    public void setRayon(Rayon rayon) {
        this.rayon = rayon;
    }

    public ArrayList<Location> getListeLocations() {
        return listeLocations;
    }

    @Override
    public String toString(){
        return "Matricule : "+matricule+" Etat : "+descriptionEtat+" Ouvrage : "+o.getTitre();
    }

    public Ouvrage getOuvrage() {
        return o;
    }

    public Rayon getRayon() {
        return rayon;
    }
}
