package Cadstro_de_Email;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class DataHora {

    public static String dataHoraArquivo(){
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat( "yyyymmddhhmmss").format(ts);
    }
}
