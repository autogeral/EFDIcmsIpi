package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * 15/02/2013 10:15:52
 * @author Thiago Balthazar
 */
public class RC165Test {

    @Test
    public void RC1650Test1() throws ParseException {
        
        RC165 r = new RC165();
        
      
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        Date hora = sdf.parse("123040");
                
        //DateFormat aDateFormat = new SimpleDateFormat("HHmmss");
        //FormatWrapper timeFormat = new FormatWrapper(aDateFormat);
        
        LineModel model = r.createModel();

        model.setFieldValue(RC165.COD_PART, "67481846000161" );
        model.setFieldValue(RC165.VEIC_ID, "cxz8090");
        model.setFieldValue(RC165.COD_AUT,  "ABCDE");
        model.setFieldValue(RC165.NR_PASSE, "12345");
        model.setFieldValue(RC165.HORA, hora);
        model.setFieldValue(RC165.TEMPER, 22.1);
        model.setFieldValue(RC165.QTD_VOL, 55);
        model.setFieldValue(RC165.PESO_BRT, 120.12);
        model.setFieldValue(RC165.PESO_LIQ, 120.12);
        model.setFieldValue(RC165.NOM_MOT, "THIAGO BALTHAZAR DE MOURA SOUZA");
        model.setFieldValue(RC165.CPF, 38462670829L);
        model.setFieldValue(RC165.UF_ID, "SP");
                        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C165|67481846000161|cxz8090|ABCDE|12345|123040|22,1|55|120,12|120,12|THIAGO BALTHAZAR DE MOURA SOUZA|38462670829|SP|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
