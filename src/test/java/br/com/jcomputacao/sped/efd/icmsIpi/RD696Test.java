package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 11/02/2013 15:43:43
 * @author Thiago Balthazar
 */
public class RD696Test {

    	
    @Test
    public void RD696Test() {
        
        RD696 r = new RD696();
                      
        LineModel model = r.createModel();
        
	model.setFieldValue(RD696.CST_ICMS, 123);
        model.setFieldValue(RD696.CFOP, 1234);
        model.setFieldValue(RD696.ALIQ_ICMS, 123456.12 );
        model.setFieldValue(RD696.VL_OPR, 10.00);
        model.setFieldValue(RD696.VL_BC_ICMS, 10.00);
        model.setFieldValue(RD696.VL_ICMS, 10.00);
        model.setFieldValue(RD696.VL_BC_ICMS_UF,10.00 );
        model.setFieldValue(RD696.VL_ICMS_UF,10.00);
        model.setFieldValue(RD696.VL_RED_BC, 10.00);
        model.setFieldValue(RD696.COD_OBS, "abcdef");
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D696|123|1234|123456,12|10,00|10,00|10,00|10,00|10,00|10,00|abcdef|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
