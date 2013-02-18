package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 11:57:41
 * @author Thiago Balthazar
 */
public class RC410Test {
    	
    @Test
    public void RC410Test() {
        
        RC410 r = new RC410();
              
        LineModel model = r.createModel();
        
	model.setFieldValue(RC410.VL_PIS , 100.55 );
        model.setFieldValue(RC410.VL_COFINS , 100.55 );
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C410|100,55|100,55|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
