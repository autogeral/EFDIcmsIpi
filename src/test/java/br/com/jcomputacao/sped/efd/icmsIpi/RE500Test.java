package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 11/02/2013 09:32:40
 * @author Vinicius Diana
 */
public class RE500Test {
 @Test

    public void  RE500Test() throws ParseException {
     
     RE500 r = new RE500();
     LineModel model = r.createModel();
     SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
    Date data= sdf.parse("01112012");
    Date  data2 = sdf.parse("08112012");
      //2
     model.setFieldValue(RE500.IND_APUR, "1");
     //3
     model.setFieldValue(RE500.DT_INI, data);
     //4
     model.setFieldValue(RE500.DT_FIN, data2);
     
      StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E500|1|01112012|08112012|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
     
    }
 
}
