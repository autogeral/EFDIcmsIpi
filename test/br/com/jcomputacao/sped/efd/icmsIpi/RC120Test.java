package br.com.jcomputacao.sped.efd.icmsIpi;


import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 19/02/2013 17:03:47
 * @author Thiago Balthazar
 */
public class RC120Test {
    
    @Test
    public void RTest() {
        
       RC120 r = new RC120(); 
       
       LineModel model = r.createModel();
        
       model.setFieldValue(RC120.COD_DOC_IMP   , "0" );
       model.setFieldValue(RC120.NUM_DOC__IMP  , "0123456789");
       model.setFieldValue(RC120.PIS_IMP       , 10d);
       model.setFieldValue(RC120.COFINS_IMP    , 10d );
       model.setFieldValue(RC120.NUM_ACDRAW    , "01234567890123456789" );
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|C120|0|0123456789|10,00|10,00|01234567890123456789|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }    

}
