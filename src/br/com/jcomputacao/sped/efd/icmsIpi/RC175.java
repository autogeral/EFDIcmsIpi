package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;


/**
 * 18/02/2013 09:39:22
 * @author Thiago Balthazar
 */
public class RC175 extends LineArchetype{

    public static final String REGISTRO = "REG";
    /*
     * Texto fixo contendo "C175"
     */
    public static final String IND_VEIC_OPER = "IND_VEIC_OPER";
    /*
     * 0- Venda para concessionária;
        1- Faturamento direto;
        2- Venda direta;
        3- Venda da concessionária;
        9- Outros
     */
    public static final String CNPJ = "CNPJ";
    /*
     * CNPJ da Concessionária
     */
    public static final String UF = "UF";
    /*
     * Sigla da unidade da federação da Concessionária 
     */
    public static final String CHASSI_VEIC = "CHASSI_VEIC";
    /*
     * Chassi do veículo
     */

    public RC175() {
        
        setName("REGISTRO C175: OPERACOES COM VEICULOS NOVOS (CODIGO 01 e 55)");
        setDelimiter("|");
        
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("C175"));
        addFieldArchetype(IND_VEIC_OPER, new FieldStringFixedLengthArchetype(1));
        addFieldArchetype(CNPJ, new FieldIntegerFixedLengthArchetype(14));
        addFieldArchetype(UF, new FieldStringFixedLengthArchetype(2));
        addFieldArchetype(CHASSI_VEIC, new FieldStringMaximumLengthArchetype(17));
        
    }
    
    

}
