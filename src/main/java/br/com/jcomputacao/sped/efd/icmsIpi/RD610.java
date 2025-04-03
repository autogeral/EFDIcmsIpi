package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 13:27:51
 * @author Thiago Balthazar
 */
public class RD610 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "D610"
 */
public static final String COD_CLASS = "COD_CLASS";
/*
 * Código de classificação do item do serviço de comunicação ou de telecomunicação, 
 * conforme a Tabela 4.4.1
 */
public static final String COD_ITEM = "COD_ITEM";
/*
 * Código do item (campo 02 do Registro 0200)
 */
public static final String QTD = "QTD";
/*
 * Quantidade acumulada do item
 */
public static final String UNID = "UNID";
/*
 * Unidade do item (Campo 02 do registro 0190)
 */
public static final String VL_ITEM = "VL_ITEM";
/*
 * Valor acumulado do item
 */
public static final String VL_DESC = "VL_DESC";
/*
 * Valor acumulado dos descontos
 */
public static final String CST_ICMS = "CST_ICMS";
/*
 * Código da Situação Tributária, conforme a Tabela indicada no item 4.3.1
 */
public static final String CFOP = "CFOP";
/*
 * Código Fiscal de Operação e Prestação conforme tabela indicada no item 4.2.2.
 */
public static final String ALIQ_ICMS = "ALIQ_ICMS";
/*
 * Alíquota do ICMS
 */
public static final String VL_BC_ICMS = "VL_BC_ICMS"; 
/*
 * Valor acumulado da base de cálculo do ICMS
 */
public static final String VL_ICMS = "VL_ICMS";
/*
 * Valor acumulado do ICMS debitado
 */
public static final String VL_BC_ICMS_UF = "VL_BC_ICMS_UF";
/*
 * Valor da base de cálculo do ICMS de outras UFs
 */
public static final String VL_ICMS_UF = "VL_ICMS_UF";
/*
 * Valor do ICMS de outras UFs
 */
public static final String VL_RED_BC = "VL_RED_BC";
/*
 * Valor não tributado em função da redução da base de cálculo do ICMS, referente à
combinação de CST_ICMS, CFOP e alíquota do ICMS.
 */
public static final String VL_PIS = "VL_PIS";
/*
 * Valor acumulado do PIS
 */
public static final String VL_COFINS = "VL_COFINS";
/*
 * Valor acumulado da COFINS
 */
public static final String COD_CTA = "COD_CTA";
/*
 * Código da conta analítica contábil debitada/creditada
 */

    public RD610() {
        
        setName("REGISTRO D610: ITENS DO DOCUMENTO CONSOLIDADO (CODIGO 21 E 22)");
        setDelimiter("|");
             
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(15,3);
        decimal2.setFormat(fw3);
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
            
        FieldDecimalMaximumLengthArchetype decimal3 = new FieldDecimalMaximumLengthArchetype(9,2);
        decimal3.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D610"));
        addFieldArchetype(COD_CLASS, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(QTD, decimal2);
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_ITEM, decimal);
        addFieldArchetype(VL_DESC, decimal);
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP,  new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(ALIQ_ICMS, decimal3);
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_BC_ICMS_UF, decimal);
        addFieldArchetype(VL_ICMS_UF, decimal);
        addFieldArchetype(VL_RED_BC, decimal);
        addFieldArchetype(VL_PIS, decimal);
        addFieldArchetype(VL_COFINS, decimal);
        addFieldArchetype(COD_CTA,new FieldStringMaximumLengthArchetype(255)); 
                
    }


    
    
}
