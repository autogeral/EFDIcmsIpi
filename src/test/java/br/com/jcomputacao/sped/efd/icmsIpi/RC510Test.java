package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 18/02/2013 10:50:33
 * @author Vinicius Diana
 */
public class RC510Test {
@Test
public void RC510Test(){
      RC510 r = new RC510();
    LineModel model = r.createModel();
    //2
    model.setFieldValue(RC510.NUM_ITEM, 123);
    //3
    model.setFieldValue(RC510.COD_ITEM, "RC510");
    //4
     model.setFieldValue(RC510.COD_CLASS, 1234);
     //5
     model.setFieldValue(RC510.QTD, 55.111);
     //6
     model.setFieldValue(RC510.UNID, "RC510");
     //7
     model.setFieldValue(RC510.VL_ITEM, 55.11);
     //8
     model.setFieldValue(RC510.VL_DESC, 55.11);
     //9
     model.setFieldValue(RC510.CST_ICMS, 111);
     //10
     model.setFieldValue(RC510.CFOP, 1111);
     //11
     model.setFieldValue(RC510.VL_BC_ICMS, 11.11);
     //12
     model.setFieldValue(RC510.ALIQ_ICMS, 55.11);
     //13
      model.setFieldValue(RC510.VL_ICMS, 55.11);
      //14
      model.setFieldValue(RC510.VL_BC_ICMS_ST, 55.11);
      //15
      model.setFieldValue(RC510.ALIQ_ST, 55.11);
      //16
      model.setFieldValue(RC510.VL_ICMS_ST, 55.11);
      //17
      model.setFieldValue(RC510.IND_REC, "1");
      //18
      model.setFieldValue(RC510.COD_PART, "0150");
      //19
      model.setFieldValue(RC510.VL_PIS, 55.11);
      //20
      model.setFieldValue(RC510.VL_COFINS, 55.11);
      //21
      model.setFieldValue(RC510.COD_CTA, "1");
      
         StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C510|123|RC510|1234|55,111|RC510|55,11|55,11|111|1111|11,11|55,11|55,11|55,11|55,11|55,11|1|0150|55,11|55,11|1|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
        
}
}
