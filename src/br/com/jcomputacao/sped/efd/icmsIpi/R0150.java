package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 30/01/2013 21:09:05
 *
 * @author Murilo
 */
public class R0150 extends LineArchetype {

    public static final String REGISTRO = "REG";
    public static final String COD_PART = "COD_PART";
    public static final String NOME = "NOME";
    public static final String COD_PAIS = "COD_PAIS";
    public static final String CNPJ = "CNPJ";
    public static final String CPF = "CPF";
    public static final String IE = "IE";
    /**
      * Codigo do municipio, conforme tabela IBGE.
      */
    public static final String COD_MUN = "COD_MUN";
    public static final String SUFRAMA = "SUFRAMA";
    public static final String END = "END";
    public static final String END_NUM = "NUM";
    public static final String END_COMP = "COMPL";
    public static final String BAIRRO = "BAIRRO";
    
    public R0150() {
        setName("Registro 0150 - Dados participante");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0150"));
        addFieldArchetype(COD_PART, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(NOME, new FieldStringMaximumLengthArchetype(100));
        addFieldArchetype(COD_PAIS, new FieldStringMaximumLengthArchetype(100));
        FieldArchetype fa = new FieldIntegerFixedLengthArchetype(14);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(CNPJ, fa);
        
        fa = new FieldIntegerFixedLengthArchetype(11);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(CPF, fa);
        
        fa = new FieldStringMaximumLengthArchetype(14);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(IE, fa);
        
        fa = new FieldIntegerFixedLengthArchetype(7);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(COD_MUN, fa);
        
        fa = new FieldStringFixedLengthArchetype(9);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        addFieldArchetype(SUFRAMA, fa);
        
        addFieldArchetype(END,      new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(END_NUM,  new FieldIntegerMaximumLengthArchetype(6));
        fa = new FieldStringMaximumLengthArchetype(255);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        //fa.setFullFillingNullable(false);
        addFieldArchetype(END_COMP, fa);
        addFieldArchetype(BAIRRO,   new FieldStringMaximumLengthArchetype(255));
    }
}
