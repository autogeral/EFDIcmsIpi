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
 * 05/02/2013 17:18:12
 * @author Thiago Balthazar
 */
public class RD160Test  {
    
     @Test
     public void test1() {
        RD160 r = new RD160();
        LineModel model = r.createModel();
                   
        model.setFieldValue(r.DESPACHO ,"15462");
        model.setFieldValue(r.CNPJ_CPF_REM , 38462670829L);
        model.setFieldValue(r.IE_REM , "12345678901234");
        model.setFieldValue(r.COD_MUN_ORI ,3552205);
        model.setFieldValue(r.CNPJ_CPF_DEST ,38462670829L);
        model.setFieldValue(r.IE_DEST , "12345678901234");
        model.setFieldValue(r.COD_MUN_DEST ,3552210);
           
               
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D160|15462|38462670829|12345678901234|3552205|38462670829|12345678901234|3552210|";
        
       System.out.println("Excecting ....  : " + expected);    
       System.out.println("Result    ....  : " + result);
       assertEquals(expected, result);
    }
    
     @Test
     public void test2() {
        RD160 r = new RD160();
        LineModel model = r.createModel();
                   
        model.setFieldValue(r.DESPACHO ,"15462");
        model.setFieldValue(r.CNPJ_CPF_REM , 0);
        model.setFieldValue(r.IE_REM , "123");
        model.setFieldValue(r.COD_MUN_ORI ,3552255);
        model.setFieldValue(r.CNPJ_CPF_DEST ,38462670829L);
        model.setFieldValue(r.IE_DEST , "12345678901234");
        model.setFieldValue(r.COD_MUN_DEST ,3552210);
           
               
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D160|15462|0|123|3552255|38462670829|12345678901234|3552210|";
        
       System.out.println("Excecting ....  : " + expected);    
       System.out.println("Result    ....  : " + result);
       assertEquals(expected, result);
    }
}
