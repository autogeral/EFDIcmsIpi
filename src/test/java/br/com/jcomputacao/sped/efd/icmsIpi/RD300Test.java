package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 07/02/2013 10:32:54
 * @author Thiago Balthazar
 */
public class RD300Test {
    
    @Test
    public void RD300Test1() throws ParseException{
    
        RD300 r = new RD300();
        
        LineModel model = r.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("07022013");
        
        model.setFieldValue(RD300.COD_MOD, "13");
        model.setFieldValue(RD300.SER, "1254");
        model.setFieldValue(RD300.SUB, 543);
        model.setFieldValue(RD300.NUM_DOC_INI, 546236);
        model.setFieldValue(RD300.NUM_DOC_FIN, 546237);
        model.setFieldValue(RD300.CST_ICMS, 697 );
        model.setFieldValue(RD300.CFOP, 1234);
        model.setFieldValue(RD300.ALIQ_ICMS, 100.00 );
        model.setFieldValue(RD300.DT_DOC, data);
        model.setFieldValue(RD300.VL_OPR, 100.00);
        model.setFieldValue(RD300.VL_DESC, 100.00);
        model.setFieldValue(RD300.VL_SERV, 100.00);
        model.setFieldValue(RD300.VL_SEG, 100.00);
        model.setFieldValue(RD300.VL_OUT_DESP, 100.00);
        model.setFieldValue(RD300.VL_BC_ICMS, 100.00);
        model.setFieldValue(RD300.VL_ICMS, 100.00);
        model.setFieldValue(RD300.VL_RED_BC, 100.00);
        model.setFieldValue(RD300.COD_OBS, "4");
        model.setFieldValue(RD300.COD_CTA,"569874A" );
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D300|13|1254|543|546236|546237|697|1234|100,00|07022013|100,00|100,00|100,00|100,00|100,00|100,00|100,00|100,00|4|569874A|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
    }

}
