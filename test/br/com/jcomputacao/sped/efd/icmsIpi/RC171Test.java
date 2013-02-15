package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 15/02/2013 11:08:36
 * @author Thiago Balthazar
 */
public class RC171Test {

    
    @Test
    public void RC171Test(){
    
        RC171 r = new RC171();
        LineModel model = r.createModel();
        
        model.setFieldValue(RC171.NUM_TANQUE, "123");
        model.setFieldValue(RC171.QTDE, 120.123);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C171|123|120,123|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    
    }
    
}
