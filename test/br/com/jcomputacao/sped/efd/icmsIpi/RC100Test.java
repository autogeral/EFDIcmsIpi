package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 13/02/2013 11:32:17
 * @author Thiago Balthazar
 */
public class RC100Test {

     @Test
    public void RC100Test() throws ParseException {
        
        RC100 r = new RC100();
                 
        LineModel model = r.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
        Date data2 = sdf.parse("13022013");
        
        model.setFieldValue(RC100.IND_OPER, "1");
        model.setFieldValue(RC100.IND_EMIT, "1");
        model.setFieldValue(RC100.COD_PART, "abcdefghijklmnopqrst");
        model.setFieldValue(RC100.COD_MOD, "AB");
        model.setFieldValue(RC100.COD_SIT, 12);
        model.setFieldValue(RC100.SER, "123");
        model.setFieldValue(RC100.NUM_DOC, 123456789);
        model.setFieldValue(RC100.CHV_NFE,"01234567890123456789012345678901234567890123");
        model.setFieldValue(RC100.DT_DOC, data);
        model.setFieldValue(RC100.DT_E_S, data2);
        model.setFieldValue(RC100.VL_DOC, 0d);
        model.setFieldValue(RC100.IND_PGTO, "0");
        model.setFieldValue(RC100.VL_DESC, 0d);
        model.setFieldValue(RC100.VL_ABAT_NT, 0d);
        model.setFieldValue(RC100.VL_MERC, 0d);
        model.setFieldValue(RC100.IND_FRT,"0");
        model.setFieldValue(RC100.VL_FRT, 0d);
        model.setFieldValue(RC100.VL_SEG,0d);
        model.setFieldValue(RC100.VL_OUT_DA, 0d);
        model.setFieldValue(RC100.VL_BC_ICMS, 0d);
        model.setFieldValue(RC100.VL_ICMS, 0d);
        model.setFieldValue(RC100.VL_BC_ICMS_ST, 0d);
        model.setFieldValue(RC100.VL_ICMS_ST,0d);
        model.setFieldValue(RC100.VL_IPI, 0d);
        model.setFieldValue(RC100.VL_PIS, 0d);
        model.setFieldValue(RC100.VL_COFINS, 0d);
        model.setFieldValue(RC100.VL_PIS_ST, 0d);
        model.setFieldValue(RC100.VL_COFINS_ST, 0d);
                
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C100|1|1|abcdefghijklmnopqrst|AB|12|123|123456789|01234567890123456789012345678901234567890123|29012013|13022013|0,00|0|0,00|0,00|0,00|0,00|0,00|0,00|0,00|0,00|0,00|0,00|0,00|0,00|0,00|0,00|0,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
