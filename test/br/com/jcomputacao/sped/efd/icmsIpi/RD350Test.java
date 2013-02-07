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
 * 07/02/2013 11:48:54
 * @author Thiago Balthazar
 */
public class RD350Test {

    @Test
    public void RD350Test1(){
    
        RD350 r = new RD350();
        LineModel model = r.createModel();
    
        model.setFieldValue(r.COD_MOD, "2E");
        model.setFieldValue(r.ECF_MOD, "EYX350");
        model.setFieldValue(r.ECF_FAB, "5469876");
        model.setFieldValue(r.ECF_CX, 462);
     
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D350|2E|EYX350|5469876|462|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    
    }
    
     @Test
    public void RD350Test2(){
    
        RD350 r = new RD350();
        LineModel model = r.createModel();
    
        model.setFieldValue(r.COD_MOD, "13");
        model.setFieldValue(r.ECF_MOD, "EYX400");
        model.setFieldValue(r.ECF_FAB, "5469876");
        model.setFieldValue(r.ECF_CX, 462);
     
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D350|13|EYX400|5469876|462|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    
    }
            
}
