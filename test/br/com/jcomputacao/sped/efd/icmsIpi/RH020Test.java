package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 15/02/2013 11:02:56
 * @author Vinicius Diana
 */
public class RH020Test {
@ Test
public void RH020Test(){
     RH020 r = new RH020();
    LineModel model = r.createModel();
    //2
    model.setFieldValue(RH020.CST_ICMS, 123);
    //3
    model.setFieldValue(RH020.BC_ICMS, 55.12);
    //4
    model.setFieldValue(RH020.VL_ICMS, 55.12);
    
     StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|H020|123|55,12|55,12|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    
}
}
