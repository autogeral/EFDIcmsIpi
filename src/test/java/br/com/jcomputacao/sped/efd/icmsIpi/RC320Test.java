package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 14/02/2013 10:15:16
 * @author Thiago Balthazar
 */
public class RC320Test  {

    	
    @Test
    public void RC320Test1() {
        
        RC320 r = new RC320();
              
        LineModel model = r.createModel();
        
	model.setFieldValue(RC320.CST_ICMS, 123);
        model.setFieldValue(RC320.CFOP, 1234);
        model.setFieldValue(RC320.ALIQ_ICMS, 123456.12);
        model.setFieldValue(RC320.VL_OPR, 0d);
        model.setFieldValue(RC320.VL_BC_ICMS, 0d);
        model.setFieldValue(RC320.VL_ICMS, 0d);
        model.setFieldValue(RC320.VL_RED_BC, 0d);
        model.setFieldValue(RC320.COD_OBS, "123456");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C320|123|1234|123456,12|0,00|0,00|0,00|0,00|123456|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
