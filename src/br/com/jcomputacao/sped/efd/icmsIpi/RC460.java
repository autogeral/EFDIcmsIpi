package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 13:52:37
 *
 * @author Thiago Balthazar
 */
public class RC460 extends LineArchetype {

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C460"
     */
    public static final String COD_MOD = "COD_MOD";
    /*
     * Código do modelo do documento fiscal,
     * conforme a Tabela 4.1.1
     */
    public static final String COD_SIT = "COD_SIT";
    /*
     * Código da situação do documento fiscal,
     conforme a Tabela 4.1.2
     */
    public static final String NUM_DOC = "NUM_DOC";
    /*
     * Número do documento fiscal (COO)
     */
    public static final String DT_DOC = "DT_DOC";
    /*
     * Data da emissão do documento fiscal
     */
    public static final String VL_DOC = "VL_DOC";
    /*
     * Valor total do documento fiscal
     */
    public static final String VL_PIS = "VL_PIS";
    /*
     * Valor do PIS
     */
    public static final String VL_COFINS = "VL_COFINS";
    /*
     * Valor da COFINS
     */
    public static final String CPF_CNPJ = "CPF_CNPJ";
    /*
     * CPF ou CNPJ do adquirente
     */
    public static final String NOM_ADQ = "NOM_ADQ";
    /*
     * Nome do adquirente
     */

    public RC460() {

        setName("REGISTRO C460: DOCUMENTO FISCAL EMITIDO POR ECF (CODIGO 02 e 2D)");
        setDelimiter("|");

        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15, 2);
        decimal.setFormat(fw);

        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C460"));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(COD_SIT, new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_DOC, decimal);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
        FieldArchetype fa = new FieldIntegerMaximumLengthArchetype(14);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(CPF_CNPJ, fa);
        fa = new FieldStringMaximumLengthArchetype(60);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(NOM_ADQ, fa);
    }
}
