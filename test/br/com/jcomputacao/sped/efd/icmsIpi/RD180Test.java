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
 * 06/02/2013 11:20:24
 * @author Thiago Balthazar
 */
public class RD180Test {
 
    @Test
    public void RD180Test1() throws ParseException{ //Emissão Própria
    
        RD180 r = new RD180();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("06022013");
        
        LineModel model = r.createModel();
        
        model.setFieldValue(r.NUM_SEQ , 5225);
        model.setFieldValue(r.IND_EMIT, "0");
        model.setFieldValue(r.CNPJ_CPF_EMIT, 38462670829L);
        model.setFieldValue(r.UF_EMIT, "SP");
        model.setFieldValue(r.IE_EMIT, "345641236548");
        model.setFieldValue(r.COD_MUN_ORIG, 3537844);
        model.setFieldValue(r.CNPJ_CPF_TOM, 38462670829L);
        model.setFieldValue(r.UF_TOM, "SP");
        model.setFieldValue(r.IE_TOM, "68971235654");
        model.setFieldValue(r.COD_MUN_DEST, 3548222);
        model.setFieldValue(r.COD_MOD, "63" );
        model.setFieldValue(r.SER, "6795");
        model.setFieldValue(r.SUB, 691);
        model.setFieldValue(r.NUM_DOC, 681379546);
        model.setFieldValue(r.DT_DOC, data);
        model.setFieldValue(r.VL_DOC, 1540.00);
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D180|5225|0|38462670829|SP|345641236548|3537844|38462670829|SP|68971235654|3548222|63|6795|691|681379546|06022013|1540,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
    @Test
    public void RD180Test2() throws ParseException{ //Emissão de Terceiros
    
        RD180 r = new RD180();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("06022013");
        
        LineModel model = r.createModel();
        
        model.setFieldValue(r.NUM_SEQ , 5225);
        model.setFieldValue(r.IND_EMIT, "1");
        model.setFieldValue(r.CNPJ_CPF_EMIT, 3847898229L);
        model.setFieldValue(r.UF_EMIT, "SP");
        model.setFieldValue(r.IE_EMIT, "345641236548");
        model.setFieldValue(r.COD_MUN_ORIG, 3537844);
        model.setFieldValue(r.CNPJ_CPF_TOM, 38462670829L);
        model.setFieldValue(r.UF_TOM, "SP");
        model.setFieldValue(r.IE_TOM, "68971235654");
        model.setFieldValue(r.COD_MUN_DEST, 3548222);
        model.setFieldValue(r.COD_MOD, "63" );
        model.setFieldValue(r.SER, "6795");
        model.setFieldValue(r.SUB, 691);
        model.setFieldValue(r.NUM_DOC, 681379546);
        model.setFieldValue(r.DT_DOC, data);
        model.setFieldValue(r.VL_DOC, 1562.50);
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D180|5225|1|3847898229|SP|345641236548|3537844|38462670829|SP|68971235654|3548222|63|6795|691|681379546|06022013|1562,50|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
