package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 04/02/2013 23:43:55
 * @author Murilo
 */
public class RC112 extends LineArchetype {
    
    public static final String REGISTRO  = "REG";
    /**
     * 0 - documento estadual de arrecadacao
     * 1 - GNRE
     */
    public static final String COD_DA    = "COD_DA";
    /**
     * Unidade federada beneficiária do recolhimento
     */
    public static final String UF        = "UF";
    /**
     * Numero do documento de arrecadacao
     */
    public static final String NUM_DA    = "NUM_DA";
    /**
     * Codigo de autenticacao bancaria
     */
    public static final String COD_AUT   = "COD_AUT";
    /**
     * Valor do total do documento de arrecadacao
     * (principal, autalizacao, monetaria, juros e multa).
     */
    public static final String VL_DA     = "VL_DA";
    /**
     * Data de vencimento do documento de arrecadacao
     */
    public static final String DT_VCTO   = "DT_VCTO";
    /**
     * Data de pagamento do docuemnto de arrecadacao,
     * ou data do vencimento, no caso de ICMS antecipado a recolher.
     */
    public static final String DT_PGTO   = "DT_PGTO";
    
    public RC112() {
        setName("Registro C112 - Documento de arrecadacao referenciado");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C112"));
        addFieldArchetype(COD_DA,   new FieldIntegerFixedLengthArchetype(1));
        addFieldArchetype(UF,       new FieldStringFixedLengthArchetype(2));
        FieldArchetype fa = new FieldStringMaximumLengthArchetype(120);
        fa.setNullableRepresentation("");
        addFieldArchetype(NUM_DA,   fa);
        fa = new FieldStringMaximumLengthArchetype(120);
        fa.setNullableRepresentation("");
        addFieldArchetype(COD_AUT,  fa);
        fa = new FieldDecimalMaximumLengthArchetype(20);
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        fw.setCasasDecimais(2);
        addFieldArchetype(VL_DA,    fa);
        addFieldArchetype(DT_VCTO,  new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_PGTO,  new FieldDateFixedLengthArchetype("ddMMyyyy"));
    }

}
