package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateTimeFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 18/02/2013 11:36:51
 * @author Thiago Balthazar
 */
public class RC405 extends LineArchetype{

    /**
     * Texto fixo contendo "C405"
     */
    public static final String REGISTRO = "REG";
    /**
     * Data do movimento a que se refere a Redu��o Z
     */
    public static final String DT_DOC = "DT_DOC";
    /**
     * Posi��o do Contador de Rein�cio de Opera��o
     */
    public static final String CRO = "CRO";
    /**
     * Posi��o do Contador de Redu��o Z
     */
    public static final String CRZ = "CRZ";
    /**
     * N�mero do Contador de Ordem de Opera��o do �ltimo documento emitido no dia. 
     * (N�mero do COO na Redu��o Z)
     */
    public static final String NUM_COO_FIN = "NUM_COO_FIN";
    /**
     * Valor do Grande Total final
     */
    public static final String GT_FIN = "GT_FIN";
    /**
     * Valor da venda bruta
     */
    public static final String VL_BRT = "VL_BRT";
    

    public RC405() {
        
       setName("REGISTRO C405: REDU��O Z (CODIGO 02 e 2D)");
       setDelimiter("|");
                
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C405"));
        addFieldArchetype(DT_DOC, new FieldDateTimeFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(CRO, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(CRZ, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(NUM_COO_FIN, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(GT_FIN, decimal);
        addFieldArchetype(VL_BRT, decimal);
    }
       
}
