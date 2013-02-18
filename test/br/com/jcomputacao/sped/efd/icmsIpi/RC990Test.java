package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 15:39:42
 * @author Thiago Balthazar
 */
public class RC990Test {

    @Test
    public void RC990Test() {
        
        RC990 r = new RC990();
         
        LineModel model = r.createModel();
        
	model.setFieldValue(RC990.QTD_LIN_C , 12345789012L);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C990|12345789012|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
