package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 11/02/2013 13:39:52
 * @author Vinicius Diana
 */
public class RH001Test {
@Test
public void RH001Test(){
    RH001 r = new RH001();
    LineModel model = r.createModel();
    //2
    model.setFieldValue(RH001.IND_MOV, "1");
     StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|H001|1|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}
}
