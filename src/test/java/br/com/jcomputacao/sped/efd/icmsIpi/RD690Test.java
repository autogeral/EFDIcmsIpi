package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 11/02/2013 14:25:15
 * @author Thiago Balthazar
 */
public class RD690Test {

    @Test
    public void RD690Test1() {
        
        RD690 r = new RD690();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(RD690.CST_ICMS, "123");
        model.setFieldValue(RD690.CFOP,1234);
        model.setFieldValue(RD690.ALIQ_ICMS,123.56);
        model.setFieldValue(RD690.VL_OPR,10d);
        model.setFieldValue(RD690.VL_BC_ICMS,10d);
        model.setFieldValue(RD690.VL_ICMS,10d);
        model.setFieldValue(RD690.VL_BC_ICMS_UF,10d);
        model.setFieldValue(RD690.VL_ICMS_UF,10d);
        model.setFieldValue(RD690.VL_RED_BC,10d);
        model.setFieldValue(RD690.COD_OBS , "AD5407");

        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D690|123|1234|123,56|10,00|10,00|10,00|10,00|10,00|10,00|AD5407|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
