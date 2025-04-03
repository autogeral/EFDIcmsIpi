package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 11/02/2013 09:16:48
 * @author Thiago Balthazar
 */
public class RD420Test {

     @Test
    public void RD420Test1() {
        
        RD420 r = new RD420();
               
        LineModel model = r.createModel();
        
	model.setFieldValue(r.COD_MUN_ORIG, 3512345);
        model.setFieldValue(r.VL_SERV, 10d);
        model.setFieldValue(r.VL_BC_ICMS, 10d);
        model.setFieldValue(r.VL_ICMS, 10d);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|R420|3512345|10,00|10,00|10,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
