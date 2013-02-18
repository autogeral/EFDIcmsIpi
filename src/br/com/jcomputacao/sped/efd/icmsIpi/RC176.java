package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 09:55:47
 * @author Thiago Balthazar
 */
public class RC176 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "C176?
 */
public static final String COD_MOD_ULT_E = "COD_MOD_ULT_E";
/*
 * Código do modelo do documento fiscal 
 * relativa a última entrada
 */
public static final String NUM_DOC_ULT_E = "NUM_DOC_ULT_E";
/*
 * Número do documento fiscal relativa a última entrada
 */
public static final String SER_ULT_E = "SER_ULT_E";
/*
 * Série do documento fiscal relativa a última entrada
 */
public static final String DT_ULT_E = "DT_ULT_E";
/*
 * Data relativa a última entrada da mercadoria
 */
public static final String COD_PART_ULT_E = "COD_PART_ULT_E";
/*
 * Código do participante (do emitente do documento relativa a última entrada)
 */
public static final String QUANT_ULT_E = "QUANT_ULT_E";
/*
 * Quantidade do item relativa a última entrada
 */
public static final String VL_UNIT_ULT_E = "VL_UNIT_ULT_E";
/*
 * Valor unitário da mercadoria constante na NF relativa a
 * última entrada inclusive despesas acessórias.
 */
public static final String VL_UNIT_BC_ST = "VL_UNIT_BC_ST";
/*
 * Valor unitário da base de cálculo do imposto pago por substituição
 */

    public RC176() {
        
        setName("REGISTRO C176: RESSARCIMENTO DE ICMS EM OPERACOES COM SUBSTITUICAO TRIBUTARIA (CODIGO 01, 55)");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C176"));
        addFieldArchetype(COD_MOD_ULT_E, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(NUM_DOC_ULT_E, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(SER_ULT_E, new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(DT_ULT_E, new FieldDateFixedLengthArchetype("ddMMYYYY"));
        addFieldArchetype(COD_PART_ULT_E, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(QUANT_ULT_E, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(VL_UNIT_ULT_E, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(VL_UNIT_BC_ST, new FieldIntegerMaximumLengthArchetype(3));
    }
    
    

}
