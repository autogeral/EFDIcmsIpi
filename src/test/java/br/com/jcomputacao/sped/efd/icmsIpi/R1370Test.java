package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * 19/02/2013 12:18:57
 * @author Thiago Balthazar
 */
public class R1370Test {

     @Test
    public void R1370Test(){
        
        R1370 r = new R1370();
              
        LineModel model = r.createModel();
        
	model.setFieldValue(R1370.NUM_BICO   , 990);
        model.setFieldValue(R1370.COD_ITEM   , "00002254889314");
        model.setFieldValue(R1370.NUM_TANQUE , "564");
                
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1370|990|00002254889314|564|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
    
}
