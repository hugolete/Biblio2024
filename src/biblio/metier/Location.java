package biblio.metier;

import java.time.LocalDate;

public class Location {
    private LocalDate dateLoc;
    private LocalDate dateRestitution;
    private Lecteur lect;
    private Exemplaire e;
    private double amende;

    public Location(){

    }
    public Location(LocalDate dateLoc,LocalDate dateRestitution,Lecteur l,Exemplaire e){
        this.dateLoc=dateLoc;
        this.dateRestitution=dateRestitution;
        this.lect=l;
        this.e=e;
    }
    public void calculerAmende(){

    }
    public void enregistrerRetour(){

    }

    public Exemplaire getExemplaire() {
        return e;
    }

    public Lecteur getLect() {
        return lect;
    }

    @Override
    public String toString(){
        return "Date location : "+dateLoc+" Date restitution : "+dateRestitution+" Loueur : "+lect+" Exemplaire : "+e+" Ouvrage : "+e.getOuvrage()+" Rayon : "+e.getRayon();
    }
}
