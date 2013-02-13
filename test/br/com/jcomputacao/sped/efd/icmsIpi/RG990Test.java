package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 13/02/2013 09:26:48
 * @author Thiago Balthazar
 */
public class RG990Test {

     @Test
    public void RD990Test() {
        
        RG990 r = new RG990();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(RG990.QTD_LIN_G, 123);
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|G990|123|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
