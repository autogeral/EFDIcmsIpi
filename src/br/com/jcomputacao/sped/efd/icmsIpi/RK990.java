package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 04/05/2017 13:44:25
 * @author Alexandre Scavacini
 */
public class RK990 extends LineArchetype {
/*
 * 1 -  Texto fixo contendo "K990"
 */
    public static final String REGISTRO = "REGISTRO";
    
    /*
     * 2 - QUANTIDADE TOTAL DE LINHAS DO BLOCO K
     */
    public static final String  QTD_LIN_K  = " QTD_LIN_K ";

    public RK990() {
        setName("Registro K990 - Encerramento do bloco k");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("K990"));
        //2
        addFieldArchetype(QTD_LIN_K, new FieldIntegerMaximumLengthArchetype(9));
    }
    
    
}
