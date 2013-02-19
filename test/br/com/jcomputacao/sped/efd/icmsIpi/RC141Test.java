package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 16:36:39
 * @author Vinicius Diana
 */
public class RC141Test {
   @Test
    public void RC141Test() throws ParseException  {
    RC141 r = new RC141();
    LineModel model = r.createModel();
     SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
     
     //2
     model.setFieldValue(RC141.NUM_PARC, 11);
     //3
         Date data = sf.parse("04082012");
        model.setFieldValue(RC141.DT_VCTO, data);
     //4
       model.setFieldValue(RC141.VL_PARC, 55.11); 
       
        StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C141|11|04082012|55,11|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
        
   }
}
