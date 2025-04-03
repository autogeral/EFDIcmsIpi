package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 11/02/2013 14:20:12
 * @author Vinicius Diana
 */
public class R1010Test {
@Test
public void R1010Test(){
    R1010 r = new R1010();
    LineModel model = r.createModel();
    
    //2
    model.setFieldValue(R1010.IND_EXP, "N");
    //3
     model.setFieldValue(R1010.IND_CCRF, "N");
     //4
      model.setFieldValue(R1010.IND_COMB , "N");
      //5
       model.setFieldValue(R1010.IND_USINA, "N");
       //6
       model.setFieldValue(R1010.IND_VA, "N");
       //7
        model.setFieldValue(R1010.IND_EE, "N");
        //8
         model.setFieldValue(R1010.IND_CART, "N");
         //9
         model.setFieldValue(R1010.IND_FORM, "N");
                 //10
         model.setFieldValue(R1010.IND_AER, "N");
          StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|1010|N|N|N|N|N|N|N|N|N|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
}
}
