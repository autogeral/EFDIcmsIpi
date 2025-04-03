package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 11/02/2013 11:01:59
 * @author Vinicius Diana
 */
public class RE990Test {

    @Test
    public void RE990(){
       RE990 r = new RE990();
       LineModel model = r.createModel();
       //2
       model.setFieldValue(RE990.QTD_LIN_E, 2123l);
       
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E990|2123|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
