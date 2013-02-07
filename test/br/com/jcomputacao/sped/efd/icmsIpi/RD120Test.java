package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 07/02/2013 11:09:06
 * @author Thiago Balthazar
 */
public class RD120Test {

    @Test
    public void RD120Test1(){
    RD120 r = new RD120();
    
    LineModel model = r.createModel();
    
    model.setFieldValue(RD120.COD_MUN_ORIG, 3589754L);
    model.setFieldValue(RD120.COD_MUN_DEST, 3589879L);
    model.setFieldValue(RD120.VEIC_ID, "cxz8090");
    model.setFieldValue(RD120.UF_ID, "SP");
    
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D120|3589754|3589879|cxz8090|SP|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
    
     @Test
    public void RD120Test2(){
    RD120 r = new RD120();
    
    LineModel model = r.createModel();
    
    model.setFieldValue(RD120.COD_MUN_ORIG,3589879L );
    model.setFieldValue(RD120.COD_MUN_DEST,3589754L );
    model.setFieldValue(RD120.VEIC_ID, "cxz8090");
    model.setFieldValue(RD120.UF_ID, "PR");
    
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D120|3589879|3589754|cxz8090|PR|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
