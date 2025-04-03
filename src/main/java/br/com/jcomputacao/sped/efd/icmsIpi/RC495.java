package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 14:49:25
 * @author Thiago Balthazar
 */
public class RC495 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "C495"
 */
public static final String ALIQ_ICMS = "ALIQ_ICMS";
/*
 * Alíquota do ICMS
 */
public static final String COD_ITEM = "COD_ITEM";
/*
 * Código do item (campo 02 do Registro 0200)
 */
public static final String QTD = "QTD";
/*
 * Quantidade acumulada do item
 */
public static final String QTD_CANC = "QTD_CANC";
/*
 * Quantidade cancelada acumulada, no caso de
   cancelamento parcial de item
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
public static final String VL_CANC = "VL_CANC";
/*
 * Valor acumulado dos cancelamentos
 */
public static final String VL_ACMO = "VL_ACMO";
/*
 * Valor acumulado dos acréscimos
 */
public static final String VL_BC_ICMS = "VL_BC_ICMS";
/*
 * Valor acumulado da base de cálculo do ICMS
 */
public static final String VL_ICMS = "VL_ICMS";
/*
 * Valor acumulado do ICMS
 */
public static final String VL_ISEN = "VL_ISEN";
/*
 * Valor das saídas isentas do ICMS
 */
public static final String VL_NT = "VL_NT";
/*
 * Valor das saídas sob não-incidência ou nãotributadas pelo ICMS
 */
public static final String VL_ICMS_ST = "VL_ICMS_ST";
/*
 * Valor das saídas de mercadorias adquiridas com substituição tributária do ICMS
 */

    public RC495() {
        
        setName("REGISTRO C495: RESUMO MENSAL DE ITENS DO ECF POR ESTABELECIMENTO (CODIGO 02 e 2D)");
        setDelimiter("|");
                
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(15,2);
       d.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype d2 = new FieldDecimalMaximumLengthArchetype(9,2);
       d2.setFormat(fw);
       
       FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
       fw3.setReplaceComa(false);

       FieldDecimalMaximumLengthArchetype d3 = new FieldDecimalMaximumLengthArchetype(15,3);
       d3.setFormat(fw3);
       
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C495"));
        addFieldArchetype(ALIQ_ICMS, d2);
        addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(QTD, d3);
        addFieldArchetype(QTD_CANC, d3);
        addFieldArchetype(UNID, new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_ITEM, d);
        addFieldArchetype(VL_DESC, d);
        addFieldArchetype(VL_CANC, d);
        addFieldArchetype(VL_ACMO, d);
        addFieldArchetype(VL_BC_ICMS, d);
        addFieldArchetype(VL_ICMS, d);
        addFieldArchetype(VL_ISEN, d);
        addFieldArchetype(VL_NT, d);
        addFieldArchetype(VL_ICMS_ST, d);
        
    }


}
