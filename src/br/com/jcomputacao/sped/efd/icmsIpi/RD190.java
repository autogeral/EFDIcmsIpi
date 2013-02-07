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
 * 07/02/2013 08:37:27
 * @author Thiago Balthazar
 */
public class RD190 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D190"
    */
   public static final String CST_ICMS = "CST_ICMS";
   /*
    * Código da Situação Tributária, 
    * conforme a tabela indicada no item 4.3.1
    Nos documentos fiscais de emissão própria o campo deverá ser preenchido com o código da
    Situação Tributária sob o enfoque do declarante. Nas operações de entradas (documentos de terceiros), informar o CST que
    constar no documento fiscal de aquisição de serviços. A partir de julho de 2012, nas operações de aquisições de
    serviços o CST_ICMS deverá ser informado sob o enfoque do declarante.
    Validação: o valor informado no campo deve existir na Tabela da Situação Tributária referente ao ICMS, indicada no item
    4.3.1 do Ato COTEPE/ICMS nº 09, de 18 de abril de 2008, sendo que o primeiro caractere sempre será Zero.
    O campo VL_RED_BC só pode ser preenchido se os dois últimos dígitos do campo CST_ICMS forem iguais a 20 ou 70. O
    primeiro caractere do código do CST deverá ser igual a 0 (zero).
    * 
    */
   public static final String CFOP = "CFOP";   
   /*
    * Código Fiscal de Operação e Prestação,
    * conforme a tabela indicada no item 4.2.2
    informar o código aplicável à prestação de serviço constante no documento. 
    * Não podem ser utilizados códigos que correspondam aos títulos dos agrupamentos de CFOP (códigos com caracteres finais 00 ou 50.
    * Por exemplo: 5100).
     
     Validação: o valor informado no campo deve existir na Tabela de Código Fiscal de Operação e Prestação,
     conforme Ajuste SINIEF 07/01.
    */
   
   public static final String ALIQ_ICMS = "ALIQ_ICMS";
   /*
    * Alíquota do ICMS
    */
   public static final String VL_OPR = "VL_OPR";
   /*
    * Valor da operação correspondente à combinação de CST_ICMS, CFOP, e alíquota do ICMS.
    */
   public static final String VL_BC_ICMS = "VL_BC_ICMS";
   /*
    * Parcela correspondente ao "Valor da base de cálculo do ICMS" referente à combinação
     CST_ICMS, CFOP, e alíquota do ICMS
    o valor informado deve ser igual ao valor do campo VL_BC_ICMS do registro D100,
     pai deste registro D190.
    */
   public static final String VL_ICMS = "VL_ICMS";
   /*
    * Parcela correspondente ao "Valor do ICMS" referente à combinação CST_ICMS, CFOP e
      alíquota do ICMS
    */
   public static final String VL_RED_BC = "VL_RED_BC";
   /*
    * Valor não tributado em função da redução da base de cálculo do ICMS,
    * referente à combinação de CST_ICMS, CFOP e alíquota do ICMS.
    */
   public static final String COD_OBS = "COD_OBS";
   /*
    * Código da observação do lançamento fiscal(campo 02 do Registro 0460)
    */
   
   public RD190(){
   
       setName("REGISTRO D190: REGISTRO ANALITICO DOS DOCUMENTOS (CODIGO 07, 08,8B, 09, 10, 11, 26, 27 e 57).");
       setDelimiter("|");
       
       FormatWrapper fw1 = FormatFactory.getFormat(FormatType.DECIMAL);
       fw1.setReplaceComa(false);
       
       FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(6,2);
       f5.setFormat(fw1);       
       
       FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
       fw.setReplaceComa(false);
       
       FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
       decimal.setFormat(fw);
       
       addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D190"));
       addFieldArchetype(CST_ICMS, new FieldIntegerFixedLengthArchetype(3));
       addFieldArchetype(CFOP, new FieldIntegerFixedLengthArchetype(4));
       addFieldArchetype(ALIQ_ICMS, f5);
       addFieldArchetype(VL_OPR, decimal);
       addFieldArchetype(VL_BC_ICMS, decimal);
       addFieldArchetype(VL_ICMS, decimal);
       addFieldArchetype(VL_RED_BC, decimal);
       addFieldArchetype(COD_OBS, new FieldStringMaximumLengthArchetype(6));
             
   }  
                                                                 
}
