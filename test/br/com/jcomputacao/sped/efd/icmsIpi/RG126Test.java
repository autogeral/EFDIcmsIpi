package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 14/02/2013 10:56:03
 * @author Vinicius Diana
 */
public class RG126Test {
@Test
 public void RG126Test() throws ParseException{
    RG126 r = new RG126();
    LineModel model = r.createModel();
    SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
    //2
     Date data = sf.parse("04082012");
     model.setFieldValue(RG126.DT_INI, data);
     //3
      Date data2 = sf.parse("05082012");
     model.setFieldValue(RG126.DT_FIM, data2);
     //4
     model.setFieldValue(RG126.NUM_PARC, 111);
     //5
     model.setFieldValue(RG126.VL_PARC_PASS, 55.12);
     //6
     model.setFieldValue(RG126.VL_TRIB_OC, 55.12);
     //7
       model.setFieldValue(RG126.VL_TOTAL, 55.12);
       //8
        model.setFieldValue(RG126.IND_PER_SAI, 55.12222222);
        //9
        model.setFieldValue(RG126.VL_PARC_APROP, 55.12);
         StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|G126|04082012|05082012|111|55,12|55,12|55,12|55,12222222|55,12|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
}
}
