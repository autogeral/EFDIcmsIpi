package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 14:31:28
 *
 * @author Thiago Balthazar
 */
public class RC490 extends LineArchetype {

    /*
     * Texto fixo contendo "C490"
     */
    public static final String REGISTRO = "REG";
    /*
     * Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1
     */
    public static final String CST_ICMS = "CST_ICMS";
    /*
     * Código Fiscal de Operação e Prestação
     */
    public static final String CFOP = "CFOP";
    /*
     * Alíquota do ICMS
     */
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    /*
     * Valor da operação correspondente à combinação
     de CST_ICMS, CFOP, e alíquota do ICMS,
     incluídas as despesas acessórias e acréscimos
     */
    public static final String VL_OPR = "VL_OPR";
    /*
     * Valor acumulado da base de cálculo do ICMS,
     referente à combinação de CST_ICMS, CFOP, e
     alíquota do ICMS.
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor acumulado do ICMS, referente à combinação de CST_ICMS, 
     * CFOP e alíquota do ICMS.
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Código da observação do lançamento fiscal (campo 02 do Registro 0460)
     */
    public static final String COD_OBS = "COD_OBS";

    public RC490() {

        setName("REGISTRO C490: REGISTRO ANALITICO DO MOVIMENTO DIARIO (CODIGO 02 e 2D)");
        setDelimiter("|");

        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15, 2);
        decimal.setFormat(fw);
        decimal.setNullableRepresentation("");
        decimal.setFullFillingNullable(false);


        FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(9, 2);
        d.setFormat(fw);
        d.setNullableRepresentation("");
        d.setFullFillingNullable(false);

        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C490"));
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(ALIQ_ICMS, d);
        addFieldArchetype(VL_OPR, decimal);
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        FieldArchetype fa = new FieldStringMaximumLengthArchetype(6);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(COD_OBS, fa);

    }
}
