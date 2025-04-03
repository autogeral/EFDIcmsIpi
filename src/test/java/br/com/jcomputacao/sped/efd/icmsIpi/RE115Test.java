package br.com.jcomputacao.sped.efd.icmsIpi;
import static org.junit.Assert.assertEquals;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;

/**
 * 06/02/2013 08:32:51
 * @author Vinicius Diana
 */
public class RE115Test {
@Test
public void RE115Test(){
   RE115 r = new RE115();
   LineModel model =  r.createModel();
    //2
   model.setFieldValue(RE115.COD_INF_ADIC, "35226122");
   //3
   model.setFieldValue(RE115.VL_INF_ADIC, 55.12);
   //4
   model.setFieldValue(RE115.DESCR_COMPL_AJ, "");
   
   StringBuffer sb = model.getRepresentation();
   String result = sb.toString();
   String expected = "|E115|35226122|55,12||";
   
   System.out.println("Excecting ....  : " + expected);
   System.out.println("Result    ....  : " + result);
    assertEquals(expected, result);
}

}
