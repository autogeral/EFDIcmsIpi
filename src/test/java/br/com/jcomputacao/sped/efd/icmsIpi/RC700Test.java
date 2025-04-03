package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 18/02/2013 16:37:58
 * @author Vinicius Diana
 */
public class RC700Test {
@Test
public void RC700Test() throws ParseException{
   RC700 r = new RC700();
    LineModel model = r.createModel();
    SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
    //2
    model.setFieldValue(RC700.COD_MOD, "A1");
    //3
    model.setFieldValue(RC700.SER, "A111");
    //4
    model.setFieldValue(RC700.NRO_ORD_INI, 123);
    //5
    model.setFieldValue(RC700.NRO_ORD_FIN, 123);
    //6
     Date data = sf.parse("04082012");
     model.setFieldValue(RC700.DT_DOC_INI, data);
     //7
     Date data2 = sf.parse("04082012");
     model.setFieldValue(RC700.DT_DOC_FIN, data2);
     //8
     model.setFieldValue(RC700.NOM_MEST, "C700");
     //9
     model.setFieldValue(RC700.CHV_COD_DIG, "chave");
     
      
        StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C700|A1|A111|123|123|04082012|04082012|C700|chave|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
}
}
