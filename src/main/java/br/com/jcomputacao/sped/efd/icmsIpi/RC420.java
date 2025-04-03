package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 12:02:38
 *
 * @author Thiago Balthazar
 */
public class RC420 extends LineArchetype {

    /*
     * Texto fixo contendo "C420"
     */
    public static final String REGISTRO = "REG";
    /*
     * Código do totalizador, conforme Tabela 4.4.6
     */
    public static final String COD_TOT_PAR = "COD_TOT_PAR";
    /*
     * Valor acumulado no totalizador, relativo à
     respectiva Redução Z.
     */
    public static final String VLR_ACUM_TOT = "VLR_ACUM_TOT";
    /*
     * Número do totalizador quando ocorrer mais de
     uma situação com a mesma carga tributária efetiva.
     */
    public static final String NR_TOT = "NR_TOT";
    /*
     * Descrição da situação tributária relativa ao
     totalizador parcial, quando houver mais de um
     com a mesma carga tributária efetiva.
     */
    public static final String DESCR_NR_TOT = "DESCR_NR_TOT";

    public RC420() {
        setName("REGISTRO C420: REGISTRO DOS TOTALIZADORES PARCIAIS DA REDUCAO Z (COD 02 e 2D)");
        setDelimiter("|");

        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15, 2);
        decimal.setFormat(fw);

        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C420"));
        addFieldArchetype(COD_TOT_PAR, new FieldStringMaximumLengthArchetype(7));
        addFieldArchetype(VLR_ACUM_TOT, decimal);
        addFieldArchetype(NR_TOT, new FieldIntegerMaximumLengthArchetype(2));
        FieldArchetype fa = new FieldStringMaximumLengthArchetype(255);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(DESCR_NR_TOT, fa);
    }
}
