package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 14:42:30
 * @author Vinicius Diana
 */
public class R1710Test {
@Test
    public void R1710Test() {
    R1710 r = new R1710();
    LineModel model = r.createModel();
    //2
    model.setFieldValue(R1710.NUM_DOC_INI, 111);
    //3
    model.setFieldValue(R1710.NUM_DOC_FIN, 112);
    
    StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1710|111|112|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
        
    
}
}