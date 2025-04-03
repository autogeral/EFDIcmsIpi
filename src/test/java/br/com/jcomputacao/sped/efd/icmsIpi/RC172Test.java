package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 15/02/2013 11:19:49
 * @author Thiago Balthazar
 */
public class RC172Test {

    	
    @Test
    public void RC172Test() {
       
            RC172 r = new RC172();
              
        LineModel model = r.createModel();
        
	model.setFieldValue(RC172.VL_BC_ISSQN, 120.00);
        model.setFieldValue(RC172.ALIQ_ISSQN, 120123.00);
        model.setFieldValue(RC172.VL_ISSQN, 120.00);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C172|120,00|120123,00|120,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
