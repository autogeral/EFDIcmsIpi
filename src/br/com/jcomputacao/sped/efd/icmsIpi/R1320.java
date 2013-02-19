package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 19/02/2013 11:40:33
 * @author Thiago Balthazar
 */
public class R1320 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "1320"
     */
    
    
    
    public static final String NUM_BICO = "NUM_BICO";
    /*
     * Bico Ligado à Bomba
     */
    
    
    
    public static final String NR_INTERV = "NR_INTERV";
    /*
     * Número da intervenção
     */
    
    
    
    public static final String MOT_INTERV = "MOT_INTERV";
    /*
     * Motivo da Intervenção
     */
    
    
    
    public static final String NOM_INTERV = "NOM_INTERV";
    /*
     * Nome do Interventor
     */
    
    
    
    public static final String CNPJ_INTERV = "CNPJ_INTERV";
    /*
     * CNPJ da empresa responsável pela intervenção
     */
    
    
    
    public static final String CPF_INTERV = "CPF_INTERV";
    /*
     * CPF do técnico responsável pela intervenção
     */
    
    
    
    public static final String VAL_FECHA = "VAL_FECHA";
    /*
     * Valor da leitura final do contador, no fechamento do bico
     */
    
    
    
    public static final String VAL_ABERT = "VAL_ABERT";
    /*
     * Valor da leitura inicial do contador, na abertura do bico.
     */
    
    
    
    public static final String VOL_AFERI = "VOL_AFERI";
    /*
     * Aferições da Bomba, em litros
     */
    
    
    
    public static final String VOL_VENDAS = "VOL_VENDAS";
    /*
     * Vendas (08 ? 09 - 10 ) do bico , em litros
     */

    
    
    
    public R1320() {
    
        setName("REGISTRO 1320: VOLUME DE VENDAS");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getDecimalFormatWithPrecision(3);
        fw.setReplaceComa(false);

        FieldDecimalMaximumLengthArchetype d = new FieldDecimalMaximumLengthArchetype(15,3);
        d.setFormat(fw);
        
        addFieldArchetype(REGISTRO,    new FieldDefaultArchetype("1320"));
        addFieldArchetype(NUM_BICO,    new FieldIntegerMaximumLengthArchetype(30));
        addFieldArchetype(NR_INTERV,   new FieldIntegerMaximumLengthArchetype(30));
        addFieldArchetype(MOT_INTERV,  new FieldStringMaximumLengthArchetype(50));
        addFieldArchetype(NOM_INTERV,  new FieldStringMaximumLengthArchetype(30));
        addFieldArchetype(CNPJ_INTERV, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(CPF_INTERV,  new FieldIntegerFixedLengthArchetype(11));
        addFieldArchetype(VAL_FECHA,   d);
        addFieldArchetype(VAL_FECHA,   d);
        addFieldArchetype(VOL_AFERI,   d);
        addFieldArchetype(VOL_VENDAS,  d);
    }
    
    
    
    
    

}
