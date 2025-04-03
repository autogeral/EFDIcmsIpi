package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 11/02/2013 09:55:41
 * @author Vinicius Diana
 */
public class RE510Test {
@Test
public void RE510Test(){
    RE510 r = new RE510();
    LineModel model = r.createModel();
    
    //2
    model.setFieldValue(RE510.CFOP, 1123);
    //3
    model.setFieldValue(RE510.CST_IPI, "A1");
    //4
    model.setFieldValue(RE510.VL_CONT_IPI, 55.12);
    //5
    model.setFieldValue(RE510.VL_BC_IPI, 55.12);
    //6
    model.setFieldValue(RE510.VL_IPI, 55.12);
    
     StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E510|1123|A1|55,12|55,12|55,12|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}
}
