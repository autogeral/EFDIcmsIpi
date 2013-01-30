package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 29/01/2013 18:56:16
 * @author Murilo
 */
public class R0100Test {

    public R0100Test() {
    }

    @Test
    public void test() {
        R0100 r = new R0100();
        LineModel model = r.createModel();
        model.setFieldValue(R0100.NOME, "VANESSA REGINA GAVIOLI");
        model.setFieldValue(R0100.CPF, "27859578816");
        model.setFieldValue(R0100.CRC, "ASP199019/O");
//        model.setFieldValue(R0100.CNPJ, "");
        model.setFieldValue(R0100.CEP, 13300190);
        model.setFieldValue(R0100.END, "RUA PADRE BARTOLOMEU TADEI");
        model.setFieldValue(R0100.END_NUM, 268);
        //model.setFieldValue(R0100.END_COMP, null);
        model.setFieldValue(R0100.BAIRRO, "CENTRO");
        model.setFieldValue(R0100.FONE, "1140231678");
        model.setFieldValue(R0100.FAX, "1140231678");
        model.setFieldValue(R0100.EMAIL, "officecont@uol.com.br");
        model.setFieldValue(R0100.CODIGO_MUNICIPIO, 3523909);
        
        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|0100|VANESSA REGINA GAVIOLI|27859578816|ASP199019/O||13300190|RUA PADRE BARTOLOMEU TADEI|268||CENTRO|1140231678|1140231678|officecont@uol.com.br|3523909|";
        
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

}