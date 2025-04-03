package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 18/02/2013 09:07:00
 * @author Vinicius Diana
 */
public class RC500Test {
 @Test

      public void RG500Test() throws ParseException {
    RC500 r = new RC500();
    LineModel model = r.createModel();
    SimpleDateFormat sf = new SimpleDateFormat("ddMMyyyy");
   
    //2
    model.setFieldValue(RC500.IND_OPER, "1");
    //3
    model.setFieldValue(RC500.IND_EMIT, "1");
    //4
    model.setFieldValue(RC500.COD_PART, "Campo");
    //5
    model.setFieldValue(RC500.COD_MOD, "11");
    //6
     model.setFieldValue(RC500.COD_SIT, 11);
     //7
     model.setFieldValue(RC500.SER, "11");
     //8
     model.setFieldValue(RC500.SUB, 11);
     //9
     model.setFieldValue(RC500.COD_CONS, "01");
     //10
     model.setFieldValue(RC500.NUM_DOC, 11);
     //11
      Date data = sf.parse("04082012");
        model.setFieldValue(RC500.DT_DOC, data);
      // 12 
     Date data2 = sf.parse("04082012");
      model.setFieldValue(RC500.DT_E_S, data2);
      //13
      model.setFieldValue(RC500.VL_DOC, 55.12);
      //14
      model.setFieldValue(RC500.VL_DESC, 55.12);
      //15
      model.setFieldValue(RC500.VL_FORN, 55.12);
      //16
      model.setFieldValue(RC500.VL_SERV_NT, 55.12);
      //17
      model.setFieldValue(RC500.VL_TERC,55.12 );
      //18
      model.setFieldValue(RC500.VL_DA, 55.12);
      //19
      model.setFieldValue(RC500.VL_BC_ICMS, 55.12);
      //20
      model.setFieldValue(RC500.VL_ICMS, 55.12);
      //21
      model.setFieldValue(RC500.VL_BC_ICMS_ST, 55.12);
      //22
      model.setFieldValue(RC500.VL_ICMS_ST, 55.12);
      //23
      model.setFieldValue(RC500.COD_INF, "A11");
      //24
      model.setFieldValue(RC500.VL_PIS, 55.12);
      //25
       model.setFieldValue(RC500.VL_COFINS, 55.12);
       //26
       model.setFieldValue(RC500.TP_LIGACAO, 1);
       //27
       model.setFieldValue(RC500.COD_GRUPO_TENSAO, "01");
       
       
          StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C500|1|1|Campo|11|11|11|11|01|11|04082012|04082012|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|55,12|A11|55,12|55,12|1|01|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
 }
}
