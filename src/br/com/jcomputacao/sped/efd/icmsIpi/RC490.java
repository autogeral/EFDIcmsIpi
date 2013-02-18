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
 * 18/02/2013 14:31:28
 * @author Thiago Balthazar
 */
public class RC490 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C490"
     */
    public static final String CST_ICMS = "CST_ICMS";
    /*
     * C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1
     */
    public static final String CFOP = "CFOP";
    /*
     * C�digo Fiscal de Opera��o e Presta��o
     */
    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    /*
     * Al�quota do ICMS
     */
    public static final String VL_OPR = "VL_OPR";
    /*
     * Valor da opera��o correspondente � combina��o
       de CST_ICMS, CFOP, e al�quota do ICMS,
       inclu�das as despesas acess�rias e acr�scimos
     */
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
     * Valor acumulado da base de c�lculo do ICMS,
       referente � combina��o de CST_ICMS, CFOP, e
       al�quota do ICMS.
     */
    public static final String VL_ICMS = "VL_ICMS";
    /*
     * Valor acumulado do ICMS, referente � combina��o de CST_ICMS, 
     * CFOP e al�quota do ICMS.
     */
    public static final String COD_OBS = "COD_OBS";
    /*
     * C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460)
     */

    public RC490() {
        
        setName("REGISTRO C490: REGISTRO ANALITICO DO MOVIMENTO DIARIO (CODIGO 02 e 2D)");
        setDelimiter("|");
        
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
        
     
       FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(9,2);
       d.setFormat(fw);
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C490"));
        addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(ALIQ_ICMS, d);
        addFieldArchetype(VL_OPR, decimal);    
        addFieldArchetype(VL_BC_ICMS, decimal);
        addFieldArchetype(VL_ICMS, decimal);
        addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));               
    
    }
     
    
}
