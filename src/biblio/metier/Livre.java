package biblio.metier;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;

public class Livre extends Ouvrage {
    private String isbn;
    private int nombrePages;
    private TypeLivre typeLivre;
    private String resume;
    private Lecteur lecteur;

    public Livre(){

    }
    public Livre(String titre, byte ageMin,LocalDate date_parution, TypeOuvrage typeOuvr,double prixLocation,String langue,String genre,String isbn,int nombrePages,TypeLivre typeLivre,String resume){
        this.titre=titre;
        this.ageMin=ageMin;
        this.dateParution=date_parution;
        this.typeOuvrage=typeOuvr;
        this.prixLocation=prixLocation;
        this.langue=langue;
        this.genre=genre;
        this.isbn=isbn;
        this.nombrePages=nombrePages;
        this.typeLivre=typeLivre;
        this.resume=resume;
    }

    @Override
    public double amendeRetard(int njours) {
        double amende=0;
        return amende;
    }

    public ArrayList<Auteur> getListeAuteurs(){
        return listeAuteurs;
    }

    @Override
    public String toString(){
        return "Titre : "+titre+" Age minimum : "+ageMin+" Date parution = "+dateParution+" Type d'ouvrage : "+typeOuvrage+" Prix location : "+prixLocation+" Langue : "+langue+" Genre : "+genre+" ISBN : "+isbn+" Nombre pages : "+nombrePages+" Type livre : "+typeLivre+" Resume : "+resume;
    }
}
