package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 18/02/2013 16:38:32
 * @author Thiago Balthazar
 */
public class RC800Test {

    @Test
    public void RD100Test2() throws ParseException{
        
        RC800 r = new RC800();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("08022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RC800.COD_MOD , "59" );
        model.setFieldValue(RC800.COD_SIT , 12 );
        model.setFieldValue(RC800.NUM_CFE , 123456 );
        model.setFieldValue(RC800.DT_DOC , data );
        model.setFieldValue(RC800.VL_CFE , 10d );
        model.setFieldValue(RC800.VL_PIS , 10d );
        model.setFieldValue(RC800.VL_COFINS ,10d );
        model.setFieldValue(RC800.CNPJ_CPF , 38462670829L);
        model.setFieldValue(RC800.NR_SAT , 123456789 );
        model.setFieldValue(RC800.CHV_CFE , "12345678901234567890123456789012345678901234" );
        model.setFieldValue(RC800.VL_DESC , 10d );
        model.setFieldValue(RC800.VL_MERC , 10d);
        model.setFieldValue(RC800.VL_OUT_DA , 10d );
        model.setFieldValue(RC800.VL_ICMS , 10d );
        model.setFieldValue(RC800.VL_PIS_ST , 10d );
        model.setFieldValue(RC800.VL_COFINS_ST , 10d );
        
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C800|59|12|123456|08022013|10,00|10,00|10,00|38462670829|123456789|12345678901234567890123456789012345678901234|10,00|10,00|10,00|10,00|10,00|10,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
