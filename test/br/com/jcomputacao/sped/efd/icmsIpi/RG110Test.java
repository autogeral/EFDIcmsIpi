package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 14/02/2013 09:18:40
 * @author Vinicius Diana
 */
public class RG110Test  {
@Test
    public void RG110Test() throws ParseException {
    RG110 r = new RG110();
    SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
    LineModel model = r.createModel();
     //2
        Date data = sf.parse("04082012");
        model.setFieldValue(RG110.DT_INI, data);
     //3
        Date data2 = sf.parse("15082012");
        model.setFieldValue(RG110.DT_FIN, data2); 
     //4
        model.setFieldValue(RG110.SALDO_IN_ICMS, 155.12);
     //5
        model.setFieldValue(RG110.SOM_PARC, 155.12);
          //6
        model.setFieldValue(RG110.VL_TRIB_EXP, 155.12);
          //7
        model.setFieldValue(RG110.VL_TOTAL, 155.12);
          //8
        model.setFieldValue(RG110.IND_PER_SAI, 155.12222222);
          //9
        model.setFieldValue(RG110.ICMS_APROP, 155.12);
          //10
        model.setFieldValue(RG110.SOM_ICMS_OC, 155.12);
        
        StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|G110|04082012|15082012|155,12|155,12|155,12|155,12|155,12|155,12|155,12|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
        
        
    }
}
