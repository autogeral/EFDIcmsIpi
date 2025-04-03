package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 30/01/2013 21:14:49
 *
 * @author Murilo
 */
public class R0150Test {

    @Test
    public void testPessoaFisica() {
        R0150 r = new R0150();
        LineModel model = r.createModel();
        model.setFieldValue(R0150.COD_PART, "00026876582868");
        model.setFieldValue(R0150.NOME, "ANTONIO GUALBERTO");
        model.setFieldValue(R0150.COD_PAIS, "1058");
        model.setFieldValue(R0150.CPF, 26876582868L);
        model.setFieldValue(R0150.COD_MUN, 3552205);
        model.setFieldValue(R0150.END, "RUA MANOEL CESAR DE CAMARGO 92");
        model.setFieldValue(R0150.END_NUM, 0);
        model.setFieldValue(R0150.BAIRRO, "VILA CAROL");

        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|0150|00026876582868|ANTONIO GUALBERTO|1058||26876582868||3552205||RUA MANOEL CESAR DE CAMARGO 92|0||VILA CAROL|";

        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
        
        model.setFieldValue(R0150.END_COMP, "COMPL");
        model.setFieldValue(R0150.END, "RUA MANOEL CESAR DE CAMARGO");
        model.setFieldValue(R0150.END_NUM, 92);
        expected = "|0150|00026876582868|ANTONIO GUALBERTO|1058||26876582868||3552205||RUA MANOEL CESAR DE CAMARGO|92|COMPL|VILA CAROL|";
        sb = model.getRepresentation();
        result = sb.toString();
        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }

    @Test
    public void testPessoaJuridica() {
        R0150 r = new R0150();
        LineModel model = r.createModel();
        model.setFieldValue(R0150.COD_PART, "01910513000100");
        model.setFieldValue(R0150.NOME, "APS DISTRIBUIDORA DE AUTOPECAS");
        model.setFieldValue(R0150.COD_PAIS, "1058");
        model.setFieldValue(R0150.CNPJ, 1910513000100L);
        model.setFieldValue(R0150.IE, "639061567119");
        model.setFieldValue(R0150.COD_MUN, 3549102);
        model.setFieldValue(R0150.END, "ROD SP 342 ADEMAR DE BARROS");
        model.setFieldValue(R0150.END_NUM, 511);
        model.setFieldValue(R0150.BAIRRO, "PQ.RESIDENCIAL JD SAO DOMINGOS");

        StringBuffer sb = model.getRepresentation();
        String result = sb.toString();
        String expected = "|0150|01910513000100|APS DISTRIBUIDORA DE AUTOPECAS|1058|01910513000100||639061567119|3549102||ROD SP 342 ADEMAR DE BARROS|511||PQ.RESIDENCIAL JD SAO DOMINGOS|";

        System.out.println("Excecting ....  : " + expected);
        System.out.println("Result    ....  : " + result);
        assertEquals(expected, result);
    }
}