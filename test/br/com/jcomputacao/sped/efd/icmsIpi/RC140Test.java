package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 16:56:32
 * @author Vinicius Diana
 */
public class RC140Test {
    
@Test
public void RC140Test(){
    RC140 r = new RC140();
    LineModel model = r.createModel();
    //2
    model.setFieldValue(RC140.IND_EMIT, "1");
    //3
    model.setFieldValue(RC140.IND_TIT, "A1");
    //4
    model.setFieldValue(RC140.DESC_TIT, "");
    //5
    model.setFieldValue(RC140.NUM_TIT, "A1");
    //6
    model.setFieldValue(RC140.QTD_PARC, 11);
    //7
    model.setFieldValue(RC140.VL_TIT, 11.50);
    
    
    StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C140|1|A1||A1|11|11,50|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);

}
}