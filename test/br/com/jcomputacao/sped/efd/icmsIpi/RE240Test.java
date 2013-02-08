package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 08/02/2013 10:47:55
 * @author Vinicius Diana
 */
public class RE240Test {
@Test
public void RE240() throws ParseException{
    RE240 r = new RE240();
    LineModel model = r.createModel();
     //2
    model.setFieldValue(RE240.COD_PART, "E111");
    //3
    model.setFieldValue(RE240.COD_MOD, "02");
    //4
    model.setFieldValue(RE240.SER, "");
    //5
    model.setFieldValue(RE240.SUB, 12 );
    //6
    model.setFieldValue(RE240.NUM_DOC, 55);
    //7
   SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
   Date data= sdf.parse("01112012");
    model.setFieldValue(RE240.DT_DOC, data);
    //8
    model.setFieldValue(RE240.COD_ITEM, "");
    //9
    model.setFieldValue(RE240.VL_AJ_ITEM, 22.12);
    
     StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|E240|E111|02||12|55|01112012||22,12|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
}
}
