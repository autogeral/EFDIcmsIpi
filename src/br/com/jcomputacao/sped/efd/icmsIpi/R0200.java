
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.FieldDecimalMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldDefaultArchetype;
import br.com.jcomputacao.aristoteles.field.FieldIntegerFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringFixedLengthArchetype;
import br.com.jcomputacao.aristoteles.field.FieldStringMaximumLengthArchetype;
import br.com.jcomputacao.aristoteles.line.LineArchetype;

/**
 * 30/01/2013 23:01:36
 * @author Murilo
 */
public class R0200 extends LineArchetype {

    public static final String REGISTRO     = "REG";
    public static final String COD_ITEM     = "COD_ITEM";
    public static final String DESCR_ITEM   = "DESCR_ITEM";
    public static final String COD_BARRA    = "COD_BARRA";
    public static final String COD_ANT_ITEM = "COD_ANT_ITEM";
    
    /**
     * Unidade informada anteriormente
     * @see br.com.jcomputacao.sped.efd.icmsIpi.R0190
     */
    public static final String UNID_INV     = "UNID_INV";
    /**
     * <ul>
     * <li>00 Mercadoria para Revenda</li>
     * <li>01 Materia-Prima</li>
     * <li>02 Embalagem</li>
     * <li>03 Produto em Processo</li>
     * <li>04 Produto Acabado</li>
     * <li>05 Subproduto</li>
     * <li>06 Produto Intermediario</li>
     * <li>07 Material de Uso e Consumo</li>
     * <li>08 Ativo Imobilizado</li>
     * <li>09 Servicos</li>
     * <li>10 Outros insumos</li>
     * <li>99 Outras</li>
     * </ul>
     */
    public static final String TIPO_ITEM    = "TIPO_ITEM";
    public static final String COD_NCM      = "COD_NCM";
    public static final String EX_IPI       = "EX_IPI";
    /**
     * Tabela 4.2.1
     * <ul>
     * <li>00 Servico</li>
     * <li>01 Animais vivos</li>
     * <li>02 Carnes e miudezas, comestiveis</li>
     * <li>03 Peixes e crustaceos, moluscos e os outros invertebrados aquaticos</li>
     * <li>04 Leite e laticinios; ovos de aves; mel natural; produtos comestiveis de origem animal, nao especificados nem compreendidos em outros Capitulos da TIPI</li>
     * <li>05 Outros produtos de origem animal, nao especificados nem compreendidos em outros Capitulos da TIPI</li>
06
Plantas vivas e produtos de floricultura
07
Produtos horticolas, plantas, raizes e tuberculos, comestiveis
08
Frutas; cascas de citricos e de meloes
09
Cafe, cha, mate e especiarias
10
Cereais
11
Produtos da industria de moagem; malte; amidos e feculas; inulina; gluten de trigo
12
Sementes e frutos oleaginosos; graos, sementes e frutos diversos; plantas industriais ou medicinais; palha e forragem
13
Gomas, resinas e outros sucos e extratos vegetais
14
Materias para entrancar e outros produtos de origem vegetal, nao especificadas nem compreendidas em outros Capitulos da NCM
15
Gorduras e oleos animais ou vegetais; produtos da sua dissociacao; gorduras alimentares elaboradas; ceras de origem animal ou vegetal
16
Preparacoes de carne, de peixes ou de crustaceos, de moluscos ou de outros invertebrados aquaticos
17
Acucares e produtos de confeitaria
18
Cacau e suas preparacoes
19
Preparacoes à base de cereais, farinhas, amidos, feculas ou de leite; produtos de pastelaria
20
Preparacoes de produtos horticolas, de frutas ou de outras partes de plantas
21
Preparacoes alimenticias diversas
22
Bebidas, liquidos alcoolicos e vinagres
23
Residuos e desperdicios das industrias alimentares; alimentos preparados para animais
24
Fumo (tabaco) e seus sucedâneos, manufaturados
25
Sal; enxofre; terras e pedras; gesso, cal e cimento
26
Minerios, escorias e cinzas
27
Combustiveis minerais, oleos minerais e produtos de sua destilacao; materias betuminosas; ceras minerais
28
Produtos quimicos inorgânicos; compostos inorgânicos ou orgânicos de metais preciosos, de elementos radioativos, de metais das terras raras ou de isotopos
29
Produtos quimicos orgânicos
30
Produtos farmacêuticos
31
Adubos ou fertilizantes
32
Extratos tanantes e tintoriais; taninos e seus derivados; pigmentos e outras materias corantes, tintas e vernizes, mastiques; tintas de escrever
33
Óleos essenciais e resinoides; produtos de perfumaria ou de toucador preparados e preparacoes cosmeticas
34
Saboes, agentes orgânicos de superficie, preparacoes para lavagem, preparacoes lubrificantes, ceras artificiais, ceras preparadas, produtos de conservacao e limpeza, velas e artigos semelhantes, massas ou pastas para modelar, "ceras para dentistas" e composicoes para dentistas à base de gesso
35
Materias albuminoides; produtos à base de amidos ou de feculas modificados; colas; enzimas
36
Polvoras e explosivos; artigos de pirotecnia; fosforos; ligas piroforicas; materias inflamaveis
37
Produtos para fotografia e cinematografia
38
Produtos diversos das industrias quimicas
39
Plasticos e suas obras
40
Borracha e suas obras
41
Peles, exceto a peleteria (peles com pêlo*), e couros
42
Obras de couro; artigos de correeiro ou de seleiro; artigos de viagem, bolsas e artefatos semelhantes; obras de tripa
43
Peleteria (peles com pelo*) e suas obras; peleteria (peles com pelo*) artificial
44
Madeira, carvao vegetal e obras de madeira
45
Cortica e suas obras
46
Obras de espartaria ou de cestaria
47
Pastas de madeira ou de outras materias fibrosas celulosicas; papel ou cartao de reciclar (desperdicios e aparas)
48
Papel e cartao; obras de pasta de celulose, de papel ou de cartao
49
Livros, jornais, gravuras e outros produtos das industrias graficas; textos manuscritos ou datilografados, planos e plantas
50
Seda
51
La e pelos finos ou grosseiros; fios e tecidos de crina
52
Algodao
53
Outras fibras têxteis vegetais; fios de papel e tecido de fios de papel
54
Filamentos sinteticos ou artificiais
55
Fibras sinteticas ou artificiais, descontinuas
56
Pastas ("ouates"), feltros e falsos tecidos; fios especiais; cordeis, cordas e cabos; artigos de cordoaria
57
Tapetes e outros revestimentos para pavimentos, de materias têxteis
58
Tecidos especiais; tecidos tufados; rendas; tapecarias; passamanarias; bordados
59
Tecidos impregnados, revestidos, recobertos ou estratificados; artigos para usos tecnicos de materias têxteis
60
Tecidos de malha
61
Vestuario e seus acessorios, de malha
62
Vestuario e seus acessorios, exceto de malha
63
Outros artefatos têxteis confeccionados; sortidos; artefatos de materias têxteis, calcados, chapeus e artefatos de uso semelhante, usados; trapos
64
Calcados, polainas e artefatos semelhantes, e suas partes
65
Chapeus e artefatos de uso semelhante, e suas partes
66
Guarda-chuvas, sombrinhas, guarda-sois, bengalas, bengalas-assentos, chicotes, e suas partes
67
Penas e penugem preparadas, e suas obras; flores artificiais; obras de cabelo
68
Obras de pedra, gesso, cimento, amianto, mica ou de materias semelhantes
69
Produtos cerâmicos
70
Vidro e suas obras
71
Perolas naturais ou cultivadas, pedras preciosas ou semipreciosas e semelhantes, metais preciosos, metais folheados ou chapeados de metais preciosos, e suas obras; bijuterias; moedas
72
Ferro fundido, ferro e aco
73
Obras de ferro fundido, ferro ou aco
74
Cobre e suas obras
75
Niquel e suas obras
76
Aluminio e suas obras
77
(Reservado para uma eventual utilizacao futura no SH)
78
Chumbo e suas obras
79
Zinco e suas obras
80
Estanho e suas obras
81
Outros metais comuns; ceramais ("cermets"); obras dessas materias
82
Ferramentas, artefatos de cutelaria e talheres, e suas partes, de metais comuns
83
Obras diversas de metais comuns
84
Reatores nucleares, caldeiras, maquinas, aparelhos e instrumentos mecânicos, e suas partes
85
Maquinas, aparelhos e materiais eletricos, e suas partes; aparelhos de gravacao ou de reproducao de som, aparelhos de gravacao ou de reproducao de imagens e de som em televisao, e suas partes e acessorios
86
Veiculos e material para vias ferreas ou semelhantes, e suas partes; aparelhos mecânicos (incluidos os eletromecânicos) de sinalizacao para vias de comunicacao
87
Veiculos automoveis, tratores, ciclos e outros veiculos terrestres, suas partes e acessorios
88
Aeronaves e aparelhos espaciais, e suas partes
89
Embarcacoes e estruturas flutuantes
90
Instrumentos e aparelhos de optica, fotografia ou cinematografia, medida, controle ou de precisao; instrumentos e aparelhos medico-cirurgicos; suas partes e acessorios
91
Aparelhos de relojoaria e suas partes
92
Instrumentos musicais, suas partes e acessorios
93
Armas e municoes; suas partes e acessorios
94
Moveis, mobiliario medico-cirurgico; colchoes; iluminacao e construcao pre-fabricadas
95
Brinquedos, jogos, artigos para divertimento ou para esporte; suas partes e acessorios
96
Obras diversas
97
Objetos de arte, de colecao e antiguidades
98
(Reservado para usos especiais pelas Partes Contratantes)
99
Operacoes especiais (utilizado exclusivamente pelo Brasil para classificar operacoes especiais na exportacao)
* </ul>

     */
    public static final String COD_GEN      = "COD_GEN";;
    public static final String ALIQ_ICMS    = "ALIQ_ICMS";
    
    public R0200() {
        setName("Registro 0200 - Identificacao dos itens");
        setDelimiter("|");
        addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("0200"));
        addFieldArchetype(COD_ITEM,     new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(DESCR_ITEM,   new FieldStringMaximumLengthArchetype(255));
        addFieldArchetype(COD_BARRA,    new FieldStringMaximumLengthArchetype(128));
        addFieldArchetype(COD_ANT_ITEM, new FieldStringMaximumLengthArchetype(60));
        addFieldArchetype(UNID_INV,     new FieldStringMaximumLengthArchetype(6));
        addFieldArchetype(TIPO_ITEM,    new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(COD_NCM,      new FieldStringFixedLengthArchetype(8));
        addFieldArchetype(EX_IPI,       new FieldStringMaximumLengthArchetype(3));
        addFieldArchetype(COD_GEN,      new FieldIntegerFixedLengthArchetype(2));
        addFieldArchetype(ALIQ_ICMS,    new FieldDecimalMaximumLengthArchetype(6, 2));
    }
}
