package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 10:32:01
 * @author Thiago Balthazar
 */
public class RC179 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "C179?
 */
public static final String BC_ST_ORIG_DEST = "BC_ST_ORIG_DEST";
/*
 * Valor da base de cálculo ST na origem/destino em operações interestaduais
 */
public static final String ICMS_ST_REP = "ICMS_ST_REP";
/*
 * Valor do ICMS-ST a repassar/deduzir em operações interestaduais
 */
public static final String ICMS_ST_COMPL = "ICMS_ST_COMPL";
/*
 * Valor do ICMS-ST a complementar à UF de destino
 */
public static final String BC_RET = "BC_RET";
/*
 * Valor da BC de retenção em remessa promovida por Substituído intermediário
 */
public static final String ICMS_RET = "ICMS_RET";
/*
 * Valor da parcela do imposto retido em remessa promovida por substituído intermediário
 */

    public RC179() {
        
        setName("REGISTRO C179: INFORMACOES COMPLEMENTARES ST (CODIGO 01)");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C179"));
        addFieldArchetype(BC_ST_ORIG_DEST, decimal);
        addFieldArchetype(ICMS_ST_REP, decimal);
        addFieldArchetype(ICMS_ST_COMPL, decimal);
        addFieldArchetype(BC_RET, decimal);
        addFieldArchetype(ICMS_RET, decimal);
    }
       


}
