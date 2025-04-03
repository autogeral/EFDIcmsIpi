package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDateFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 16:46:56
 * @author Thiago Balthazar
 */
public class RC116 extends LineArchetype{

        public static final String REGISTRO = "REG";
        /*
        * Texto fixo contendo "C116"
        */



        public static final String COD_MOD = "COD_MOD";
        /*
        * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
        */




        public static final String NR_SAT = "NR_SAT";
        /*
        * Número de Série do equipamento SAT
        */




        public static final String CHV_CFE = "CHV_CFE";
        /*
        * Chave do Cupom Fiscal Eletrônico
        */




        public static final String NUM_CFE = "NUM_CFE";
        /*
        * Número do cupom fiscal eletrônico
        */




        public static final String DT_DOC = "DT_DOC";
        /*
         * Data da emissão do documento fiscal
         */

    
        
    public RC116() {
    
        setName("REGISTRO C116: CUPOM FISCAL ELETRONICO REFERENCIADO");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO,new FieldDefaultArchetype("C116"));
        addFieldArchetype(COD_MOD, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(NR_SAT,  new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(CHV_CFE, new FieldStringMaximumLengthArchetype(44));
        addFieldArchetype(NUM_CFE, new FieldIntegerMaximumLengthArchetype(6));
        addFieldArchetype(DT_DOC,  new FieldDateFixedLengthArchetype("ddMMyyyy"));
    }
        
}
