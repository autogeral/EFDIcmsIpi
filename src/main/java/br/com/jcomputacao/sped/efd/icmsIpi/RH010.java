package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 15/02/2013 09:56:55
 *
 * @author Vinicius Diana
 */
public class RH010 extends LineArchetype {

    /*
     * 1 - Texto fixo contendo "H010" 
     */
    public static final String REGISTRO = "REGISTRO ";
    /*
     * 2 - Código do item (campo 02 do Registro 0200)  
     */
    public static final String COD_ITEM = " COD_ITEM ";
    /*
     * 3 -  Unidade do item  
     */
    public static final String UNID = " UNID ";
    /*
     * 4 -   Quantidade do item
     */
    public static final String QTD = "QTD";
    /*
     * 5 - Valor unitário do item 
     */
    public static final String VL_UNIT = "VL_UNIT ";
    /*
     * 6 - Valor do item 
     */
    public static final String VL_ITEM = " VL_ITEM";
    /*
     * 7 -  Indicador de propriedade/posse do item: 0- Item de propriedade do informante e em seu poder; 1- Item de propriedade do informante em posse de terceiros; 2- Item de propriedade de terceiros em posse do informante

     */
    public static final String IND_PROP = " IND_PROP";
    /*
     * 8 - Código do participante (campo 02 do Registro 0150): - proprietário/possuidor que não seja o informante do arquivo 
     */
    public static final String COD_PART = " COD_PART ";
    /*
     * 9 - Descrição complementar. 
     */
    public static final String TXT_COMPL = "TXT_COMPL ";
    /*
     * 10 - Código da conta analítica contábil debitada/creditada 
     */
    public static final String COD_CTA = " COD_CTA ";
    /*
     * 11 -  Valor do item para efeitos do Imposto de Renda 
     */
    public static final String  VL_ITEM_IR = "VL_ITEM_IR";

    public RH010() {
        setName("Registro H010 - inventario");
        setDelimiter("|");
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FormatWrapper fw1 = FormatFactory.getDecimalFormatWithPrecision(6);
        fw1.setReplaceComa(false);
        FormatWrapper fw2 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw2.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("H010"));
        //2
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        //3
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        //4
        FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(20, 3);
        f1.setFormat(fw2);
        addFieldArchetype(QTD, f1);
        //5
        FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(20, 6);
        f2.setFormat(fw1);
        addFieldArchetype(VL_UNIT, f2);
        //6
        FieldDecimalMaximumLengthArchetype f3 = new FieldDecimalMaximumLengthArchetype(15, 2);
        f3.setFormat(fw);
        addFieldArchetype(VL_ITEM, f3);
        //7
        addFieldArchetype(IND_PROP, new FieldStringFixedLengthArchetype(1));
        FieldArchetype fa = new FieldStringMaximumLengthArchetype(60);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(COD_PART, fa);
        //9
        fa = new FieldStringMaximumLengthArchetype(255);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(TXT_COMPL, fa);
        //10
        fa = new FieldStringMaximumLengthArchetype(255);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(COD_CTA, fa);
        //11
        FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15, 2);
        f4.setFormat(fw);
        addFieldArchetype(VL_ITEM_IR, f4);



    }
}
