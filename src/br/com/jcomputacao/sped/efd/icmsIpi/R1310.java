package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 19/02/2013 11:13:39
 * @author Thiago Balthazar
 */
public class R1310  extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "1310"
     */
    
    
    public static final String NUM_TANQUE = "NUM_TANQUE";
    /*
     * Tanque que armazena o combustível
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
     * Volume Disponível (03 + 04), em litros
     */
    
    
    public static final String VOL_SAIDAS = "VOL_SAIDAS";
    /*
     * Volume Total das Saídas, em litros
     */
    
    
    public static final String ESTQ_ESCR = "ESTQ_ESCR";
    /*
     * Estoque Escritural(05 ? 06), litros
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
     * Volume aferido no tanque, em litros. 
     * Estoque de fechamento físico do tanque.
     */


    
     public R1310() {
         
         setName("REGISTRO 1310: MOVIMENTACAO DIARIA DE COMBUSTIVEIS POR TANQUE");
         setDelimiter("|");
         
         FormatWrapper fw = FormatFactory.getDecimalFormatWithPrecision(3);
         fw.setReplaceComa(false);

         FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(15,3);
         d.setFormat(fw);
         
         addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("1310"));
         addFieldArchetype(NUM_TANQUE,   new FieldStringMaximumLengthArchetype(3));
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
