package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 11/02/2013 11:25:34
 * @author Vinicius Diana
 */
public class RG001Test {
@Test
public void RG001Test(){
  RG001 r = new RG001();
  LineModel model = r.createModel();
  
  //2
  model.setFieldValue(RG001.IND_MOV, "1");
    StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|G001|1|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}
}
