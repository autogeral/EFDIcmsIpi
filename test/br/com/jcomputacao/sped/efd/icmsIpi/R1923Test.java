package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 11:02:48
 * @author Vinicius Diana
 */
public class R1923Test {
@Test
    public void R1923Test() throws ParseException  {
    R1923 r = new R1923();
    LineModel model = r.createModel();
     SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
    //2
    model.setFieldValue(R1923.COD_PART,"R1923");
    //3
    model.setFieldValue(R1923.COD_MOD, "A1");
    //4
    model.setFieldValue(R1923.SER, "");
    //5
    model.setFieldValue(R1923.SUB, 123);
    //6
    model.setFieldValue(R1923.NUM_DOC, 123);
    //7
       Date data = sf.parse("04082012");
        model.setFieldValue(R1923.DT_DOC, data);
     //8
        model.setFieldValue(R1923.COD_ITEM, "");
     //9
        model.setFieldValue(R1923.VL_AJ_ITEM, 55.11);
        
       StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1923|R1923|A1||123|123|04082012||55,11|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result); 
    
}
    
}
