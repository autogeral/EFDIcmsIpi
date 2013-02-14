package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 14/02/2013 10:13:16
 * @author Vinicius Diana
 */
public class RG125Test {
    @Test

    public void RG125Test() throws ParseException {
        RG125 r = new RG125();
        LineModel model = r.createModel();
        SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
    
        
        //2
        model.setFieldValue(RG125.COD_IND_BEM, "123");
        //3
        Date data = sf.parse("04082012");
        model.setFieldValue(RG125.DT_MOV, data);
        //4
        model.setFieldValue(RG125.TIPO_MOV, "SI");
        //5
        model.setFieldValue(RG125.VL_IMOB_ICMS_OP, 55.13);
        //6
        model.setFieldValue(RG125.VL_IMOB_ICMS_ST, 55.13);
        //7
        model.setFieldValue(RG125.VL_IMOB_ICMS_FRT, 55.13);
        //8
        model.setFieldValue(RG125.VL_IMOB_ICMS_DIF, 55.13);
        //9
        model.setFieldValue(RG125.NUM_PARC, 5);
        //10
        model.setFieldValue(RG125.VL_PARC_PASS, 55.13);
        
           StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|G125|123|04082012|SI|55,13|55,13|55,13|55,13|5|55,13|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
        
    }
    

}
