package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 *
 * @author Douglas
 */
public class R0208 extends LineArchetype {
    
    public static final String REGISTRO = "REG";
    /**
     * Codigo indicador da Tabela de Incidencia, conforme Anexo III 
     * do decreto n° 6.707/08:
     * 01 - Tabela I
     * 02 - Tabela II
     * 03 - Tabela III
     * 04 - Tabela IV
     * 05 - Tabela V
     * 06 - Tabela VI
     * 07 - Tabela VII
     * 08 - Tabela VIII
     * 09 - Tabela IX
     * 10 - Tabela X
     * 11 - Tabela XI
     * 12 - Tabela XII
     */
    public static final String COD_TAB = "COD_TAB";
    /**
     * Codigo do grupo, conforme Anexo III do Decreto n°6.707/08.
     */
    public static final String COD_GRU = "COD_GRU";
    /**
     * Marca Comercial
     */
    public static final String MARCA_COM = "MARCA_COM";
    
    public R0208() {
        setName("Registro 0208 - Codigo de grupos por marca comercial - Refri(Bebidas Frias)");
        setDelimiter("|");
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("0208"));
        addFieldArchetype(COD_TAB, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(COD_GRU, new FieldStringMaximumLengthArchetype(2));
        addFieldArchetype(MARCA_COM, new FieldStringMaximumLengthArchetype(60));
    }    
}
