package br.com.jcomputacao.sped.efd.icmsIpi;
import static org.junit.Assert.assertEquals;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;

/**
 * 08/02/2013 09:15:59
 * @author Vinicius Diana
 */
public class RE230Test {

    @Test
    public void RE230(){
        RE230 r = new RE230();
        LineModel model = r.createModel();
       
       //2
        model.setFieldValue(RE230.NUM_DA, "CE14444");
        //3
        model.setFieldValue(RE230.NUM_PROC, "FD22222");
        //4
        model.setFieldValue(RE230.IND_PROC, 1);
        //5
        model.setFieldValue(RE230.PROC, "");
        //6
        model.setFieldValue(RE230.TXT_COMPL, "");
        
         StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|E230|CE14444|FD22222|1|||";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    }
    
}
