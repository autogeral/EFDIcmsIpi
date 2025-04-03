package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 11/02/2013 08:49:59
 * @author Vinicius Diana
 */
public class RE250Test {
@Test
 
 public void RE250Test() throws ParseException {
    RE250 r = new RE250();
    LineModel model = r.createModel();
    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
    Date data= sdf.parse("01112012");
     SimpleDateFormat sdf2 = new SimpleDateFormat("MMyyyy");
    Date data2= sdf2.parse("112012");
    
    //2
    model.setFieldValue(RE250.COD_OR, "A12");
    //3
    model.setFieldValue(RE250.VL_OR, 55.12);
    //4
    model.setFieldValue(RE250.DT_VCTO, data);
    //5
    model.setFieldValue(RE250.COD_REC, "");
    //6
    model.setFieldValue(RE250.NUM_PROC, "");
    //7
    model.setFieldValue(RE250.IND_PROC, "1");
    //8
    model.setFieldValue(RE250.PROC, "");
    //9
    model.setFieldValue(RE250.TXT_COMPL, "");
    //10
    model.setFieldValue(RE250.MES_REF, data2);
    
    StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|E250|A12|55,12|01112012|||1|||112012|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}
