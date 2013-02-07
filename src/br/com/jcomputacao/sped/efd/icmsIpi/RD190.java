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
    * C�digo da Situa��o Tribut�ria, 
    * conforme a tabela indicada no item 4.3.1
    Nos documentos fiscais de emiss�o pr�pria o campo dever� ser preenchido com o c�digo da
    Situa��o Tribut�ria sob o enfoque do declarante. Nas opera��es de entradas (documentos de terceiros), informar o CST que
    constar no documento fiscal de aquisi��o de servi�os. A partir de julho de 2012, nas opera��es de aquisi��es de
    servi�os o CST_ICMS dever� ser informado sob o enfoque do declarante.
    Valida��o: o valor informado no campo deve existir na Tabela da Situa��o Tribut�ria referente ao ICMS, indicada no item
    4.3.1 do Ato COTEPE/ICMS n� 09, de 18 de abril de 2008, sendo que o primeiro caractere sempre ser� Zero.
    O campo VL_RED_BC s� pode ser preenchido se os dois �ltimos d�gitos do campo CST_ICMS forem iguais a 20 ou 70. O
    primeiro caractere do c�digo do CST dever� ser igual a 0 (zero).
    * 
    */
   public static final String CFOP = "CFOP";   
   /*
    * C�digo Fiscal de Opera��o e Presta��o,
    * conforme a tabela indicada no item 4.2.2
    informar o c�digo aplic�vel � presta��o de servi�o constante no documento. 
    * N�o podem ser utilizados c�digos que correspondam aos t�tulos dos agrupamentos de CFOP (c�digos com caracteres finais 00 ou 50.
    * Por exemplo: 5100).
     
     Valida��o: o valor informado no campo deve existir na Tabela de C�digo Fiscal de Opera��o e Presta��o,
     conforme Ajuste SINIEF 07/01.
    */
   
   public static final String ALIQ_ICMS = "ALIQ_ICMS";
   /*
    * Al�quota do ICMS
    */
   public static final String VL_OPR = "VL_OPR";
   /*
    * Valor da opera��o correspondente � combina��o de CST_ICMS, CFOP, e al�quota do ICMS.
    */
   public static final String VL_BC_ICMS = "VL_BC_ICMS";
   /*
    * Parcela correspondente ao "Valor da base de c�lculo do ICMS" referente � combina��o
     CST_ICMS, CFOP, e al�quota do ICMS
    o valor informado deve ser igual ao valor do campo VL_BC_ICMS do registro D100,
     pai deste registro D190.
    */
   public static final String VL_ICMS = "VL_ICMS";
   /*
    * Parcela correspondente ao "Valor do ICMS" referente � combina��o CST_ICMS, CFOP e
      al�quota do ICMS
    */
   public static final String VL_RED_BC = "VL_RED_BC";
   /*
    * Valor n�o tributado em fun��o da redu��o da base de c�lculo do ICMS,
    * referente � combina��o de CST_ICMS, CFOP e al�quota do ICMS.
    */
   public static final String COD_OBS = "COD_OBS";
   /*
    * C�digo da observa��o do lan�amento fiscal(campo 02 do Registro 0460)
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
