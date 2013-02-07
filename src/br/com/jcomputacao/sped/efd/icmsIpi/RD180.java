package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;

/**
 * 06/02/2013 10:52:20
 * @author Thiago Balthazar
 */
public class RD180 extends LineArchetype{

        public static final String REGISTRO = "REG";
        /*
         * Texto fixo contendo "D180"
         */
        public static final String NUM_SEQ = "NUM_SEQ";
        /*
         * Número de ordem sequencial do modal
         */
        public static final String IND_EMIT = "IND_EMIT";
        /*
         * Indicador do emitente do documento fiscal:
            0- Emissão própria;
            1- Terceiros
         */
        public static final String CNPJ_CPF_EMIT = "CNPJ_CPF_EMIT";
        /*
         * CNPJ ou CPF do participante emitente do modal
         */
        public static final String UF_EMIT = "UF_EMIT";
        /*
         * Sigla da unidade da federação do participante
           emitente do modal
         */
        public static final String IE_EMIT = "IE_EMIT";
        /*
         * Inscrição Estadual do participante emitente do modal
         */
        public static final String COD_MUN_ORIG = "COD_MUN_ORIG";
        /*
         * Código do município de origem do serviço,conforme a tabela IBGE
         * (Preencher com 9999999,se Exterior)
         */
        public static final String CNPJ_CPF_TOM = "CNPJ_CPF_TOM";
        /*
         * CNPJ/CPF do participante tomador do serviço
         */
        public static final String UF_TOM = "UF_TOM";
        /*
         * Sigla da unidade da federação do participante tomador do serviço
         */
        public static final String IE_TOM = "IE_TOM";
        /*
         * Inscrição Estadual do participante tomador do serviço
         */
        public static final String COD_MUN_DEST = "COD_MUN_DEST";
        /*
         * Código do município de destino, conforme a tabela IBGE
         * (Preencher com 9999999, se Exterior)
         */
        public static final String COD_MOD = "COD_MOD";
        /*
         * Código do modelo do documento fiscal, conforme a Tabela 4.1.1
         */
        public static final String SER = "SER";
        /*
         * Série do documento fiscal
         */
        public static final String SUB = "SUB";
        /*
         *Subsérie do documento fiscal 
         */
        public static final String NUM_DOC = "NUM_DOC" ;
        /*
         * Número do documento fiscal
         */
        public static final String DT_DOC = "DT_DOC";
        /*
         * Data da emissão do documento fiscal
         */
        public static final String VL_DOC = "VL_DOC";
        /*
         * Valor total do documento fiscal
         */

    public RD180() {
        
        setName("REGISTRO D180: MODAIS (CODIGO 26)");
        setDelimiter("|");
        
        FormatWrapper fw =  FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);        
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D180"));
        addFieldArchetype(NUM_SEQ, new FieldIntegerMaximumLengthArchetype(15));
        addFieldArchetype(IND_EMIT, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CNPJ_CPF_EMIT, new FieldIntegerMaximumLengthArchetype(14));
        addFieldArchetype(UF_EMIT, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(IE_EMIT, new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(COD_MUN_ORIG, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(CNPJ_CPF_TOM, new FieldIntegerMaximumLengthArchetype(14));
        addFieldArchetype(UF_TOM, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(IE_TOM, new FieldStringMaximumLengthArchetype(14));
        addFieldArchetype(COD_MUN_DEST, new FieldIntegerFixedLengthArchetype(7));
        addFieldArchetype(COD_MOD, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(SER, new FieldStringMaximumLengthArchetype(4));
        addFieldArchetype(SUB, new FieldIntegerMaximumLengthArchetype(3));
        addFieldArchetype(NUM_DOC, new FieldIntegerMaximumLengthArchetype(9));
        addFieldArchetype(DT_DOC, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(VL_DOC, decimal);
             
    }
        
        
}
