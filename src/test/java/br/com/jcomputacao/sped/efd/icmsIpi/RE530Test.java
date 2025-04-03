package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 11/02/2013 10:47:50
 * @author Vinicius Diana
 */
public class RE530Test {
@Test
public void RE530Test(){
    RE530 r = new RE530();
    
    LineModel model = r.createModel();
    //2
    model.setFieldValue(RE530.IND_AJ, ("1"));
    //3
    model.setFieldValue(RE530.VL_AJ, 55.12);
    //4
    model.setFieldValue(RE530.COD_AJ, "A12");
    //5
    model.setFieldValue(RE530.IND_DOC, "1");
    //6
    model.setFieldValue(RE530.NUM_DOC, "");
    //7
    model.setFieldValue(RE530.DESCR_AJ, "Campo07");
    
    StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E530|1|55,12|A12|1||Campo07|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}
}
