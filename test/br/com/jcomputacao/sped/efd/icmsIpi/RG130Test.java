package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 15/02/2013 08:36:14
 * @author Vinicius Diana
 */
public class RG130Test {
@Test
public void RG130Test() throws ParseException{
     RG130 r = new RG130();
        LineModel model = r.createModel();
        SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
        //2
          model.setFieldValue(RG130.IND_EMIT, "1");
        //3
          model.setFieldValue(RG130.COD_PART, "abc5555");
        //4
        model.setFieldValue(RG130.COD_MOD, "SI");
        //5
        model.setFieldValue(RG130.SERIE, "A11");
        //6
        model.setFieldValue(RG130.NUM_DOC, 111);
        //7
        model.setFieldValue(RG130.CHV_NFE_CTE, "12345678911234567891123456789112345678911234");
        //8
         Date data = sf.parse("04082012");
        model.setFieldValue(RG130.DT_DOC, data);
         StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|G130|1|abc5555|SI|A11|111|12345678911234567891123456789112345678911234|04082012|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
}
}
