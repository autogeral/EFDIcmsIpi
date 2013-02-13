package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 11/02/2013 11:27:17
 * @author Thiago Balthazar
 */
public class RD590Test {

     @Test
    public void RD590Test1() {
        
        RD590 r = new RD590();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(RD590.CST_ICMS, 123);
        model.setFieldValue(RD590.CFOP, 1234);
        model.setFieldValue(RD590.ALIQ_ICMS,123.56);
        model.setFieldValue(RD590.VL_OPR,10d);
        model.setFieldValue(RD590.VL_BC_ICMS,10d);
        model.setFieldValue(RD590.VL_ICMS, 10d);
        model.setFieldValue(RD590.VL_BC_ICMS_UF, 10d);
        model.setFieldValue(RD590.VL_ICMS_UF, 10d);
        model.setFieldValue(RD590.VL_RED_BC, 10d);
        model.setFieldValue(RD590.COD_OBS,"A12345");
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D590|123|1234|123,56|10,00|10,00|10,00|10,00|10,00|10,00|A12345|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
