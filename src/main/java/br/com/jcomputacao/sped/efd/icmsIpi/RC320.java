package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 14/02/2013 10:01:20
 * @author Thiago Balthazar
 */
public class RC320 extends LineArchetype {

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "C320"
 */
public static final String CST_ICMS = "CST_ICMS";
/*
 * Código da Situação Tribut�ria, conforme a Tabela indicada no item 4.3.1
 */
public static final String CFOP = "CFOP";
/*
 * Código Fiscal de Operação e Prestação
 */
public static final String ALIQ_ICMS = "ALIQ_ICMS";
/*
 * Al�quota do ICMS
 */
public static final String VL_OPR = "VL_OPR";
/*
 * Valor total acumulado das opera��es correspondentes � combinação de CST_ICMS,
CFOP e al�quota do ICMS, inclu�das as despesas acess�rias e acr�scimos.
 */
public static final String VL_BC_ICMS = "VL_BC_ICMS";
/*
 * Valor acumulado da base de c�lculo do ICMS, referente � combinação de CST_ICMS, CFOP, 
 * e al�quota do ICMS.
 */
public static final String VL_ICMS = "VL_ICMS";
/*
 * Valor acumulado do ICMS, referente � combinação de CST_ICMS, CFOP e al�quota do
ICMS.
 */
public static final String VL_RED_BC = "VL_RED_BC";
/*
 * Valor n�o tributado em fun��o da redu��o da base de c�lculo do ICMS, 
 * referente � combinação de CST_ICMS, CFOP, e al�quota do ICMS
 */
public static final String COD_OBS = "COD_OBS";
/*
 * Código da observação do lan�amento fiscal (campo 02 do Registro 0460)
 */

    public RC320() {
        
        setName("REGISTRO C320: REGISTRO ANALITICO DO RESUMO DIARIO DAS NOTAS FISCAIS DE VENDA A CONSUMIDOR (CODIGO 02)");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype decimal2 = new FieldDecimalMaximumLengthArchetype(9,2);
       decimal2.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C320"));
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(ALIQ_ICMS, decimal2);
        addFieldArchetype(VL_OPR, decimal);
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(VL_RED_BC, decimal);
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
        
    }



}
