package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 01/02/2013 17:53:22
 *
 * @author Murilo Tuvani
 */
public class RC105 extends LineArchetype {

    public static final String REGISTRO = "REG";
    /**
     * Indicador do tipo de operação:
     * 0- Combustíveis e Lubrificantes;
     * 1- leasing de veículos ou faturamento direto.
     */
    public static final String OPER = "OPER";
    /**
     * Sigla da UF de destino do ICMS_ST
     */
    public final static String UF = "UF";

    public RC105() {
        setName("Registro C105 - Operacoes com ICMS-ST recolhido para UF Diversa do destinatario do documento fiscal 55");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C105"));
        addFieldArchetype(OPER,     new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(UF,       new FieldStringFixedLengthArchetype(2));
    }
}
