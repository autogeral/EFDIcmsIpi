package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 14:46:25
 * @author Thiago Balthazar
 */
public class R1500Test {

    @Test
    public void RTest() throws ParseException{
                
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("29012013");
        
        R1500 r = new R1500();
                
        LineModel model = r.createModel();
        
	model.setFieldValue(R1500.IND_OPER         , "1");
        model.setFieldValue(R1500.IND_EMIT         , "0");
        model.setFieldValue(R1500.COD_PART         , "000245");
        model.setFieldValue(R1500.COD_MOD          , "12" );
        model.setFieldValue(R1500.COD_SIT          , 12);
        model.setFieldValue(R1500.SER              , "1234");
        model.setFieldValue(R1500.SUB              , 123);
        model.setFieldValue(R1500.COD_CONS         , "02" );
        model.setFieldValue(R1500.NUM_DOC          , 123456789);
        model.setFieldValue(R1500.DT_DOC           , data);
        model.setFieldValue(R1500.DT_E_S           , data );
        model.setFieldValue(R1500.VL_DOC           , 100d );
        model.setFieldValue(R1500.VL_DESC          , 100d);
        model.setFieldValue(R1500.VL_FORN          ,100d );
        model.setFieldValue(R1500.VL_SERV_NT       , 100d );
        model.setFieldValue(R1500.VL_TERC          , 100d);
        model.setFieldValue(R1500.VL_DA            , 100d );
        model.setFieldValue(R1500.VL_BC_ICMS       , 100d );
        model.setFieldValue(R1500.VL_ICMS          , 100d);
        model.setFieldValue(R1500.VL_BC_ICMS_ST    , 100d );
        model.setFieldValue(R1500.VL_ICMS_ST       , 100d );
        model.setFieldValue(R1500.COD_INF          , "123456" );
        model.setFieldValue(R1500.VL_PIS           , 100d );
        model.setFieldValue(R1500.VL_COFINS        , 100d);
        model.setFieldValue(R1500.TP_LIGACAO       , 2 );
        model.setFieldValue(R1500.COD_GRUPO_TENSAO , "01");
                
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1500|1|0|000245|12|12|1234|123|02|123456789|29012013|29012013|100,00|100,00|100,00|100,00|100,00|100,00|100,00|100,00|100,00|100,00|123456|100,00|100,00|2|01|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
    
}
