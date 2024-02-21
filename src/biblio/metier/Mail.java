package biblio.metier;

import java.time.LocalDateTime;

public class Mail {
    private String objet;
    private String message;
    private LocalDateTime dateEnvoi;

    public Mail(){

    }
    public Mail(String objet,String message,LocalDateTime dateEnvoi){
        this.objet=objet;
        this.message=message;
        this.dateEnvoi=dateEnvoi;
    }
}
