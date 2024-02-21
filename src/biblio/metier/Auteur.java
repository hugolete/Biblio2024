package biblio.metier;

import java.util.ArrayList;

public class Auteur {
    private String nom;
    private String prenom;
    private String nationalite;
    private ArrayList<Ouvrage> listeOuvrages = new ArrayList<>();

    public Auteur(){

    }
    public Auteur(String nom,String prenom,String nationalite){
        this.nationalite=nationalite;
        this.prenom=prenom;
        this.nom=nom;
    }

    public void listerOuvrages(){

    }
    public void listerOuvrages(String genre){

    }
    public void listerOuvrages(TypeOuvrage typeOuvrage, TypeLivre typeLivre){

    }

    public ArrayList<Ouvrage> getListeOuvrages() {
        return listeOuvrages;
    }

    @Override
    public String toString(){
        return "Nom : "+nom+" Prenom : "+prenom+" nationalite : "+nationalite;
    }
}
