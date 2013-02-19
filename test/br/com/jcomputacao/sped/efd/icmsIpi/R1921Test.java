package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 11:51:40
 * @author Vinicius Diana
 */
public class R1921Test {
@Test
public void R1921(){
   R1921 r = new R1921();
    
    LineModel model = r.createModel(); 
    
    //2
    model.setFieldValue(R1921.COD_AJ_APUR, "12345678");
    //3
    model.setFieldValue(R1921.DESCR_COMPL_AJ, "");
    //4
    model.setFieldValue(R1921.VL_AJ_APUR, 55.12);
    
    
        StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|1921|12345678||55,12|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    
}
}
