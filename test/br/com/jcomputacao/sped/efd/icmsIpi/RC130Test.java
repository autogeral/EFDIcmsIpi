package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 19/02/2013 17:18:46
 * @author Vinicius Diana
 */
public class RC130Test {
    @Test
    public void RC130Test(){
      RC130 r = new RC130();
      LineModel model = r.createModel();
      
      //2
      model.setFieldValue(RC130.VL_SERV_NT, 55.11);
      //3
      model.setFieldValue(RC130.VL_BC_ISSQN, 55.11);
      //4
      model.setFieldValue(RC130.VL_ISSQN, 55.11);
      //5
      model.setFieldValue(RC130.VL_BC_IRRF, 55.11);
      //6
       model.setFieldValue(RC130.VL_IRRF, 55.11);
       //7
        model.setFieldValue(RC130.VL_BC_PREV, 55.11);
        //8
         model.setFieldValue(RC130.VL_PREV, 55.11);
         
         StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C130|55,11|55,11|55,11|55,11|55,11|55,11|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    }

}
