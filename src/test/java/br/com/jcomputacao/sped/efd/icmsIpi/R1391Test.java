package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 12:40:47
 * @author Thiago Balthazar
 */
public class R1391Test {
    
     @Test
    public void RTest() throws ParseException{
        
        R1391 r = new R1391();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
        
        LineModel model = r.createModel();
                      
	model.setFieldValue(R1391.DT_REGISTRO  , data );
        model.setFieldValue(R1391.QTD_MOID     , 10.00);
        model.setFieldValue(R1391.ESTQ_INI     , 10.00);
        model.setFieldValue(R1391.QTD_PRODUZ   , 10.00);
        model.setFieldValue(R1391.ENT_ANID_HID , 10d);
        model.setFieldValue(R1391.OUTR_ENTR    , 10d);
        model.setFieldValue(R1391.PERDA        , 10d);
        model.setFieldValue(R1391.CONS         , 10d);
        model.setFieldValue(R1391.SAI_ANI_HID  , 10d);
        model.setFieldValue(R1391.SAIDAS       , 10d);
        model.setFieldValue(R1391.ESTQ_FIN     , 10d);
        model.setFieldValue(R1391.ESTQ_INI_MEL , 10d);
        model.setFieldValue(R1391.PROD_DIA_MEL , 10d);
        model.setFieldValue(R1391.UTIL_MEL     , 10d);
        model.setFieldValue(R1391.PROD_ALC_MEL , 10d);
        model.setFieldValue(R1391.OBS, "Observacoes de toda Producao Diaria da Usina");
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1391|29012013|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|Observacoes de toda Producao Diaria da Usina|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
