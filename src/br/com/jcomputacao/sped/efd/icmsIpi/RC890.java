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
 * 18/02/2013 15:42:54
 * @author Thiago Balthazar
 */
public class RC890 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "C890"
 */
public static final String CST_ICMS = "CST_ICMS";
/*
 * C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1
 */
public static final String CFOP = "CFOP";
/*
 * C�digo Fiscal de Opera��o e Presta��o do agrupamento de itens
 */
public static final String ALIQ_ICMS = "ALIQ_ICMS";
/*
 * ?Valor total do CF-e? na combina��o de CST_ICMS, CFOP e
   AL�QUOTA DO ICMS, correspondente ao somat�rio do valor
   l�quido dos itens.
 */
public static final String VL_OPR = "VL_OPR";
/*
 * ?Valor total do CF-e? na combina��o de CST_ICMS, CFOP e
   AL�QUOTA DO ICMS, correspondente ao somat�rio do valor
   l�quido dos itens.
 */
public static final String VL_BC_ICMS = "VL_BC_ICMS";
/*
 * Valor acumulado da base de c�lculo do ICMS, referente �
   combina��o de CST_ICMS, CFOP e AL�QUOTA DO ICMS.
 */
public static final String VL_ICMS = "VL_ICMS";
/*
 * Parcela correspondente ao "Valor do ICMS" referente �
 combina��o de CST_ICMS, CFOP e al�quota do ICMS.
 */
public static final String COD_OBS = "COD_OBS";
/*
 * C�digo da observa��o do lan�amento fiscal (campo 02 do registro 0460)
 */

    public RC890() {
        
        setName("REGISTRO C890: RESUMO DIARIO DO CF-E (CODIGO 59) POR EQUIPAMENTO SATCF-E");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype d1 = new FieldDecimalMaximumLengthArchetype(9,2);
       d1.setFormat(fw);
       
       FieldDecimalMaximumLengthArchetype d2 = new FieldDecimalMaximumLengthArchetype(9,2);
       d2.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C890"));
        addFieldArchetype(CST_ICMS, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerMaximumLengthArchetype(4));
        addFieldArchetype(ALIQ_ICMS, d1);
        addFieldArchetype(VL_OPR, d2 );
        addFieldArchetype(VL_BC_ICMS, d2);
        addFieldArchetype(VL_ICMS, d2);
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
    }


}
