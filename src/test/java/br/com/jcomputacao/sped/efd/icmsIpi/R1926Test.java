package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 10:16:07
 * @author Vinicius Diana
 */
public class R1926Test {
@Test
    public void R1926Test() throws ParseException {
    R1926 r = new R1926();
    SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
    SimpleDateFormat sf2 = new SimpleDateFormat("MMyyyy");
    LineModel model = r.createModel();
    
    //2
    model.setFieldValue(R1926.COD_OR, "A12");
    //3
    model.setFieldValue(R1926.VL_OR, 55.11);
    //4
        Date data = sf.parse("04082012");
        model.setFieldValue(R1926.DT_VCTO, data);
    //5
        model.setFieldValue(R1926.COD_REC, "R1926");
    //6
        model.setFieldValue(R1926.NUM_PROC, "123");
    //7
        model.setFieldValue(R1926.IND_PROC, "1");
    //8
        model.setFieldValue(R1926.PROC, "R1926");
    //9
        model.setFieldValue(R1926.TXT_COMPL, "R1926");
     //10
      Date data2 = sf2.parse("082012");
       model.setFieldValue(R1926.MES_REF, data2); 
       
       
        StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1926|A12|55,11|04082012|R1926|123|1|R1926|R1926|082012|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
        
        
}
}
