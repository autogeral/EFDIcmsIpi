package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 07/02/2013 11:32:10
 * @author Thiago Balthazar
 */
public class RD310Test {

    @Test
    public void RD310Test1(){
    
    RD310 r = new RD310();
    
    LineModel model = r.createModel();
    
    model.setFieldValue(RD310.COD_MUN_ORIG, 3578987);
    model.setFieldValue(RD310.VL_SERV, 45.22);
    model.setFieldValue(RD310.VL_BC_ICMS, 500.00);
    model.setFieldValue(RD310.VL_ICMS, 545.22);
    
    StringBuffer sb = model.getRepresentation();
    String result = sb.toString();
    String expected = "|D310|3578987|45,22|500,00|545,22|";

    System.out.println("Excecting ....  : " + expected);
    System.out.println("Result    ....  : " + result);
    assertEquals(expected, result);
    
    }
    
     @Test
    public void RD310Test2(){
    
    RD310 r = new RD310();
    
    LineModel model = r.createModel();
    
    model.setFieldValue(RD310.COD_MUN_ORIG, 3578999);
    model.setFieldValue(RD310.VL_SERV, 50.22);
    model.setFieldValue(RD310.VL_BC_ICMS, 600.00);
    model.setFieldValue(RD310.VL_ICMS, 650.22);
    
    StringBuffer sb = model.getRepresentation();
    String result = sb.toString();
    String expected = "|D310|3578999|50,22|600,00|650,22|";

    System.out.println("Excecting ....  : " + expected);
    System.out.println("Result    ....  : " + result);
    assertEquals(expected, result);
    
    }
}
