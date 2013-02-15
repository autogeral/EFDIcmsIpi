package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 15/02/2013 09:29:58
 * @author Vinicius Diana
 */
public class RG140Test {
@Test
public void RG140Test(){
    RG140 r = new RG140();
    LineModel model = r.createModel();
    
    //2
    model.setFieldValue(RG140.NUM_ITEM, 111);
    //3
    model.setFieldValue(RG140.COD_ITEM, "a111");
    StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|G140|111|a111|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    
    
}
}
