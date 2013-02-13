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
 * 13/02/2013 10:50:41
 * @author Thiago Balthazar
 */
public class RC170Test {
	
    @Test
    public void RC170Test(){
        
        RC170 r = new RC170();
       
        LineModel model = r.createModel();
        
	model.setFieldValue(RC170.NUM_ITEM , 123);//2
        model.setFieldValue(RC170.COD_ITEM , "ABCqweqwe123");//3
        model.setFieldValue(RC170.DESCR_COMPL , "ABCqweqwe123ABCqweqwe123");//4
        model.setFieldValue(RC170.QTD ,1.12345 );//5
        model.setFieldValue(RC170.UNID , "abcdef" );//6
        model.setFieldValue(RC170.VL_ITEM , 0d );//7
        model.setFieldValue(RC170.VL_DESC , 0d );//8
        model.setFieldValue(RC170.IND_MOV , "1" ); //9
        model.setFieldValue(RC170.CST_ICMS ,123);
        model.setFieldValue(RC170.CFOP,1234 );
        model.setFieldValue(RC170.COD_NAT , "0123456789");
        model.setFieldValue(RC170.VL_BC_ICMS ,0d );//13
        model.setFieldValue(RC170.ALIQ_ICMS ,123456.00  );//14
        model.setFieldValue(RC170.VL_ICMS , 0d );//15
        model.setFieldValue(RC170.VL_BC_ICMS_ST ,0d );//16
        model.setFieldValue(RC170.ALIQ_ST ,0d );//17
        model.setFieldValue(RC170.VL_ICMS_ST ,0d );//18
        model.setFieldValue(RC170.IND_APUR , "1");//19
        model.setFieldValue(RC170.CST_IPI , "AB");//20
        model.setFieldValue(RC170.COD_ENQ , "ABC" );//21
        model.setFieldValue(RC170.VL_BC_IPI , 0d);//22
        model.setFieldValue(RC170.ALIQ_IPI , 123456.00);//23
        model.setFieldValue(RC170.VL_IPI , 0d);//24
        model.setFieldValue(RC170.CST_PIS ,12 );//25
        model.setFieldValue(RC170.VL_BC_PIS ,0d );//26
        model.setFieldValue(RC170.ALIQ_PIS_PORC ,12345678.0000 );//27
        model.setFieldValue(RC170.QUANT_BC_PIS ,1.123 );//28
        model.setFieldValue(RC170.ALIQ_PIS_REAIS , 1.1234);//29
        model.setFieldValue(RC170.VL_PIS ,0d );//30
        model.setFieldValue(RC170.CST_COFINS ,12 );//31
        model.setFieldValue(RC170.VL_BC_COFINS ,0d );//32
        model.setFieldValue(RC170.ALIQ_COFINS_PORC ,12345678.1234 );//33
        model.setFieldValue(RC170.QUANT_BC_COFINS ,1.123 );//34
        model.setFieldValue(RC170.ALIQ_COFINS_REAIS , 1.1234);//35
        model.setFieldValue(RC170.VL_COFINS , 0d);//36
        model.setFieldValue(RC170.COD_CTA , "abcdefghijklmnopqrst");//37
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C170|123|ABCqweqwe123|ABCqweqwe123ABCqweqwe123|1,12345|abcdef|0,00|0,00|1|123|1234|0123456789|0,00|123456,00|0,00|0,00|0,00|0,00|1|AB|ABC|0,00|123456,00|0,00|12|0,00|12345678,0000|1,123|1,1234|0,00|12|0,00|12345678,1234|1,123|1,1234|0,00|abcdefghijklmnopqrst|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
    
}
