package br.com.jcomputacao.sped.efd.icmsIpi;

import static org.junit.Assert.*;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.Test;

/**
 * 08/02/2013 08:44:49
 * @author Thiago Balthazar
 */
public class RD360Test {

  @Test
    public void RD360Test1() {
        
        RD360 r = new RD360();
                      
        LineModel model = r.createModel();
        
        model.setFieldValue(RD360.VL_PIS, 250.00 );
        model.setFieldValue(RD360.VL_COFINS, 250.00);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D360|250,00|250,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
  }
  
   @Test
    public void RD360Test2() {
        
        RD360 r = new RD360();
                      
        LineModel model = r.createModel();
        
        model.setFieldValue(RD360.VL_PIS, 100.00 );
        model.setFieldValue(RD360.VL_COFINS, 100.00);
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D360|100,00|100,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
  }
        
    
}
