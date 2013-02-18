package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 10:43:58
 * @author Thiago Balthazar
 */
public class RC370 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "C370"
 */
public static final String NUM_ITEM = "NUM_ITEM";
/*
 * Número sequencial do item no documento fiscal
 */
public static final String COD_ITEM = "COD_ITEM";
/*
 * Código do Item (campo 02 do registro 0200)
 */
public static final String QTD = "QTD";
/*
 * Quantidade do item
 */
public static final String UNID = "UNID";
/*
 * Unidade do item (campo 02 do registro 0190)
 */
public static final String VL_ITEM = "VL_ITEM";
/*
 * Valor total do item
 */
public static final String VL_DESC = "VL_DESC";
/*
 * Valor total do desconto no item
 */

    public RC370() {
        
        setName("REGISTRO C370: ITENS DO DOCUMENTO (CODIGO 02)");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
         
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(15,3);
        decimal2.setFormat(fw3);

        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C370"));
        addFieldArchetype(NUM_ITEM, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(QTD, decimal2);
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_ITEM, decimal);
        addFieldArchetype(VL_DESC, decimal);
    }


    
}
