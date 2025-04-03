package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 18/02/2013 14:28:46
 * @author Vinicius Diana
 */
public class RC601Test {
    @Test
    public void RC601Test(){
     RC601 r = new RC601();
    LineModel model = r.createModel(); 
    model.setFieldValue(RC601.NUM_DOC_CANC, 123456789);
    
      StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C601|123456789|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    }

}
