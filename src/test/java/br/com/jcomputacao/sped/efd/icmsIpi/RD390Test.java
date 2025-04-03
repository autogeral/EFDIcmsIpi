package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * 08/02/2013 09:49:17
 * @author Thiago Balthazar
 */
public class RD390Test {

    
    @Test
    public void RD390Test1(){
    
        RD390 r = new RD390();
        LineModel model = r.createModel();
        
        model.setFieldValue(RD390.CST_ICMS, 652);//2
        model.setFieldValue(RD390.CFOP, 1234);//3
        model.setFieldValue(RD390.ALIQ_ICMS, 121.20);//4
        model.setFieldValue(RD390.VL_OPR, 10.10);//5
        model.setFieldValue(RD390.VL_BC_ISSQN,1.56);//6
        model.setFieldValue(RD390.ALIQ_ISSQN,123.21);//7
        model.setFieldValue(RD390.VL_ISSQN, 100.00);//8
        model.setFieldValue(RD390.VL_BC_ICMS, 23d);//9
        model.setFieldValue(RD390.VL_ICMS, 100.00);//10
        model.setFieldValue(RD390.COD_OBS, "2");//11
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D390|652|1234|121,20|10,10|1,56|123,21|23,00|100,00|2|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    
    }
    
}
