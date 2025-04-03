package br.com.jcomputacao.sped.efd.icmsIpi;

import static org.junit.Assert.*;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;

/**
 * 07/02/2013 10:53:44
 * @author Thiago Balthazar
 */
public class RD301Test {

    @Test
    public void RD301Test1(){
    
        RD301 r = new RD301();
        
        LineModel model = r.createModel();
        
        model.setFieldValue(RD301.NUM_DOC_CANC, 12587);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D301|12587|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    
    }
    
    
     @Test
    public void RD301Test2(){
    
        RD301 r = new RD301();
        
        LineModel model = r.createModel();
        
        model.setFieldValue(RD301.NUM_DOC_CANC, 11549);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D301|11549|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    
    }
}
