
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
 * 04/02/2013 11:17:41
 * @author Thiago Balthazar
 */
public class RD100Test {

    @Test
    public void RD100Test1() throws ParseException {
        RD100 r = new RD100();
        
        LineModel model = r.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("09102012");
       
        model.setFieldValue(RD100.IND_OPER, "0");
        model.setFieldValue(RD100.IND_EMIT, "1");
        model.setFieldValue(RD100.COD_PART, "45467636000186");
        model.setFieldValue(RD100.COD_MOD, "08");
        model.setFieldValue(RD100.COD_SIT, 00);
        model.setFieldValue(RD100.SER, "");
        model.setFieldValue(RD100.SUB,"0");
        model.setFieldValue(RD100.NUM_DOC,869245);
        model.setFieldValue(RD100.CHV_CTE,"");
        model.setFieldValue(RD100.DT_DOC,data);
        model.setFieldValue(RD100.DT_A_P,data);
        model.setFieldValue(RD100.TP_CT_e,1);
        model.setFieldValue(RD100.CHV_CTE_REF,"");
        model.setFieldValue(RD100.VL_DOC, 54.19);
        model.setFieldValue(RD100.VL_DESC, 0d);
        model.setFieldValue(RD100.IND_FRT,"1");
        model.setFieldValue(RD100.VL_SERV, 54.19);
        model.setFieldValue(RD100.VL_BC_ICMS,0d);
        model.setFieldValue(RD100.VL_ICMS,0d);
        model.setFieldValue(RD100.VL_NT,0d);
        model.setFieldValue(RD100.COD_INF,"");
        model.setFieldValue(RD100.COD_CTA,"15");
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D100|0|1|45467636000186|08|00||0|869245||09102012|09102012|1||54,19|0,00|1|54,19|0,00|0,00|0,00||15|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
    
 
}