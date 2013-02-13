/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 08/02/2013 08:57:06
 * @author Thiago Balthazar
 */
public class RD365Test {

    @Test
    public void RD365Test1(){
    
        RD365 r = new RD365();
        LineModel model = r.createModel();
        
        model.setFieldValue(RD365.COD_TOT_PAR, "455");
        model.setFieldValue(RD365.VLR_ACUM_TOT, 2000.00);
        model.setFieldValue(RD365.NR_TOT, 65);
        model.setFieldValue(RD365.DESCR_NR_TOT, "");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D365|455|2000,00|65||";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    
    }
    
     @Test
    public void RD365Test2(){
    
        RD365 r = new RD365();
        LineModel model = r.createModel();
        
        model.setFieldValue(RD365.COD_TOT_PAR, "F9652");
        model.setFieldValue(RD365.VLR_ACUM_TOT, 4568.00);
        model.setFieldValue(RD365.NR_TOT, 23);
        model.setFieldValue(RD365.DESCR_NR_TOT, "");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D365|F9652|4568,00|23||";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    
    }
}
