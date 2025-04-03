package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 18/02/2013 09:26:22
 * @author Thiago Balthazar
 */
public class RC174 extends LineArchetype{

public static final String REGISTRO = "REG";
/*
 * Texto fixo contendo "C174"
 */
public static final String IND_ARM = "IND_ARM";
/*
 * Indicador do tipo da arma de fogo:
    0- Uso permitido;
    1- Uso restrito
 */
public static final String NUM_ARM = "NUM_ARM";
/*
 * Numeração de série de fabricação da arma
 */
public static final String DESCR_COMPL = "DESCR_COMPL";
/*
 * Descrição da arma, compreendendo: número do cano, calibre, marca, 
 * capacidade de cartuchos,tipo de funcionamento, quantidade de canos,
 *comprimento, tipo de alma, quantidade e sentido das raias 
 * e demais elementos que permitam sua perfeita identificação
 */

    public RC174() {
        
        setName("REGISTRO C174: OPERACOES COM ARMAS DE FOGO (CODIGO 01)");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C174"));
        addFieldArchetype(IND_ARM, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(NUM_ARM, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(DESCR_COMPL, new FieldStringMaximumLengthArchetype(255));
          
    }



    

}
