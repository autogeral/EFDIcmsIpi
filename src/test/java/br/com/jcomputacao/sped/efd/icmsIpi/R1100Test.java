package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 17:19:47
 * @author Thiago Balthazar
 */
public class R1100Test {

    @Test
    public void R1100Test() throws ParseException{
        
        R1100 r = new R1100();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(R1100.IND_DOC, 0);
        model.setFieldValue(R1100.NRO_DE, 12345678901L);
        model.setFieldValue(R1100.DT_DE, data);
        model.setFieldValue(R1100.NAT_EXP, 1);
        model.setFieldValue(R1100.NRO_RE, 123456789012L);
        model.setFieldValue(R1100.DT_RE, data);
        model.setFieldValue(R1100.CHC_EMB, "0001234567890ACVBZ");
        model.setFieldValue(R1100.DT_CHC, data);
        model.setFieldValue(R1100.DT_AVB, data);
        model.setFieldValue(R1100.TP_CHC, 20);
        model.setFieldValue(R1100.PAIS, 123);
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1100|0|12345678901|29012013|1|123456789012|29012013|0001234567890ACVBZ|29012013|29012013|20|123|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}

