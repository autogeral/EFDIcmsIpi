package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 19/02/2013 10:52:13
 * @author Thiago Balthazar
 */
public class R1300 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "1300"
     */
    
    
    public static final String COD_ITEM = "COD_ITEM";
    /*
     * Código do Produto, constante do registro 0200
     */
    
    
    public static final String DT_FECH = "DT_FECH";
    /*
     * Data do fechamento da movimentação
     */
    
    
    
    public static final String ESTQ_ABERT = "ESTQ_ABERT";
    /*
     * Estoque no inicio do dia, em litros
     */
    
    
    
    public static final String VOL_ENTR = "VOL_ENTR";
     /*
     * Volume Recebido no dia (em litros)
     */
    
    
   
    public static final String VOL_DISP = "VOL_DISP";
    /*
     * Volume Disponível (04 + 05), em litros
     */
    
    
   
    public static final String VOL_SAIDAS = "VOL_SAIDAS";
    /*
     * Volume Total das Saídas, em litros
     */
    
    
   
    public static final String ESTQ_ESCR = "ESTQ_ESCR";
    /*
     * Estoque Escritural (06 ? 07), litros
     */
    
    
   
    public static final String VAL_AJ_PERDA = "VAL_AJ_PERDA";
    /*
     * Valor da Perda, em litros
     */
    
    
   
    public static final String VAL_AJ_GANHO = "VAL_AJ_GANHO";
    /*
     * Valor do ganho, em litros
     */
    
    
   
    public static final String FECH_FISICO = "FECH_FISICO";
    /*
     * Estoque de Fechamento, em litros
     */

   
    
    
    public R1300() {
        
        setName("REGISTRO 1300: MOVIMENTACAO DIARIA DE COMBUSTIVEIS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getDecimalFormatWithPrecision(3);
        fw.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(15,3);
        d.setFormat(fw);
        
        addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("1300"));
        addFieldArchetype(COD_ITEM,     new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DT_FECH,      new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(ESTQ_ABERT,   d );
        addFieldArchetype(VOL_ENTR,     d);
        addFieldArchetype(VOL_DISP,     d);
        addFieldArchetype(VOL_SAIDAS,   d);
        addFieldArchetype(ESTQ_ESCR,    d);
        addFieldArchetype(VAL_AJ_PERDA, d);
        addFieldArchetype(VAL_AJ_GANHO, d);
        addFieldArchetype(FECH_FISICO,  d);
    }
    
    
   

}
