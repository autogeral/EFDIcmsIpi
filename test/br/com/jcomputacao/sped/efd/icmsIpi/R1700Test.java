package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 15:00:34
 * @author Vinicius Diana
 */
public class R1700Test {
@Test
    public void R1700Test() {
    R1700 r = new R1700(); 
    LineModel model = r.createModel();
    //2
    model.setFieldValue(R1700.COD_DISP, "A1");
    //3
    model.setFieldValue(R1700.COD_MOD, "A1");
    //4
    model.setFieldValue(R1700.SER, "");
    //5
    model.setFieldValue(R1700.SUB, "");
    //6
    model.setFieldValue(R1700.NUM_DOC_INI, 12);
    //7
    model.setFieldValue(R1700.NUM_DOC_FIN, 12);
    //8
    model.setFieldValue(R1700.NUM_AUT, 12);
    
     StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1700|A1|A1|||12|12|12|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    
}
}