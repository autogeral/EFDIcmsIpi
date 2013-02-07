package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 07/02/2013 09:51:21
 * @author Thiago Balthazar
 */
public class RD197Test {

    @Test
    public void RD197Test1(){ // Sem descrição
    
        RD197 r = new RD197();
        
        LineModel model = r.createModel();
        
        model.setFieldValue(r.COD_AJ, "1521569874");
        model.setFieldValue(r.DESCR_COMPL_AJ,"");
        model.setFieldValue(r.COD_ITEM, "000116D");
        model.setFieldValue(r.VL_BC_ICMS, 1500.00);
        model.setFieldValue(r.ALIQ_ICMS, 123.11);
        model.setFieldValue(r.VL_ICMS, 1000.00);
        model.setFieldValue(r.VL_OUTROS, 100.50);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D197|1521569874||000116D|1500,00|123,11|1000,00|100,50|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
    }
    
     @Test
    public void RD197Test2(){ // Com descrição
    
        RD197 r = new RD197();
        
        LineModel model = r.createModel();
        
        model.setFieldValue(r.COD_AJ, "1521569874");
        model.setFieldValue(r.DESCR_COMPL_AJ,"Os documentos fiscais deverão ser fornecidos sempre que ocorrer o fornecimento de um bem ou prestacao de servicos, ainda que a saida ou a prestacao do servico esteja isenta ou imune do pagamento de impostos");
        model.setFieldValue(r.COD_ITEM, "000116D");
        model.setFieldValue(r.VL_BC_ICMS, 1500.00);
        model.setFieldValue(r.ALIQ_ICMS, 123.11);
        model.setFieldValue(r.VL_ICMS, 1000.00);
        model.setFieldValue(r.VL_OUTROS, 100.50);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|D197|1521569874|Os documentos fiscais deverão ser fornecidos sempre que ocorrer o fornecimento de um bem ou prestacao de servicos, ainda que a saida ou a prestacao do servico esteja isenta ou imune do pagamento de impostos|000116D|1500,00|123,11|1000,00|100,50|";
                         
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
    }
}
