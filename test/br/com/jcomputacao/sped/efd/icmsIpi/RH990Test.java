package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import static org.junit.Assert.assertEquals;

/**
 * 11/02/2013 13:48:49
 * @author Vinicius Diana
 */
public class RH990Test {
@Test
 public void RH990Test(){
    RH990 r = new RH990();
    LineModel model = r.createModel();
    //2
    model.setFieldValue(RH990.QTD_LIN_H, 1);
     StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|H990|1|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}

   
}
