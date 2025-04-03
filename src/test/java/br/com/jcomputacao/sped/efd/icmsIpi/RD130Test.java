package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * 05/02/2013 11:37:16
 * @author Thiago Balthazar
 */
public class RD130Test {

    @Test
    public void RD130Test() {
        
        RD130 r = new RD130();
        LineModel model = r.createModel();
        
        model.setFieldValue(RD130.COD_PART_CONSG, "00026876582868");
        model.setFieldValue(RD130.COD_PART_RED, "00026876582868");
        model.setFieldValue(RD130.IND_FRT_RED, "0");
        model.setFieldValue(RD130.COD_MUN_ORIG, 3540606L); 
        model.setFieldValue(RD130.COD_MUN_DEST, 3552205L);
        model.setFieldValue(RD130.VEIC_ID, "cxz8090");
        model.setFieldValue(RD130.VL_LIQ_FRT,10000.00);
        model.setFieldValue(RD130.VL_SEC_CAT, 1000.00);
        model.setFieldValue(RD130.VL_DESP,1000.00 );
        model.setFieldValue(RD130.VL_PEDG, 1000.00);
        model.setFieldValue(RD130.VL_OUT, 1000.00);
        model.setFieldValue(RD130.VL_FRT, 1000.00);
        model.setFieldValue(RD130.UF_ID, "SP");
       
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D130|00026876582868|00026876582868|0|3540606|3552205|cxz8090|10000,00|1000,00|1000,00|1000,00|1000,00|1000,00|SP|";
        
       System.out.println("Excecting ....  : " + expected);     
       System.out.println("Result    ....  : " + result);
       assertEquals(expected, result);
    }
}
