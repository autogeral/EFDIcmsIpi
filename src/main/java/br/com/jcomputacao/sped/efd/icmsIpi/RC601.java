package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 14:29:48
 * @author Vinicius Diana
 */

public class RC601 extends LineArchetype {
/*
 * 1 -  Texto fixo contendo "C601" 
 */
public static final String REGISTRO = "REGISTRO";







/*
 * 2 - Número de documento fiscal cancelado 
 */
public static final String NUM_DOC_CANC = "NUM_DOC_CANC";







    public RC601() {
        setName("REGISTRO C601: DOCUMENTOS CANCELADOS - CONSOLIDACAO DIARIA DE NOTAS FISCAIS/CONTAS DE ENERGIA ELETRICA (CODIGO 06), NOTA FISCAL/CONTA DE FORNECIMENTO D'AGUA CANALIZADA (CODIGO 29) E NOTA FISCAL/CONTA DE FORNECIMENTO DE GAS (CODIGO 28) ");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C601"));
        //2
        addFieldArchetype(NUM_DOC_CANC, new FieldIntegerMaximumLengthArchetype(9));
}
}

