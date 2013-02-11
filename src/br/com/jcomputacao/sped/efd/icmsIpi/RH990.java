package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 13:44:25
 * @author Vinicius Diana
 */
public class RH990 extends LineArchetype {
/*
 * 1 -  Texto fixo contendo "H990"
 */
    public static final String REGISTRO = "REGISTRO";
    
    /*
     * 2 - QUANTIDADE TITAL DE LINHAS DO BLOCO H
     */
    public static final String  QTD_LIN_H  = " QTD_LIN_H ";

    public RH990() {
        setName("Registro H990 - Encerramento do bloco h");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("H990"));
        //2
        addFieldArchetype(QTD_LIN_H, new FieldIntegerMaximumLengthArchetype(9));
    }
    
    
}
