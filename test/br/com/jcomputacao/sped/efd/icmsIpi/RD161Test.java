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
 * 06/02/2013 08:33:35
 * @author Thiago Balthazar
 */
public class RD161Test {

    @Test
    public void RD161Test1() {
        
        RD161 r = new RD161();
        LineModel model = r.createModel();
              
        model.setFieldValue(r.IND_CARGA, 0);
        model.setFieldValue(r.CNPJ_CPF_COL, "38462670829");
        model.setFieldValue(r.IE_COL, "123456");
        model.setFieldValue(r.COD_MUN_COL, 3540606);
        model.setFieldValue(r.CNPJ_CPF_ENTG, "38466670929");
        model.setFieldValue(r.IE_ENTG, "1234567890123");
        model.setFieldValue(r.COD_MUN_ENTG, 9999999);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D161|0|38462670829|123456|3540606|38466670929|1234567890123|9999999|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
        
    }

    
    @Test
    public void RD161Test2() {
        
        RD161 r = new RD161();
        LineModel model = r.createModel();
              
        model.setFieldValue(r.IND_CARGA, 9);
        model.setFieldValue(r.CNPJ_CPF_COL, "38462670829");
        model.setFieldValue(r.IE_COL, "6543210");
        model.setFieldValue(r.COD_MUN_COL, 3540606);
        model.setFieldValue(r.CNPJ_CPF_ENTG, "12345678901234");
        model.setFieldValue(r.IE_ENTG, "1234567890123");
        model.setFieldValue(r.COD_MUN_ENTG, 3537844);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D161|9|38462670829|6543210|3540606|12345678901234|1234567890123|3537844|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
        
    }
}
