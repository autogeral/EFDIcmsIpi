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
 * 08/02/2013 09:23:39
 * @author Thiago Balthazar
 */
public class RD390 extends LineArchetype  {

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D390"
     */
    
    public static final String CST_ICMS = "CST_ICMS";
     /*
     * C�digo da Situa��o Tribut�ria, conforme a Tabela indicada no item 4.3.1.
     o c�digo de Situa��o Tribut�ria � composto de tr�s d�gitos na forma ABB, 
     onde o 1� d�gito deve ser sempre 0 (zero), para este registro,
     e os 2� e 3� d�gitos indicam a tributa��o pelo ICMS, 
     com base na Tabela B constante no Anexo do Conv�nio SN/70.
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
     * Valor da opera��o correspondente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS,
      inclu�das as despesas acess�rias e acr�scimos
     */
    
    public static final String VL_BC_ISSQN = "VL_BC_ISSQN";
     /*
     * Valor da base de c�lculo do ISSQN
     */
    
    public static final String ALIQ_ISSQN = "ALIQ_ISSQN";
     /*
     * Al�quota do ISSQN
     */
    
    public static final String VL_ISSQN = "VL_ISSQN";
     /*
     * Valor do ISSQN
     */
    
    public static final String VL_BC_ICMS = "VL_BC_ICMS";
     /*
     * Base de c�lculo do ICMS acumulada relativa � al�quota informada
     */
    
    public static final String VL_ICMS = "VL_ICMS";
     /*
     * Valor do ICMS acumulado relativo � al�quota informada
     */
    
    public static final String COD_OBS = "COD_OBS";
     /*
     * C�digo da observa��o do lan�amento fiscal (campo 02 do Registro 0460)
     */

    public RD390() {
    
        setName("REGISTRO D390: REGISTRO ANALITICO DO MOVIMENTO DIARIO (CODIGOS 13, 14,15, 16 E 2E)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
                         
         addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D390"));//1
         addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));//2
         addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));//4
         
         FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(9,2);
         f4.setFormat(fw);
         
         addFieldArchetype(ALIQ_ICMS, f4);//4
     
         FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
         decimal.setFormat(fw);
         
         FieldDecimalMaximumLengthArchetype F4 = new FieldDecimalMaximumLengthArchetype(15,2);
         F4.setFormat(fw);
         
         FieldDecimalMaximumLengthArchetype F5 = new FieldDecimalMaximumLengthArchetype(15,2);
         F5.setFormat(fw);
         
         FieldDecimalMaximumLengthArchetype F6 = new FieldDecimalMaximumLengthArchetype(15,2);
         F6.setFormat(fw);
           
         FieldDecimalMaximumLengthArchetype F7 = new FieldDecimalMaximumLengthArchetype(15,2);
         F7.setFormat(fw);
           
         FieldDecimalMaximumLengthArchetype F8 = new FieldDecimalMaximumLengthArchetype(15,2);
         F8.setFormat(fw);
         
         FieldDecimalMaximumLengthArchetype F9 = new FieldDecimalMaximumLengthArchetype(15,2);
         F9.setFormat(fw);
           
         FieldDecimalMaximumLengthArchetype F10 = new FieldDecimalMaximumLengthArchetype(15,2);
         F10.setFormat(fw);
           
           
         addFieldArchetype(VL_OPR, F5);//5
         addFieldArchetype(VL_BC_ISSQN, F6);//6
         addFieldArchetype(ALIQ_ISSQN, F7);//7
         addFieldArchetype(VL_BC_ISSQN, F8);//8
         addFieldArchetype(VL_BC_ICMS, F9);//9
         addFieldArchetype(VL_ICMS, F10);//10
         addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));//11
    }

    

}
