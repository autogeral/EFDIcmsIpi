package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * 19/02/2013 14:22:37
 * @author Vinicius Diana
 */
public class R1800Test {
 @Test
    public void R1800Test() {
    R1800 r = new R1800();
    
    LineModel model = r.createModel();
    //2
      model.setFieldValue(R1800.VL_CARGA, 55.11);
    //3
      model.setFieldValue(R1800.VL_PASS, 55.11);
    //4
      model.setFieldValue(R1800.VL_FAT, 55.11);
    //5
     model.setFieldValue(R1800.IND_RAT, 55.111111);
      //6
     model.setFieldValue(R1800.VL_ICMS_ANT, 55.11);
     //7
     model.setFieldValue(R1800.VL_BC_ICMS, 55.11);
     //8
     model.setFieldValue(R1800.VL_ICMS_APUR, 55.11);
     //9
     model.setFieldValue(R1800.VL_BC_ICMS_APUR, 55.11);
     //10
     model.setFieldValue(R1800.VL_DIF, 55.11);
     
     
        StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1800|55,11|55,11|55,11|55,111111|55,11|55,11|55,11|55,11|55,11|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
     
     
}
}