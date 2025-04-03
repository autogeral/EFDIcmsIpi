package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 11/02/2013 14:08:18
 *
 * @author Vinicius Diana
 */
public class R1010 extends LineArchetype {
    /**
     * 1 -  Texto fixo contendo "1010"
     */
    public static final String REGISTRO = "REGISTRO";

    /**
     * 2 -  Reg. 1100 - Ocorreu averbaÃ§Ã£o (conclusÃ£o) de exportaÃ§Ã£o no perÃ­odo: S ?  Sim N -  NÃ£o
     */
    public static final String IND_EXP = " IND_EXP";

    /**
     * 3 -   Reg 1200 ? Existem informaÃ§Ãµes acerca de crÃ©ditos de ICMS a serem controlados, definidos pela Sefaz: S ?  Sim N -  NÃ£o
     */
    public static final String IND_CCRF = "IND_CCRF";

    /**
     * 4 -   Reg. 1300 ? Ã© comercio varejista de combustÃ­veis com movimentaÃ§Ã£o e/ou estoque no perÃ­odo: S ?  Sim N -  NÃ£o
     */
    public static final String IND_COMB = " IND_COMB";

    /**
     * 5 -  Reg. 1390 ? Usinas de aÃ§Ãºcar e/Ã¡lcool ? O estabelecimento Ã© produtor de aÃ§Ãºcar e/ou Ã¡lcool carburante com movimentaÃ§Ã£o e/ou estoque no perÃ­odo:: S ? Sim N -  NÃ£o
     */
    public static final String IND_USINA = "IND_USINA";

    /**
     * 6 -  Reg 1400 ? Sendo o registro obrigatï¿½rio em sua Unidade de FederaÃ§Ã£o, existem informaÃ§Ãµes a serem prestadas neste registro: S ? Sim; N -  NÃ£o
     */
    public static final String IND_VA = "IND_VA";

    /**
     * 7 -  Reg 1500 - A empresa Ã© distribuidora de energia e ocorreu fornecimento de energia elÃ©trica para consumidores de outra UF: S ? Sim; N -  NÃ£o
     */
    public static final String IND_EE = " IND_EE";

    /**
     * 8 - Reg 1600 - Realizou vendas com CartÃ£o de CrÃ©dito ou de dÃ©bito:
     */
    public static final String IND_CART = " IND_CART ";

    /**
     * 9 -  Reg. 1700 ? Foram emitidos documentos fiscais em papel no perÃ­odo  em unidade da federaÃ§Ã£o que exija o controle de utilizaÃ§Ã£o de documentos fiscais: S ? Sim N - NÃ£o
     */
    public static final String IND_FORM = " IND_FORM ";
    
    /**
     * 10 - Reg 1800 ? A empresa prestou serviÃ§os de transporte aÃ©reo de cargas e de passageiros: S ?  Sim N -  NÃ£o
     */
    public static final String IND_AER = " IND_AER";

    public R1010() {
        setName("Registro R1010 - Obrigatoriedade de Registros do bloco1");
        setDelimiter("|");
        //1
        addFieldArchetype(REGISTRO, new FieldDefaultArchetype("1010"));
        //2
        addFieldArchetype(IND_EXP, new FieldStringFixedLengthArchetype(1));
        //3
        addFieldArchetype(IND_CCRF, new FieldStringFixedLengthArchetype(1));
        //4
        addFieldArchetype(IND_COMB, new FieldStringFixedLengthArchetype(1));
        //5
        addFieldArchetype(IND_USINA, new FieldStringFixedLengthArchetype(1));
        //6
        addFieldArchetype(IND_VA, new FieldStringFixedLengthArchetype(1));
        //7
        addFieldArchetype(IND_EE, new FieldStringFixedLengthArchetype(1));
        //8
        addFieldArchetype(IND_CART, new FieldStringFixedLengthArchetype(1));
        //9
        addFieldArchetype(IND_FORM, new FieldStringFixedLengthArchetype(1));
        //10
        addFieldArchetype(IND_AER, new FieldStringFixedLengthArchetype(1));
    }
}
