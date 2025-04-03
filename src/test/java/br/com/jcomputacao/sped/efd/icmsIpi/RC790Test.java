package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 18/02/2013 17:16:27
 * @author Vinicius Diana
 */
public class RC790Test {
@ Test
public void RC790Test(){
    RC790 r = new RC790();
    LineModel model = r.createModel();
    //2
    model.setFieldValue(RC790.CST_ICMS, 123);
    //3
    model.setFieldValue(RC790.CFOP, 1234);
    //4
    model.setFieldValue(RC790.ALIQ_ICMS, 55.12);
    //5
    model.setFieldValue(RC790.VL_OPR, 55.12);
    //6
    model.setFieldValue(RC790.VL_BC_ICMS, 55.12);
    //7
    model.setFieldValue(RC790.VL_ICMS, 55.12);
    //8
    model.setFieldValue(RC790.VL_BC_ICMS_ST, 55.12);
    //9
    model.setFieldValue(RC790.VL_ICMS_ST, 55.12);
    //10
    model.setFieldValue(RC790.VL_RED_BC, 55.12);
    //11
    model.setFieldValue(RC790.COD_OBS, "C790");
    
    
     StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C790|123|1234|55,12|55,12|55,12|55,12|55,12|55,12|55,12|C790|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    
}
}
