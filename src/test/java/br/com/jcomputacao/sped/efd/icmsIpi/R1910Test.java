package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 13:44:01
 * @author Vinicius Diana
 */
public class R1910Test {
    
    @Test
    public void R1910Test() throws ParseException {
    R1910 r = new R1910();
    SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
    LineModel model = r.createModel();
    //2
        Date data = sf.parse("04082012");
        model.setFieldValue(R1910.DT_INI, data);
    //3
        Date data2 = sf.parse("05082012");
        model.setFieldValue(R1910.DT_FIN, data2);   
        
         StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1910|04082012|05082012|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
        
        
}
}
