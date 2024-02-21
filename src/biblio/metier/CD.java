package biblio.metier;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class CD extends Ouvrage{
    private long code;
    private LocalTime dureeTotale;
    private byte nbrePlages;

    public CD(){

    }
    public CD(long code,LocalTime dureeTotale,byte nbrePlages){
        this.code=code;
        this.dureeTotale=dureeTotale;
        this.nbrePlages=nbrePlages;
    }

    @Override
    public double amendeRetard(int njours) {
        double amende=0;
        return amende;
    }
}
