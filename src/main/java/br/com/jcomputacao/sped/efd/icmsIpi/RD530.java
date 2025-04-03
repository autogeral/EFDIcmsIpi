package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;



/**
 * 11/02/2013 10:49:17
 * @author Thiago Balthazar
 */
public class RD530 extends LineArchetype{

        public static final String REGISTRO = "REG"; 
        public static final String IND_SERV = "IND_SERV";
        public static final String DT_INI_SERV = "DT_INI_SERV";
        public static final String DT_FIN_SERV = "DT_FIN_SERV";
        public static final String PER_FISCAL = "PER_FISCAL";
        public static final String COD_AREA = "COD_AREA";
        public static final String TERMINAL = "TERMINAL";

    public RD530() {
        
        setName("REGISTRO D530: TERMINAL FATURADO");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D530"));
        addFieldArchetype(IND_SERV, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(DT_INI_SERV, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(DT_FIN_SERV, new FieldDateFixedLengthArchetype("ddMMyyyy"));
        addFieldArchetype(PER_FISCAL, new FieldDateFixedLengthArchetype("MMyyyy"));
        addFieldArchetype(COD_AREA, new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(TERMINAL, new FieldIntegerMaximumLengthArchetype(30));
        
    }
        

    
}
