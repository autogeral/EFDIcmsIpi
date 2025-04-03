package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 18/02/2013 13:54:33
 * @author Vinicius Diana
 */
public class RC600Test {
@Test
public void RC600Test() throws ParseException{
    RC600 r = new RC600();
    LineModel model = r.createModel(); 
     SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
     //2
     model.setFieldValue(RC600.COD_MOD, "A1");
     //3
     model.setFieldValue(RC600.COD_MUN, 1234567);
     //4
     model.setFieldValue(RC600.SER, "A1");
     //5
     model.setFieldValue(RC600.SUB, 1);
     //6
     model.setFieldValue(RC600.COD_CONS, "01");
     //7
     model.setFieldValue(RC600.QTD_CONS, 11);
     //8
     model.setFieldValue(RC600.QTD_CANC, 11);
     //9
     Date data = sf.parse("15082012");
     model.setFieldValue(RC600.DT_DOC, data);
     //10
     model.setFieldValue(RC600.VL_DOC, 55.12);
     //11
     model.setFieldValue(RC600.VL_DESC, 55.12);
     //12
      model.setFieldValue(RC600.CONS, 55.12);
      //13
       model.setFieldValue(RC600.VL_FORN, 55.12);
       //14
        model.setFieldValue(RC600.VL_SERV_NT, 55.12);
       //15
        model.setFieldValue(RC600.VL_TERC, 55.12);
        //16
         model.setFieldValue(RC600.VL_DA, 55.12);
         //17
          model.setFieldValue(RC600.VL_BC_ICMS, 55.12);
         //18
           model.setFieldValue(RC600.VL_ICMS, 55.12);
           //19
            model.setFieldValue(RC600.VL_BC_ICMS_ST, 55.12);
           //20
             model.setFieldValue(RC600.VL_ICMS_ST, 55.12);
             
            //21
              model.setFieldValue(RC600.VL_PIS, 55.12);
              //22
              model.setFieldValue(RC600.VL_COFINS, 55.12);
            
             StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C600|A1|1234567|A1|1|01|11|11|15082012|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
}
}
