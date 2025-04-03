package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 19/02/2013 15:12:32
 * @author Vinicius Diana
 */
public class R1600 extends LineArchetype {
/*
 * 1 - Texto fixo contendo "1600"
 */
  public static final String REGISTRO = "REGISTRO";
  
  
  
  /*
 * 2 -  Código do participante (campo 02 do Registro 0150): identificação da administradora do cartão de débito/crédito

 */
  public static final String COD_PART = "COD_PART";
  
  
  
  
  
  /*
 * 3 -  Valor total das operações realizadas no período referente a Cartão de Crédito 
 */
  public static final String TOT_CREDITO = "TOT_CREDITO";
  
  
  
  
  /*
 * 4 - Valor total das operações realizadas no período referente a Cartão de Débito

 */
  public static final String TOT_DEBITO = "TOT_DEBITO";
  
  
  
  

    public R1600() {
        setName("REGISTRO 1600: TOTAL DAS OPERACOES COM CARTÃO DE CREDITO E/OU DEBITO");
        setDelimiter("|");
         FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1600"));
        //2
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        //3
       FieldDecimalMaximumLengthArchetype f1 = new FieldDecimalMaximumLengthArchetype(15,2);
        f1.setFormat(fw);
        addFieldArchetype(TOT_CREDITO, f1);
        //4
         FieldDecimalMaximumLengthArchetype f2 = new FieldDecimalMaximumLengthArchetype(15,2);
        f2.setFormat(fw);
        addFieldArchetype(TOT_DEBITO, f2);
        
    }
  
  
  
  
  
    
    
}
