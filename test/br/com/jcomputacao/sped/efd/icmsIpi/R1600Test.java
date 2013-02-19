package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 15:20:31
 * @author Vinicius Diana
 */
public class R1600Test {
@Test
public void R1600Test(){
   R1600 r = new R1600();
   LineModel model = r.createModel();
   //2
   model.setFieldValue(R1600.COD_PART, "A111");
   //3
   model.setFieldValue(R1600.TOT_CREDITO, 55.11);
   //4
   model.setFieldValue(R1600.TOT_DEBITO, 55.11);
   
         StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1600|A111|55,11|55,11|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
   
}
}
