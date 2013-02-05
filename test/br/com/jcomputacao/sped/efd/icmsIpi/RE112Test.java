package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * 05/02/2013 14:07:51
 * @author Vinicius Diana
 */
public class RE112Test {
@Test
public void RE112Test(){
 RE112 r = new RE112();
 LineModel model = r.createModel();
 //2
 model.setFieldValue(RE112.NUM_DA, "");
 //3
 model.setFieldValue(RE112.NUM_PROC, "");
 // 4
 model.setFieldValue(RE112.IND_PROC, "1");
 //5
 model.setFieldValue(RE112.PROC, "Exemplo");
 //6
 model.setFieldValue(RE112.TXT_COMPl, "Exemplo");
 
 
 
 
 StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E112|||1|Exemplo|Exemplo|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}

}
