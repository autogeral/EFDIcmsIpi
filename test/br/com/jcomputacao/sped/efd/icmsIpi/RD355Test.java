package br.com.jcomputacao.sped.efd.icmsIpi;

import static org.junit.Assert.*;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

/**
 * 08/02/2013 08:30:31
 * @author Thiago Balthazar
 */
public class RD355Test {

    @Test
    public void RD355Test() throws ParseException{
        
        RD355 r = new RD355();
        
        LineModel model = r.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("08022013");
        
        model.setFieldValue(RD355.DT_DOC, data );
        model.setFieldValue(RD355.CRO, 45);
        model.setFieldValue(RD355.CRZ, 50);
        model.setFieldValue(RD355.NUM_COO_FIN,56 );
        model.setFieldValue(RD355.GT_FIN, 100.50);
        model.setFieldValue(RD355.VL_BRT, 2000.00);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D355|08022013|45|50|56|100,50|2000,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    
    }
}
