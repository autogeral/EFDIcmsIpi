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
 * 05/02/2013 09:48:49
 * @author Thiago Balthazar
 */
public class RD110Test {
    
    @Test
    public void RD110Test1() throws ParseException{
    
        RD110 r = new RD110();
        
        LineModel model = r.createModel();
        
        model.setFieldValue(RD110.NUM_ITEM, 123);
        model.setFieldValue(RD110.COD_ITEM, "0000");
        model.setFieldValue(RD110.VL_SERV, 10.50);
        model.setFieldValue(RD110.VL_OUT, 100d);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D110|123|0000|10,50|100,00|";
        
        System.out.println("Excecting ....  : "+ expected);
        System.out.println("Result    ....  : " + result);
    }
     
    
    @Test
    public void RD110Test2() throws ParseException{
    
        RD110 r = new RD110();
        
        LineModel model = r.createModel();
        
        model.setFieldValue(RD110.NUM_ITEM, 1);
        model.setFieldValue(RD110.COD_ITEM, "0000306106S30A");
        model.setFieldValue(RD110.VL_SERV, 4445.00);
        model.setFieldValue(RD110.VL_OUT, 500d);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D110|1|0000306106S30A|4445,00|500,00|";
        
        System.out.println("Excecting ....  : "+ expected);
        System.out.println("Result    ....  : " + result);
    }
    
}