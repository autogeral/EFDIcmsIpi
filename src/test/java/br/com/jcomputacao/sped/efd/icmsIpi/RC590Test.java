package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 18/02/2013 11:50:18
 * @author Vinicius Diana
 */
public class RC590Test {
@Test
public void RC590Test(){
    
      RC590 r = new RC590();
    LineModel model = r.createModel();
    
    //2
    model.setFieldValue(RC590.CST_ICMS, 123);
    //3
    model.setFieldValue(RC590.CFOP ,1234);
    //4
    model.setFieldValue(RC590.ALIQ_ICMS, 55.11);
    //5
    model.setFieldValue(RC590.VL_OPR, 55.11);
    //6
    model.setFieldValue(RC590.VL_BC_ICMS, 55.11);
     //7
      model.setFieldValue(RC590.VL_ICMS, 55.11);
      //8
      model.setFieldValue(RC590.VL_BC_ICMS_ST, 55.11);
      //9
      model.setFieldValue(RC590.VL_ICMS_ST, 55.11);
        //10
      model.setFieldValue(RC590.VL_RED_BC, 55.11);
        //11
      model.setFieldValue(RC590.COD_OBS,"C590" );
        
      
       StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C590|123|1234|55,11|55,11|55,11|55,11|55,11|55,11|55,11|C590|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
        
        
}
}
