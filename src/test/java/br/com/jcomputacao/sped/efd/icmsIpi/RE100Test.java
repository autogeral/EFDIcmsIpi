package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * 05/02/2013 10:19:41
 * @author Vinicius Diana
 */
public class RE100Test {
  
@Test
public void RE100Test() throws ParseException{
RE100 r = new RE100();
LineModel model =  r.createModel();
 SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
 Date data= sdf.parse("01112012");
 SimpleDateFormat sdf2 = new SimpleDateFormat("ddMMyyyy");
 Date data2= sdf.parse("30112012");
 //2
model.setFieldValue(RE100.DT_INI,data);
//3
model.setFieldValue(RE100.DT_FIN,data2);

StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E100|01112012|30112012|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}
}
