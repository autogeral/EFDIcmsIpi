package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 10:22:57
 * @author Thiago Balthazar
 */
public class R1200 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "1200"
     */
    
    
    public static final String COD_AJ_APUR = "COD_AJ_APUR";
    /*
     * C�digo de ajuste, conforme informado na Tabela
        indicada no item 5.1.1.
     */
    
    
    public static final String SLD_CRED = "SLD_CRED";
    /*
     * Saldo de cr�ditos fiscais de per�odos anteriores
     */
    
    
    public static final String CRED_APR = "CRED_APR";
    /*
     * Total de cr�dito apropriado no m�s
     */
    
    
    public static final String CRED_RECEB = "CRED_RECEB";
    /*
     * Total de cr�ditos recebidos por transfer�ncia
     */
    
    
    public static final String CRED_UTIL = "CRED_UTIL";
    /*
     * Total de cr�ditos utilizados no per�odo
     */
    
    
    
    public static final String SLD_CRED_FIM = "SLD_CRED_FIM";
    /*
     * Saldo de cr�dito fiscal acumulado a transportar 
     * para o per�odo seguinte
    */

    
    public R1200() {
        
        setName("REGISTRO 1200: CONTROLE DE CREDITOS FISCAIS - ICMS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
        
        addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("1200"));
        addFieldArchetype(COD_AJ_APUR,  new FieldStringFixedLengthArchetype(8));
        addFieldArchetype(SLD_CRED,     decimal);
        addFieldArchetype(CRED_APR,     decimal);
        addFieldArchetype(CRED_RECEB,   decimal);
        addFieldArchetype(CRED_UTIL,    decimal);
        addFieldArchetype(SLD_CRED_FIM, decimal);
    }
    
    
    

}
