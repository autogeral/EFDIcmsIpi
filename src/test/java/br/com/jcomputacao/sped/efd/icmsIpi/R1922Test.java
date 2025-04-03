package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 11:20:15
 * @author Vinicius Diana
 */
public class R1922Test {
@Test
    public void R1922Test() {
    R1922 r = new R1922();

    LineModel model = r.createModel();
    
    
    //2
    model.setFieldValue(R1922.NUM_DA, "");
    //3
    model.setFieldValue(R1922.NUM_PROC, "");
    //4
    model.setFieldValue(R1922.IND_PROC, "1");
    //5
    model.setFieldValue(R1922.PROC, "");
    //6
    model.setFieldValue(R1922.TXT_COMPL, "");
    
    StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1922|||1|||";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
        
    
}
}
