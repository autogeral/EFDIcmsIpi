package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 15:26:52
 * @author Thiago Balthazar
 */
public class R1510Test {

    @Test
    public void R1510Test() {
        
        R1510 r = new R1510();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(R1510.NUM_ITEM , 123 );
        model.setFieldValue(R1510.COD_ITEM , "0012546");
        model.setFieldValue(R1510.COD_CLASS , 1234);
        model.setFieldValue(R1510.QTD , 123.123);
        model.setFieldValue(R1510.UNID , "123456");
        model.setFieldValue(R1510.VL_ITEM , 100.00);
        model.setFieldValue(R1510.VL_DESC , 100.00);
        model.setFieldValue(R1510.CST_ICMS , 123);
        model.setFieldValue(R1510.CFOP , 1234);
        model.setFieldValue(R1510.VL_BC_ICMS , 100.00);
        model.setFieldValue(R1510.ALIQ_ICMS , 123456.12);
        model.setFieldValue(R1510.VL_ICMS , 100.00);
        model.setFieldValue(R1510.VL_BC_ICMS_ST , 100.00);
        model.setFieldValue(R1510.ALIQ_ST , 100.00);
        model.setFieldValue(R1510.VL_ICMS_ST , 100.00);
        model.setFieldValue(R1510.IND_REC , "1" );
        model.setFieldValue(R1510.COD_PART , "0045876" );
        model.setFieldValue(R1510.VL_PIS , 100.00 );
        model.setFieldValue(R1510.VL_COFINS , 100.00 );
        model.setFieldValue(R1510.COD_CTA , "00154450" );
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1510|123|0012546|1234|123,123|123456|100,00|100,00|123|1234|100,00|123456,12|100,00|100,00|100,00|1|0045876|100,00|100,00|00154450|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
