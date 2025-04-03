
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 28/01/2013 13:33:03
 * @author Murilo
 */
public class R0005  extends LineArchetype {
    
     public static final String REGISTRO = "REG";
     public static final String FATANSIA = "FATANSIA";
     public static final String CEP = "CEP";
     public static final String END = "END";
     public static final String END_NUM = "NUM";
     public static final String END_COMP = "COMPL";
     public static final String BAIRRO = "BAIRRO";
     public static final String FONE = "FONE";
     public static final String FAX = "FAX";
     public static final String EMAIL = "EMAIL";
     
     public R0005() {
        setName("Registro 0005 - Dados complementares (Obrigatorio)");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0005"));
        addFieldArchetype(FATANSIA, new FieldStringMaximumLengthArchetype(100));
        addFieldArchetype(CEP,      new FieldIntegerFixedLengthArchetype(8));
        addFieldArchetype(END,      new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(END_NUM,  new FieldIntegerMaximumLengthArchetype(6));
        FieldStringMaximumLengthArchetype fa = new FieldStringMaximumLengthArchetype(255);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        //fa.setFullFillingNullable(false);
        addFieldArchetype(END_COMP, fa);
        addFieldArchetype(BAIRRO,   new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(FONE,     new FieldStringMaximumLengthArchetype(10));
        fa = new FieldStringMaximumLengthArchetype(11);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(FAX,      fa);
        fa = new FieldStringMaximumLengthArchetype(255);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(EMAIL,    fa);
     }

}
