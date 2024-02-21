package biblio.metier;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DVD extends Ouvrage{
    private long code;
    private LocalTime dureeTotale;
    private byte nbreBonus;
    List<String> autresLangues = new ArrayList<>();
    List<String> sousTitres = new ArrayList<>();

    public DVD(){

    }
    public DVD(long code,LocalTime dureeTotale,byte nbreBonus,List<String> autresLangues,List<String> sousTitres){
        this.code=code;
        this.dureeTotale=dureeTotale;
        this.nbreBonus=nbreBonus;
        this.autresLangues=autresLangues;
        this.sousTitres=sousTitres;
    }

    @Override
    public double amendeRetard(int njours) {
        double amende=0;
        return amende;
    }
}
