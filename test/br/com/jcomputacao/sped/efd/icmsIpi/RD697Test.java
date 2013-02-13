package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 13/02/2013 08:24:27
 * @author Thiago Balthazar
 */
public class RD697Test {

    	
    @Test
    public void RD697Test() {
        
        RD697 r = new RD697();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(RD697.UF ,"SP" );
        model.setFieldValue(RD697.VL_BC_ICMS, 100.00);
        model.setFieldValue(RD697.VL_ICMS, 100.00);
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D697|SP|100,00|100,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
