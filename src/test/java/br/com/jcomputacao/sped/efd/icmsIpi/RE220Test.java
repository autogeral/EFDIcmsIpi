package br.com.jcomputacao.sped.efd.icmsIpi;
import static org.junit.Assert.assertEquals;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;

/**
 * 08/02/2013 08:53:27
 * @author Vinicius Diana
 */
public class RE220Test {
@Test
public void RE220(){
  RE220 r = new RE220();
  LineModel model = r.createModel();
   //2
  model.setFieldValue(RE220.COD_AJ_APUR, "A1111111");
  //3
  model.setFieldValue(RE220.DESCR_COMPL_AJ, "");
  //4
  model.setFieldValue(RE220.VL_AJ_APUR, 55.12);
  
  
  StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|E220|A1111111||55,12|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
}
}
