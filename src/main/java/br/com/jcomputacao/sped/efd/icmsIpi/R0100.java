
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 28/01/2013 13:33:37
 * @author Murilo
 */
public class R0100 extends LineArchetype {
    
     public static final String REGISTRO = "REG";
     public static final String NOME     = "NOME";
     public static final String CPF      = "CPF";
     public static final String CRC      = "CRC";
     public static final String CNPJ     = "CNPJ";
     public static final String CEP      = "CEP";
     public static final String END      = "END";
     public static final String END_NUM  = "NUM";
     public static final String END_COMP = "COMPL";
     public static final String BAIRRO   = "BAIRRO";
     public static final String FONE     = "FONE";
     public static final String FAX      = "FAX";
     public static final String EMAIL    = "EMAIL";
     /**
      * Codigo do municipio, conforme tabela IBGE.
      */
     public static final String CODIGO_MUNICIPIO = "COD_MUN";

     
     public R0100() {
        setName("Registro 0100 - Dados contabilista");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0100"));
        addFieldArchetype(NOME, new FieldStringMaximumLengthArchetype(100));
        addFieldArchetype(CPF, new FieldStringFixedLengthArchetype(11));
        addFieldArchetype(CRC, new FieldStringMaximumLengthArchetype(15));
        FieldArchetype fa = new FieldIntegerFixedLengthArchetype(14);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(CNPJ, fa);
        addFieldArchetype(CEP,      new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(END,      new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(END_NUM,  new FieldIntegerMaximumLengthArchetype(6));
        fa = new FieldStringMaximumLengthArchetype(255);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        //fa.setFullFillingNullable(false);
        addFieldArchetype(END_COMP, fa);
        addFieldArchetype(BAIRRO,   new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(FONE,     new FieldStringMaximumLengthArchetype(10));
        addFieldArchetype(FAX,      new FieldStringMaximumLengthArchetype(11));
        addFieldArchetype(EMAIL,    new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(CODIGO_MUNICIPIO, new FieldIntegerFixedLengthArchetype(7));

     }

}
