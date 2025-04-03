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
 * 11/02/2013 08:47:09
 * @author Thiago Balthazar
 */
public class RD410Test {

     @Test
    public void RD410Test1() throws ParseException{// Somente itens obrigatórios
        
        RD410 r = new RD410();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("11022013");
        
        LineModel model = r.createModel();
        
        model.setFieldValue(RD410.COD_MOD, "13");
        model.setFieldValue(RD410.SER, "A458");
        model.setFieldValue(RD410.SUB, 123);
	model.setFieldValue(RD410.NUM_DOC_INI, 123456);
        model.setFieldValue(RD410.NUM_DOC_FIN, 123456);
        model.setFieldValue(RD410.DT_DOC, data);
        model.setFieldValue(RD410.CST_ICMS, 123);
        model.setFieldValue(RD410.CFOP, 1234);
        model.setFieldValue(RD410.ALIQ_ICMS, 10d);
        model.setFieldValue(RD410.VL_OPR, 10d);
        model.setFieldValue(RD410.VL_DESC, 10d);
        model.setFieldValue(RD410.VL_SERV, 10d);
        model.setFieldValue(RD410.VL_BC_ICMS, 10d);
        model.setFieldValue(RD410.VL_ICMS, 10d);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D410|13|A458|123|123456|123456|11022013|123|1234|10,00|10,00|10,00|10,00|10,00|10,00|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
