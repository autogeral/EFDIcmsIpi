package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 15/02/2013 09:48:57
 * @author Vinicius Diana
 */
public class RH005Test  {

    @Test
    public void RH005Test() throws ParseException{
    RH005 r = new RH005();
    LineModel model = r.createModel();
    SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
    //2
     Date data = sf.parse("04082012");
     model.setFieldValue(RH005.DT_INV, data);
     //3
     model.setFieldValue(RH005.VL_INV, 100.55);
     //4
     model.setFieldValue(RH005.MOT_INV, "02");
     
       StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|H005|04082012|100,55|02|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
}
}
