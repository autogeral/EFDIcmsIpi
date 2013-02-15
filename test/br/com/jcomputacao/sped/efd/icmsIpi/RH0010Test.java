package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 15/02/2013 10:25:16
 * @author Vinicius Diana
 */
public class RH0010Test {
@Test
    
     public void RH010Test(){
    RH010 r = new RH010();
    LineModel model = r.createModel();
    
    //2
     model.setFieldValue(RH010.COD_ITEM, "A11");
     //3
     model.setFieldValue(RH010.UNID, "A11");
     //4
     model.setFieldValue(RH010.QTD, 5.333);
     //5
     model.setFieldValue(RH010.VL_UNIT, 5.333333);
     //6
     model.setFieldValue(RH010.VL_ITEM, 5.30);
     //7
     model.setFieldValue(RH010.IND_PROP, "1");
     //8
     model.setFieldValue(RH010.COD_PART , "A11");
     //9
     model.setFieldValue(RH010.TXT_COMPL, "");
     //10
     model.setFieldValue(RH010.COD_CTA, "");
     
       StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|H010|A11|A11|5,333|5,333333|5,30|1|A11|||";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
   }
}
