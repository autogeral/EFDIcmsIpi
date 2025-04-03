package br.com.jcomputacao.sped.efd.icmsIpi;

import static org.junit.Assert.*;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
/**
 * 08/02/2013 09:16:00
 * @author Thiago Balthazar
 */
public class RD370Test {

    
    @Test
    public void RD370Test1(){
    
        RD370 r = new RD370();
        LineModel model = r.createModel();
    
        model.setFieldValue(RD370.COD_MUN_ORIG, 3589656);
        model.setFieldValue(RD370.VL_SERV, 30.00);
        model.setFieldValue(RD370.QTD_BILH, 50);
        model.setFieldValue(RD370.VL_BC_ICMS,150.00);
        model.setFieldValue(RD370.VL_ICMS, 180.00);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D370|3589656|30,00|50|150,00|180,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
    }
    
     @Test
    public void RD370Test2(){
    
        RD370 r = new RD370();
        LineModel model = r.createModel();
    
        model.setFieldValue(RD370.COD_MUN_ORIG, 3589987);
        model.setFieldValue(RD370.VL_SERV, 90.00);
        model.setFieldValue(RD370.QTD_BILH, 90);
        model.setFieldValue(RD370.VL_BC_ICMS,1500.00);
        model.setFieldValue(RD370.VL_ICMS, 1889.00);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D370|3589987|90,00|90|1500,00|1889,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
    }
    
    
}
