package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;
import javax.sound.sampled.spi.FormatConversionProvider;
/**
 * 04/02/2013 13:56:40
 * @author Thiago Balthazar
 */
public class RD110 extends LineArchetype{

    //1
    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D110"
    */
    
    //2
    public static final String NUM_ITEM = "NUM_ITEM";
    /*
     * Número sequencial do item no documento fiscal
     */
    
    //3
    public static final String COD_ITEM = "COD_ITEM";
    /*
     * Código do item (campo 02 do Registro 0200)
     */
    
    //4
    public static final String VL_SERV = "VL_SERV";
    /*
     * Valor do serviço
     */
    
    //5
    public static final String VL_OUT = "VL_OUT";
    /*
     * Outros valores
     */
    
    public RD110(){
    setName("REGISTRO D110: ITENS DO DOCUMENTO - NOTA FISCAL DE SERVICOS DETRANSPORTE (CODIGO 07)");
    setDelimiter("|");
    
    FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
    fw.setReplaceComa(false);
    
    addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D110"));
    addFieldArchetype(NUM_ITEM, new FieldIntegerMaximumLengthArchetype(3));
    addFieldArchetype(COD_ITEM, new FieldStringMaximumLengthArchetype(60));
    
    FieldDecimalMaximumLengthArchetype f4 = new FieldDecimalMaximumLengthArchetype(15,2);
    f4.setFormat(fw);    
    addFieldArchetype(VL_SERV, f4);
    
    FieldDecimalMaximumLengthArchetype f5 = new FieldDecimalMaximumLengthArchetype(15,2);
    f5.setFormat(fw);
    addFieldArchetype(VL_OUT, f5);
   
    }
    
}
