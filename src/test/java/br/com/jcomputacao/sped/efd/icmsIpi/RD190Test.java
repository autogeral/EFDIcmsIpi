package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 07/02/2013 08:53:43
 * @author Thiago Balthazar
 */
public class RD190Test {
    
    @Test
    public void RD190Test1(){
    
        RD190 r = new RD190();
        
        LineModel model = r.createModel();
        
        model.setFieldValue(RD190.CST_ICMS, 444);
        model.setFieldValue(RD190.CFOP, 5122);
        model.setFieldValue(RD190.ALIQ_ICMS, 56.22);               
        model.setFieldValue(RD190.VL_OPR , 1500.10);
        model.setFieldValue(RD190.VL_BC_ICMS ,100.50);
        model.setFieldValue(RD190.VL_ICMS , 100.50);
        model.setFieldValue(RD190.VL_RED_BC , 300.20);        
        model.setFieldValue(RD190.COD_OBS , "2");
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D190|444|5122|56,22|1500,10|100,50|100,50|300,20|2|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
       
      }    
}
