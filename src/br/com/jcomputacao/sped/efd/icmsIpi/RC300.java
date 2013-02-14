package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 14/02/2013 09:17:41
 * @author Thiago Balthazar
 */
public class RC300 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "C300"
 */
public static final String COD_MOD = "COD_MOD";
/*
 * Código do modelo do documento fiscal, 
 * conforme a Tabela 4.1.1
 */
public static final String SER = "SER";
/*
 * Série do documento fiscal
 */
public static final String SUB = "SUB";
/*
 * Subsérie do documento fiscal
 */
public static final String NUM_DOC_INI = "NUM_DOC_INI";
/*
 * Número do documento fiscal inicial
 */
public static final String NUM_DOC_FIN = "NUM_DOC_FIN";
/*
 * Número do documento fiscal final
 */
public static final String DT_DOC = "DT_DOC";
/*
 * Data da emissão dos documentos fiscais
 */
public static final String VL_DOC = "VL_DOC";
/*
 * Valor total dos documentos
 */
public static final String VL_PIS = "VL_PIS";
/*
 * Valor total do PIS
 */
public static final String VL_COFINS = "VL_COFINS";
/*
 * Valor total da COFINS
 */
public static final String COD_CTA = "COD_CTA";
/*
 * Código da conta analítica contábil debitada/creditada
 */

    public RC300() {
        
        setName("REGISTRO C300: RESUMO DIARIO DAS NOTAS FISCAIS DE VENDA A CONSUMIDOR (CODIGO 02)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C300"));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC_INI, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(NUM_DOC_FIN, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(DT_DOC, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_DOC, decimal);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(255));
    }

    

}
