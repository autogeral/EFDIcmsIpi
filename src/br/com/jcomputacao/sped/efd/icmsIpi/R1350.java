package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 11:59:45
 * @author Thiago Balthazar
 */
public class R1350 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "1350"
     */
    
    
    
    public static final String SERIE = "SERIE";
    /*
     * Número de Série da Bomba
     */
    
    
    
    public static final String FABRICANTE = "FABRICANTE";
    /*
     * Nome do Fabricante da Bomba
     */
    
    
    
    public static final String MODELO = "MODELO";
    /*
     * Modelo da Bomba
     */
    
    
    
    public static final String TIPO_MEDICAO = "TIPO_MEDICAO";
    /*
     * Identificador de medição:
        0 - analógico;
        1 ? digital
     */

    
    
    
    public R1350() {
        
        setName("REGISTRO 1350: BOMBAS");
        setDelimiter("|");
                
        addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("1350"));
        addFieldArchetype(SERIE,        new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(FABRICANTE,   new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(MODELO,       new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(TIPO_MEDICAO, new FieldStringMaximumLengthArchetype(1));
    }
    
    
    

}
