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
 * 11/02/2013 09:42:24
 * @author Thiago Balthazar
 */
public class RD500Test {

    @Test
    public void RD500Test1() throws ParseException{// Somente itens obrigatórios
        
        RD500 r = new RD500();
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("11022013");
        
        LineModel model = r.createModel();
        
	model.setFieldValue(RD500.IND_OPER, "0"); //2
        model.setFieldValue(RD500.IND_EMIT, "0"); //3
        model.setFieldValue(RD500.COD_PART, "0"); //4
        model.setFieldValue(RD500.COD_MOD, "21");//5
        model.setFieldValue(RD500.COD_SIT, 00); //6
        model.setFieldValue(RD500.SER, "1234"); //7
        model.setFieldValue(RD500.SUB, 123); //8
        model.setFieldValue(RD500.NUM_DOC, 123456789); //9
        model.setFieldValue(RD500.DT_DOC, data); //10
        model.setFieldValue(RD500.DT_A_P, data); //11
        model.setFieldValue(RD500.VL_DOC, 10d); //12
        model.setFieldValue(RD500.VL_DESC, 10d);//13
        model.setFieldValue(RD500.VL_SERV, 10d); //14
        model.setFieldValue(RD500.VL_SERV_NT,10d); //15
        model.setFieldValue(RD500.VL_TERC, 10d); //16
        model.setFieldValue(RD500.VL_DA, 10d); //17
        model.setFieldValue(RD500.VL_BC_ICMS, 10d); //18
        model.setFieldValue(RD500.VL_ICMS, 10d);//19
        model.setFieldValue(RD500.COD_INF, "123456"); //20
        model.setFieldValue(RD500.VL_PIS, 10d); //21
        model.setFieldValue(RD500.VL_COFINS, 10d); //22
        model.setFieldValue(RD500.COD_CTA , "A123"); //23
        model.setFieldValue(RD500.TP_ASSINANTE, 0); //24
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D500|0|0|0|21|00|1234|123|123456789|11022013|11022013|10,00|10,00|10,00|10,00|10,00|10,00|10,00|10,00|123456|10,00|10,00|A123|0|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}
