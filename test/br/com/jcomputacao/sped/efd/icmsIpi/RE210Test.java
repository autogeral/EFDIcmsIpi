package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * 06/02/2013 11:35:28
 * @author Vinicius Diana
 */
public class RE210Test {
@Test
public void RE210(){
    RE210 r = new RE210();
    LineModel model = r.createModel();
    
    //2
    model.setFieldValue(RE210.IND_MOV_ST, "1");
    //3
    model.setFieldValue(RE210.VL_SLD_CRED_ANT_ST, 5555.22);
    //4
    model.setFieldValue(RE210.VL_DEVOL_ST, 555.55);
    //5
    model.setFieldValue(RE210.VL_RESSARC_ST, 444.55);
    //6
    model.setFieldValue(RE210.VL_OUT_CRED_ST, 77.55);
    //7
    model.setFieldValue(RE210.VL_AJ_CREDITOS_ST, 555.45);
    //8
    model.setFieldValue(RE210.VL_RETENCAO_ST, 87.44);
    //9
    model.setFieldValue(RE210.VL_OUT_DEB_ST, 88.55);
    //10
    model.setFieldValue(RE210.VL_AJ_DEBITOS_ST, 555.22);
    //11
    model.setFieldValue(RE210.VL_SLD_DEV_ANT_ST, 78.55);
    //12
    model.setFieldValue(RE210.VL_DEDUCOES_ST, 778.44);
    //13
    model.setFieldValue(RE210.VL_ICMS_RECOL_ST, 878.78);
    //14
    model.setFieldValue(RE210.VL_SLD_CRED_ST_TRAN_SPORTAR, 787.55);
    //15
    model.setFieldValue(RE210.DEB_ESP_ST, 445.25);
    
    StringBuffer st = model.getRepresentation();
     String result = st.toString();
         String expected = "|E210|1|5555,22|555,55|444,55|77,55|555,45|87,44|88,55|555,22|78,55|778,44|878,78|787,55|445,25|";
        System.out.println("Excecting ....  : " + expected);
         System.out.println("Result    ....  : " + result);
         assertEquals(expected, result);
}
}
