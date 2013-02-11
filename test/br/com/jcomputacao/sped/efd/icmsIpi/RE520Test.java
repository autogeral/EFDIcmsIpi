package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 11/02/2013 10:20:45
 * @author Vinicius Diana
 */
public class RE520Test {
@Test
public void RE520Test(){
    RE520 r = new RE520();
    LineModel model = r.createModel();
     //2
    model.setFieldValue(RE520.VL_SD_ANT_IPI, 55.12);
    //3
    model.setFieldValue(RE520.VL_DEB_IPI, 55.12);
    //4
    model.setFieldValue(RE520.VL_CRED_IPI, 55.12);
    //5
    model.setFieldValue(RE520.VL_OD_IPI, 55.12);
    //6
    model.setFieldValue(RE520.VL_OC_IPI, 55.12);
    //7
    model.setFieldValue(RE520.VL_SC_IPI, 55.12);
    //8
    model.setFieldValue(RE520.VL_SD_IPI, 55.12);
     StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E520|55,12|55,12|55,12|55,12|55,12|55,12|55,12|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}
}
