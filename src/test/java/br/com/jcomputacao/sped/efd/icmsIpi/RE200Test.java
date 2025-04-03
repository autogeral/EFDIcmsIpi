package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 06/02/2013 10:35:11
 * @author Vinicius Diana
 */
public class RE200Test {
    @Test
    public void RE200() throws ParseException{
        RE200 r = new RE200();
        LineModel model = r.createModel();
        
        
        //2
        model.setFieldValue(RE200.UF,"SP");
        //3
        SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
        Date data = sf.parse("04082012");
        model.setFieldValue(RE200.DT_INI, data);
        //4
        Date data2 = sf.parse("05082012");
        model.setFieldValue(RE200.DT_FIN, data2);
        
        StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|E200|SP|04082012|05082012|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    }

}
