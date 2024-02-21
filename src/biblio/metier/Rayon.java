package biblio.metier;

import java.util.ArrayList;

public class Rayon {
    private String codeRayon;
    private String genre;
    private ArrayList<Exemplaire> listeExemplaires = new ArrayList<>();

    public Rayon(String codeRayon,String genre){
        this.codeRayon=codeRayon;
        this.genre=genre;
    }
    public Rayon(){

    }

    public ArrayList<Exemplaire> getListeExemplaires() {
        return listeExemplaires;
    }

    @Override
    public String toString(){
        return "Code rayon : "+codeRayon+" Genre : "+genre;
    }
}
