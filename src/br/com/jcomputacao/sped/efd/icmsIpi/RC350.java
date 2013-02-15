package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 14/02/2013 11:45:33
 * @author Thiago Balthazar
 */
public class RC350 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "C350"
 */
public static final String SER = "SER";
/*
 * Série do documento fiscal
 */
public static final String SUB_SER = "SUB_SER";
/*
 * Subsérie do documento fiscal
 */
public static final String NUM_DOC = "NUM_DOC";
/*
 * Número do documento fiscal
 */
public static final String DT_DOC = "DT_DOC";
/*
 * Data da emissão do documento fiscal
 */
public static final String CNPJ_CPF = "CNPJ_CPF";
/*
 * CNPJ ou CPF do destinatário
 */
public static final String VL_MERC = "VL_MERC";
/*
 * Valor das mercadorias constantes no documento fiscal
 */
public static final String VL_DOC = "VL_DOC";
/*
 * Valor total do documento fiscal
 */
public static final String VL_DESC = "VL_DESC";
/*
 * Valor total do desconto
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

    public RC350() {
   
        setName("REGISTRO C350: NOTA FISCAL DE VENDA A CONSUMIDOR (CODIGO 02)");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C350"));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(SUB_SER, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CNPJ_CPF, new FieldIntegerMaximumLengthArchetype(14));
        addFieldArchetype(VL_MERC, decimal);
        addFieldArchetype(VL_DOC, decimal);
        addFieldArchetype(VL_DESC, decimal);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
        addFieldArchetype(COD_CTA, new FieldStringMaximumLengthArchetype(255));
        
    }


       
}
