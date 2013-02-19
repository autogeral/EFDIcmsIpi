package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * 19/02/2013 12:25:20
 * @author Thiago Balthazar
 */
public class R1390Test {
    
    @Test
    public void R1390Test() {
        
        R1390 r = new R1390();
               
        LineModel model = r.createModel();
        
	model.setFieldValue(R1390.COD_PROD ,02);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1390|02|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}
