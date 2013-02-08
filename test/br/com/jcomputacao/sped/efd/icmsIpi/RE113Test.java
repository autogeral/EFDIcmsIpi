package br.com.jcomputacao.sped.efd.icmsIpi;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * 05/02/2013 16:41:43
 * @author Vinicius Diana
 */
public class RE113Test {
@Test
public void RE113Test() throws ParseException{
    RE113 r = new RE113();
    LineModel model = r.createModel();
    
    //2
    model.setFieldValue(RE113.COD_PART, "00222222222");
    //3
    model.setFieldValue(RE113.COD_MOD, "12");
    //4
    model.setFieldValue(RE113.SER, "444");
    //5
    model.setFieldValue(RE113.SUB, 123);
    //6
    model.setFieldValue(RE113.NUM_DOC, 123456789);
    //7
    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
    Date data = sdf.parse("01112012");
    model.setFieldValue(RE113.DT_DOC, data);
    //8
    model.setFieldValue(RE113.COD_ITEM, "333");
    //9
  model.setFieldValue(RE113.VL_AJ_ITEM, 33.55);
  
  
  StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E113|00222222222|12|444|123|123456789|01112012|333|33,55|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    
}
}
