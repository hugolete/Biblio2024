package biblio;

import biblio.metier.*;

import java.time.LocalDate;

import static biblio.metier.TypeLivre.*;
import static biblio.metier.TypeOuvrage.*;

public class Gestion {
    public static void main(String[] args) {
        Auteur a = new Auteur("Verne","Jules","France");
        Livre l = new Livre("Vingt mille lieues sous les mers", (byte) 10, LocalDate.of(1880,1,1),LIVRE,1.50,"français","aventure","a125",350,ROMAN,"histoire de sous-marin");
        a.getListeOuvrages().add(l);
        l.getListeAuteurs().add(a);
        Rayon r = new Rayon("r12","aventure");
        Exemplaire e = new Exemplaire("m12","état neuf",l);
        e.setRayon(r);
        r.getListeExemplaires().add(e);
        Lecteur lec = new Lecteur("1","Dupont","Jean", LocalDate.of(2000,1,4),"Mons","jean.dupont@mail.com","0458774411");
        Location loc = new Location(LocalDate.of(2023,2,1),LocalDate.of(2023,3,1),lec,e);
        lec.getListeLocations().add(loc);
        e.getListeLocations().add(loc);
        System.out.println(a);
        System.out.println(l);
        System.out.println(r);
        System.out.println(e);
        System.out.println(lec);
        System.out.println(loc);
    }
}
