package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 * 14/02/2013 09:55:30
 * @author Thiago Balthazar
 */
public class RC310Test {

    @Test
    public void RC310Tes1(){
        
        RC310 r = new RC310();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(RC310.NUM_DOC_CANC, 123456789);
         
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C310|123456789|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
