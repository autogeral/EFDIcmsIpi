package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 13/02/2013 10:11:39
 * @author Vinicius Diana
 */
public class RC190Test {

    @Test
    public void RC190Test(){
      RC190 r = new RC190();
      LineModel model = r.createModel();
      //2
      model.setFieldValue(RC190.CST_ICMS, 461);
      //3
      model.setFieldValue(RC190.CFOP, 1411);
      //4
      model.setFieldValue(RC190.ALIQ_ICMS, 0.00);
      //5
      model.setFieldValue(RC190.VL_OPR, 96.43);
      //6
      model.setFieldValue(RC190.VL_BC_ICMS, 0.00);
      //7
      model.setFieldValue(RC190.VL_ICMS, 0.00);
      //8
      model.setFieldValue(RC190.VL_BC_ICMS_ST, 0.00);
      //9
      model.setFieldValue(RC190.VL_ICMS_ST, 0.00);
      //10
      model.setFieldValue(RC190.VL_RED_BC, 0.00);
      //11
      model.setFieldValue(RC190.VL_IPI, 0.00);
      //12
      model.setFieldValue(RC190.COD_OBS , "");
      
      StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C190|461|1411|0,00|96,43|0,00|0,00|0,00|0,00|0,00|0,00||";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
