package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * 05/02/2013 13:19:57
 * @author Vinicius Diana
 */
public class RE111Test {
@Test
 public void RE111Test() {
RE111 r = new RE111();
LineModel model =  r.createModel();  
 model.setFieldValue(RE111.COD_AJ_APUR, "SP029999");
 model.setFieldValue(RE111.DESCR_COMPL_AJ, "SALDO DEVEDOR P/ MATRIZ");
 model.setFieldValue(RE111.VL_AJ_APUR, 835.95);
 
  StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E111|SP029999|SALDO DEVEDOR P/ MATRIZ|835,95|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}
}
