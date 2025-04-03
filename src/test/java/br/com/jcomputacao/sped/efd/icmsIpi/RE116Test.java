package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 06/02/2013 09:42:01
 * @author Vinicius Diana
 */
public class RE116Test {
@Test
public void RE116Test() throws ParseException{
    RE116 r = new RE116();
    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
    Date data= sdf.parse("01112012");
     SimpleDateFormat sdf2 = new SimpleDateFormat("MMyyyy");
    Date data2= sdf2.parse("112012");
    LineModel model = r.createModel();
     //2
    model.setFieldValue(RE116.COD_OR, "000");
    //3
    model.setFieldValue(RE116.VL_OR, 1222.55);
    //4
    model.setFieldValue(RE116.DT_VCTO, data);
    //5
    model.setFieldValue(RE116.COD_REC,"E555");
    //6
    model.setFieldValue(RE116.NUM_PROC, "1234567891234");
    //7
    model.setFieldValue(RE116.IND_PROC, "1");
    //8
    model.setFieldValue(RE116.PROC, "");
    //9
    model.setFieldValue(RE116.TXT_COMPL, "");
    //10
    model.setFieldValue(RE116.MES_REF, data2);
    
    StringBuffer sb = model.getRepresentation();
    String result = sb.toString();
    String expected = "|E116|000|1222,55|01112012|E555|1234567891234|1|||112012|";
    System.out.println("Excecting ....  : " + expected);
   System.out.println("Result    ....  : " + result);
    assertEquals(expected, result);
    
    
}
}
