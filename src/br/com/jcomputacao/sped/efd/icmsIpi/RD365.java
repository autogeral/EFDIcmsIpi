package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 08/02/2013 08:50:02
 * @author Thiago Balthazar
 */
public class RD365 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "D365"
     */
    public static final String COD_TOT_PAR = "COD_TOT_PAR";
    /*
     * Código do totalizador, conforme Tabela 4.4.6
     */
    public static final String VLR_ACUM_TOT = "VLR_ACUM_TOT";
    /*
     * Valor acumulado no totalizador, relativo à respectiva Redução Z.
     */
    public static final String NR_TOT = "NR_TOT";
    /*
     * Número do totalizador quando ocorrer mais de uma situação com 
     * a mesma carga tributária efetiva.
     */
    public static final String DESCR_NR_TOT = "DESCR_NR_TOT";
    /*
     * Descrição da situação tributária relativa ao totalizador parcial, quando houver mais de um
       com a mesma carga tributária efetiva.
     */

    public RD365() {
    
        setName("REGISTRO D365: REGISTRO DOS TOTALIZADORES PARCIAIS DA REDUÇÃO Z (CODIGOS 2E, 13, 14, 15 e 16)");
        setDelimiter("|");
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
     
        FieldDecimalMaximumLengthArchetype decimal = new FieldDecimalMaximumLengthArchetype(15,2);
        decimal.setFormat(fw);
                
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("D365"));
        addFieldArchetype(COD_TOT_PAR, new FieldStringMaximumLengthArchetype(7));
        addFieldArchetype(VLR_ACUM_TOT, decimal);
        addFieldArchetype(NR_TOT, new FieldIntegerMaximumLengthArchetype(2));
        addFieldArchetype(DESCR_NR_TOT, new FieldStringMaximumLengthArchetype(255));
    }
            
    
}
