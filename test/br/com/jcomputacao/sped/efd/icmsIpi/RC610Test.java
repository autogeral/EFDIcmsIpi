package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineArchetype;
import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 18/02/2013 15:08:50
 * @author Vinicius Diana
 */
public class RC610Test extends LineArchetype{

    @Test
    public void RC610Test(){
        RC610 r = new RC610();
    LineModel model = r.createModel();
    //2
      model.setFieldValue(RC610.COD_CLASS, 1111);
      //3
      model.setFieldValue(RC610.COD_ITEM, "RC610");
      //4
      model.setFieldValue(RC610.QTD, 55.111);
      //5
      model.setFieldValue(RC610.UNID, "A123");
      //6
      model.setFieldValue(RC610.VL_ITEM, 55.12);
      //7
      model.setFieldValue(RC610.VL_DESC, 55.12);
      //8
      model.setFieldValue(RC610.CST_ICMS, 123);
      //9
      model.setFieldValue(RC610.CFOP, 1234 );
      //10
      model.setFieldValue(RC610.ALIQ_ICMS, 55.12);
      //11
      model.setFieldValue(RC610.VL_BC_ICMS, 55.12);
      //12
      model.setFieldValue(RC610.VL_ICMS, 55.12);
      //13
      model.setFieldValue(RC610.VL_BC_ICMS_ST, 55.12);
      //14
      model.setFieldValue(RC610.VL_ICMS_ST, 55.12);
      //15
      model.setFieldValue(RC610.VL_PIS, 55.12);
      //16
      model.setFieldValue(RC610.VL_COFINS, 55.12);
      //17
      model.setFieldValue(RC610.COD_CTA, "CC610");
        
        StringBuffer st = model.getRepresentation();
        String result = st.toString();
         String expected = "|C610|1111|RC610|55,111|A123|55,12|55,12|123|1234|55,12|55,12|55,12|55,12|55,12|55,12|55,12|CC610|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
    }
}
