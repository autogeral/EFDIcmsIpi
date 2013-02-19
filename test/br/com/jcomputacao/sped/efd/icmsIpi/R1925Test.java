package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * 19/02/2013 10:40:23
 * @author Vinicius Diana
 */
public class R1925Test {
@Test
    public void R1925Test() {
    R1925 r = new R1925();
    
    LineModel model = r.createModel();
    
    //2
    model.setFieldValue(R1925.COD_INF_ADIC, "12345678");
    //3
    model.setFieldValue(R1925.VL_INF_ADIC, 55.11);
    //4
    model.setFieldValue(R1925.DESCR_COMPL_AJ, "R1925");
    
     StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1925|12345678|55,11|R1925|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
}
}
