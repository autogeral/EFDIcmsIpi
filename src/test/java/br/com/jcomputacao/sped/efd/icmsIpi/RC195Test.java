package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 13/02/2013 10:49:04
 * @author Vinicius Diana
 */
public class RC195Test {
@Test
public void RC195Test(){
   RC195 r = new RC195();
   LineModel model = r.createModel();
   //2
   model.setFieldValue(RC195.COD_OBS, "1");
   //3
   model.setFieldValue(RC195.TXT_COMPL, "R$ 849,30");
   
   
   
    StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C195|1|R$ 849,30|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}
}
