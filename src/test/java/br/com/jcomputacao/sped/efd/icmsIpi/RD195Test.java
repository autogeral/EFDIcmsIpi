package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 07/02/2013 09:29:36
 * @author Thiago Balthazar
 */
public class RD195Test {

    @Test
    public void RD195Test1(){
    
    RD195 r = new RD195();
    
    LineModel model = r.createModel();
    
    model.setFieldValue(RD195.COD_OBS, "2");
    model.setFieldValue(RD195.TXT_COMPL, "Nf referente a cupom fiscal");
    
    StringBuffer sb = model.getRepresentation();
    String result = sb.toString();
    String expected = "|D195|2|Nf referente a cupom fiscal|";
                         
   System.out.println("Excecting ....  : " + expected);
   System.out.println("Result    ....  : " + result);
   assertEquals(expected, result);
    
    }
    
     @Test
    public void RD195Test2(){
    
    RD195 r = new RD195();
    
    LineModel model = r.createModel();
    
    model.setFieldValue(RD195.COD_OBS, "1");
    model.setFieldValue(RD195.TXT_COMPL, "TRANSFERENCIA DE ICMS");
    
    StringBuffer sb = model.getRepresentation();
    String result = sb.toString();
    String expected = "|D195|1|TRANSFERENCIA DE ICMS|";
                         
   System.out.println("Excecting ....  : " + expected);
   System.out.println("Result    ....  : " + result);
   assertEquals(expected, result);
    
    }
    
}
