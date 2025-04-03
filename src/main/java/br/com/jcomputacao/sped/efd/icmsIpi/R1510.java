package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 15:02:52
 * @author Thiago Balthazar
 */
public class R1510 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
    * Texto fixo contendo "1510"
    */



    public static final String NUM_ITEM = "NUM_ITEM";
    /*
    * NÃºmero sequencial do item no documento fiscal
    */



    public static final String COD_ITEM = "COD_ITEM";
    /*
    * CÃ³digo do item (campo 02 do Registro 0200)
    */



    public static final String COD_CLASS = "COD_CLASS";
    /*
    * CÃ³digo de classificaÃ§Ã£o do item de energia elÃ©trica, conforme a Tabela 4.4.1
    */



    public static final String QTD = "QTD";
    /*
    * Quantidade do item
    */



    public static final String UNID = "UNID";
    /*
    * Unidade do item (Campo 02 do registro 0190)
    */



    public static final String VL_ITEM = "VL_ITEM";
    /*
    * Valor do item
    */



    public static final String VL_DESC = "VL_DESC";
    /*
    * Valor total do desconto
    */



    public static final String CST_ICMS = "CST_ICMS";
    /*
    * CÃ³digo da SituaÃ§Ã£o Tributï¿½ria, conforme a Tabela indicada no item 4.3.1
    */



    public static final String CFOP = "CFOP";
    /*
    * CÃ³digo Fiscal de OperaÃ§Ã£o e PrestaÃ§Ã£o
    */



    public static final String VL_BC_ICMS = "VL_BC_ICMS";
    /*
    * Valor da base de cï¿½lculo do ICMS
    */



    public static final String ALIQ_ICMS = "ALIQ_ICMS";
    /*
    * Alï¿½quota do ICMS
    */



    public static final String VL_ICMS = "VL_ICMS";
    /*
    * Valor do ICMS creditado/debitado
    */



    public static final String VL_BC_ICMS_ST = "VL_BC_ICMS_ST";
    /*
    * Valor da base de cï¿½lculo referente ï¿½ substituiÃ§Ã£o tributï¿½ria
    */



    public static final String ALIQ_ST = "ALIQ_ST";
    /*
    *Alï¿½quota do ICMS da substituiÃ§Ã£o tributï¿½ria na unidade da federaÃ§Ã£o de destino 
    */



    public static final String VL_ICMS_ST = "VL_ICMS_ST";
    /*
    * Valor do ICMS referente ï¿½ substituiÃ§Ã£o tributï¿½ria
    */



    public static final String IND_REC = "IND_REC";
    /*
    * Indicador do tipo de receita:
        0- Receita prï¿½pria;
        1- Receita de terceiros
    */



    public static final String COD_PART = "COD_PART";
    /*
    * CÃ³digo do participante receptor da receita, terceiro da
    operaÃ§Ã£o (campo 02 do Registro 0150)
    */



    public static final String VL_PIS = "VL_PIS";
    /*
    * Valor do PIS
    */



    public static final String VL_COFINS = "VL_COFINS";
    /*
    * Valor da COFINS
    */



    public static final String COD_CTA = "COD_CTA";
    /*
    * CÃ³digo da conta analï¿½tica contï¿½bil debitada/creditada
    */



    public R1510() {

        setName("REGISTRO 1510: ITENS DO DOCUMENTO NOTA FISCAL/CONTA ENERGIA ELETRICA (CODIGO 06)");
        setDelimiter("|");
                       
        FormatWrapper fw3 = FormatFactory.getDecimalFormatWithPrecision(3);
        fw3.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype decimal3 = new FieldDecimalMaximumLengthArchetype(9,3);
        decimal3.setFormat(fw3);
            
       FormatWrapper fw = FormatFactory.getDecimalFormatWithPrecision(2);
       fw.setReplaceComa(false);
     
       FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(15,2);
       d.setFormat(fw);
                       
        FieldDecimalMaximumLengthArchetype d1 = new FieldDecimalMaximumLengthArchetype(9,2);
       d1.setFormat(fw);
       
        addFieldArchetype(REGISTRO,   new FieldDefaultArchetype("1510"));
        addFieldArchetype(NUM_ITEM,   new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(COD_ITEM,   new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(COD_CLASS,  new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(QTD,        decimal3);
        addFieldArchetype(UNID,       new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(VL_ITEM,    d);
        addFieldArchetype(VL_DESC,    d);
        addFieldArchetype(CST_ICMS,   new FieldIntegerFixedLengthArchetype(3));
        addFieldArchetype(CFOP,       new FieldIntegerFixedLengthArchetype(4));
        addFieldArchetype(VL_BC_ICMS, d);
        addFieldArchetype(ALIQ_ICMS,  d1);        
        addFieldArchetype(VL_ICMS,    d);        
        addFieldArchetype(VL_BC_ICMS, d);
        addFieldArchetype(ALIQ_ST,    d);
        addFieldArchetype(VL_ICMS_ST, d);
        addFieldArchetype(IND_REC,    new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(COD_PART,   new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(VL_PIS,     d);
        addFieldArchetype(VL_COFINS,  d);
        addFieldArchetype(COD_CTA,    new FieldStringMaximumLengthArchetype(255)  );
        
    }



}
