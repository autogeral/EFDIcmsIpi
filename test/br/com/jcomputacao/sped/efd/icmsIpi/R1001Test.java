package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 11/02/2013 14:01:22
 * @author Vinicius Diana
 */
public class R1001Test {
@Test
public void R1001Test(){
   R1001 r = new R1001();
   LineModel model = r.createModel();
    //2
   model.setFieldValue(R1001.IND_MOV, 1);
   StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1001|1|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}
}
