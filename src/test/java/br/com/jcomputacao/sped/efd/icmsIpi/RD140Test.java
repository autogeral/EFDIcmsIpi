package br.com.jcomputacao.sped.efd.icmsIpi;

import static org.junit.Assert.*;
import br.com.jcomputacao.aristoteles.Model;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

/**
 * 05/02/2013 14:27:12
 * @author Thiago Balthazar
 */
public class RD140Test {
 
    @Test
    public void RD140Test1() throws ParseException {
        RD140 r = new RD140();
        
        LineModel model = r.createModel();
               
        model.setFieldValue(RD140.COD_PART_CONSG, "00026876582868");
        model.setFieldValue(RD140.COD_MUN_ORIG, 3540606);
        model.setFieldValue(RD140.COD_MUN_DEST, 3540705);
        model.setFieldValue(RD140.IND_VEIC, "0");
        model.setFieldValue(RD140.VEIC_ID, "A123");
        model.setFieldValue(RD140.IND_NAV, "1");
        model.setFieldValue(RD140.VIAGEM, 5);
        model.setFieldValue(RD140.VL_FRT_LIQ, 22.50);
        model.setFieldValue(RD140.VL_DESP_PORT, 22.50);
        model.setFieldValue(RD140.VL_DESP_CAR_DESC, 22.50);
        model.setFieldValue(RD140.VL_OUT, 22.50);
        model.setFieldValue(RD140.VL_FRT_BRT, 22.50);
        model.setFieldValue(RD140.VL_FRT_MM, 22.50);
       
       
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D140|00026876582868|3540606|3540705|0|A123|1|5|22,50|22,50|22,50|22,50|22,50|22,50|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
 
      @Test
    public void RD140Test2() throws ParseException {
        RD140 r = new RD140();
        
        LineModel model = r.createModel();
               
        model.setFieldValue(RD140.COD_PART_CONSG, "00026876582868");
        model.setFieldValue(RD140.COD_MUN_ORIG, 3570406);
        model.setFieldValue(RD140.COD_MUN_DEST, 3540707);
        model.setFieldValue(RD140.IND_VEIC, "1");
        model.setFieldValue(RD140.VEIC_ID, "");
        model.setFieldValue(RD140.IND_NAV, "1");
        model.setFieldValue(RD140.VIAGEM, 5);
        model.setFieldValue(RD140.VL_FRT_LIQ, 22.50);
        model.setFieldValue(RD140.VL_DESP_PORT, 22.50);
        model.setFieldValue(RD140.VL_DESP_CAR_DESC, 22.50);
        model.setFieldValue(RD140.VL_OUT, 0d);
        model.setFieldValue(RD140.VL_FRT_BRT, 0d);
        model.setFieldValue(RD140.VL_FRT_MM, 0d);
       
       
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D140|00026876582868|3570406|3540707|1||1|5|22,50|22,50|22,50|0,00|0,00|0,00|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
 
 
    
}
