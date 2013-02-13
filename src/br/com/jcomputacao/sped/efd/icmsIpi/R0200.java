
package br.com.jcomputacao.sped.efd.icmsIpi;

import br.com.jcomputacao.aristoteles.field.*;
import br.com.jcomputacao.aristoteles.format.FormatFactory;
import br.com.jcomputacao.aristoteles.format.FormatType;
import br.com.jcomputacao.aristoteles.format.FormatWrapper;
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
     * <li>06 Plantas vivas e produtos de floricultura</li>
     * <li>07 Produtos horticolas, plantas, raizes e tuberculos, comestiveis</li>
     * <li>08 Frutas; cascas de citricos e de meloes</li>
     * <li>09 Cafe, cha, mate e especiarias</li>
     * <li>10 Cereais</li>
     * <li>11 Produtos da industria de moagem; malte; amidos e feculas; inulina; gluten de trigo</li>
     * <li>12 Sementes e frutos oleaginosos; graos, sementes e frutos diversos; plantas industriais ou medicinais; palha e forragem</li>
     * <li>
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
    public static final String COD_GEN      = "COD_GEN";
    /**
     * <p ALIGN="CENTER">&nbsp;<font face="Arial" size="2"><a name="anexo"></a>Lista de serviços anexa à Lei
Complementar nº 116, de 31 de julho de 2003.</p>
</b>

<p>1 &#150; Serviços de informática e congêneres.</p>

<p>1.01 &#150; Análise e desenvolvimento de sistemas.</p>

<p>1.02 &#150; Programação.</p>

<p>1.03 &#150; Processamento de dados e congêneres.</p>

<p>1.04 &#150; Elaboração de programas de computadores, inclusive de jogos eletrônicos.</p>

<p>1.05 &#150; Licenciamento ou cessão de direito de uso de programas de computação.</p>

<p>1.06 &#150; Assessoria e consultoria em informática.</p>

<p>1.07 &#150; Suporte técnico em informática, inclusive instalação, configuração e
manutenção de programas de computação e bancos de dados.</p>

<p>1.08 &#150; Planejamento, confecção, manutenção e atualização de páginas
eletrônicas.</p>

<p>2 &#150; Serviços de pesquisas e desenvolvimento de qualquer natureza.</p>

<p>2.01 &#150; Serviços de pesquisas e desenvolvimento de qualquer natureza.</p>

<p>3 &#150; Serviços prestados mediante locação, cessão de direito de uso e congêneres.</p>

<p>3.01 &#150; (<a href="../Mensagem_Veto/2003/Mv362-03.htm">VETADO</a>)</p>

<p>3.02 &#150; Cessão de direito de uso de marcas e de sinais de propaganda.</p>

<p>3.03 &#150; Exploração de salões de festas, centro de convenções, escritórios
virtuais, <b>stands</b><i>, </i>quadras esportivas, estádios, ginásios, auditórios,
casas de espetáculos, parques de diversões, canchas e congêneres, para realização de
eventos ou negócios de qualquer natureza.</p>

<p>3.04 &#150; Locação, sublocação, arrendamento, direito de passagem ou permissão de
uso, compartilhado ou não, de ferrovia, rodovia, postes, cabos, dutos e condutos de
qualquer natureza.</p>

<p>3.05 &#150; Cessão de andaimes, palcos, coberturas e outras estruturas de uso
temporário.</p>

<p>4 &#150; Serviços de saúde, assistência médica e congêneres.</p>

<p>4.01 &#150; Medicina e biomedicina.</p>

<p>4.02 &#150; Análises clínicas, patologia, eletricidade médica, radioterapia,
quimioterapia, ultra-sonografia, ressonância magnética, radiologia, tomografia e
congêneres.</p>

<p>4.03 &#150; Hospitais, clínicas, laboratórios, sanatórios, manicômios, casas de
saúde, prontos-socorros, ambulatórios e
congêneres.</p>

<p>4.04 &#150; Instrumentação cirúrgica.</p>

<p>4.05 &#150; Acupuntura.</p>

<p>4.06 &#150; Enfermagem, inclusive serviços auxiliares.</p>

<p>4.07 &#150; Serviços farmacêuticos.</p>

<p>4.08 &#150; Terapia ocupacional, fisioterapia e fonoaudiologia.</p>

<p>4.09 &#150; Terapias de qualquer espécie destinadas ao tratamento físico, orgânico e
mental.</p>

<p>4.10 &#150; Nutrição.</p>

<p>4.11 &#150; Obstetrícia.</p>

<p>4.12 &#150; Odontologia.</p>

<p>4.13 &#150; Ortóptica.</p>

<p>4.14 &#150; Próteses sob encomenda.</p>

<p>4.15 &#150; Psicanálise.</p>

<p>4.16 &#150; Psicologia.</p>

<p>4.17 &#150; Casas de repouso e de recuperação, creches, asilos e congêneres.</p>

<p>4.18 &#150; Inseminação artificial, fertilização <b>in vitro</b><i> </i>e congêneres.</p>

<p>4.19 &#150; Bancos de sangue, leite, pele, olhos, óvulos, sêmen e congêneres.</p>

<p>4.20 &#150; Coleta de sangue, leite, tecidos, sêmen, órgãos e materiais biológicos de
qualquer espécie.</p>

<p>4.21 &#150; Unidade de atendimento, assistência ou tratamento móvel e congêneres.</p>

<p>4.22 &#150; Planos de medicina de grupo ou individual e convênios para prestação de
assistência médica, hospitalar, odontológica e congêneres.</p>

<p>4.23 &#150; Outros planos de saúde que se cumpram através de serviços de terceiros
contratados, credenciados, cooperados ou apenas pagos pelo operador do plano mediante
indicação do beneficiário.</p>

<p>5 &#150; Serviços de medicina e assistência veterinária e congêneres.</p>

<p>5.01 &#150; Medicina veterinária e zootecnia.</p>

<p>5.02 &#150; Hospitais, clínicas, ambulatórios, prontos-socorros e congêneres, na área
veterinária.</p>

<p>5.03 &#150; Laboratórios de análise na área veterinária.</p>

<p>5.04 &#150; Inseminação artificial, fertilização <b>in vitro</b> e congêneres.</p>

<p>5.05 &#150; Bancos de sangue e de órgãos e congêneres.</p>

<p>5.06 &#150; Coleta de sangue, leite, tecidos, sêmen, órgãos e materiais biológicos de
qualquer espécie.</p>

<p>5.07 &#150; Unidade de atendimento, assistência ou tratamento móvel e congêneres.</p>

<p>5.08 &#150; Guarda, tratamento, amestramento, embelezamento, alojamento e congêneres.</p>

<p>5.09 &#150; Planos de atendimento e assistência médico-veterinária.</p>

<p>6 &#150; Serviços de cuidados pessoais, estética, atividades físicas e congêneres.</p>

<p>6.01 &#150; Barbearia, cabeleireiros, manicuros, pedicuros e congêneres.</p>

<p>6.02 &#150; Esteticistas, tratamento de pele, depilação e congêneres.</p>

<p>6.03 &#150; Banhos, duchas, sauna, massagens e congêneres.</p>

<p>6.04 &#150; Ginástica, dança, esportes, natação, artes marciais e demais atividades
físicas.</p>

<p>6.05 &#150; Centros de emagrecimento, <b>spa </b>e congêneres.</p>

<p>7 &#150; Serviços relativos a engenharia, arquitetura, geologia, urbanismo, construção
civil, manutenção, limpeza, meio ambiente, saneamento e congêneres.</p>

<p>7.01 &#150; Engenharia, agronomia, agrimensura, arquitetura, geologia, urbanismo,
paisagismo e congêneres.</p>

<p>7.02 &#150; Execução, por administração, empreitada ou subempreitada, de obras de
construção civil, hidráulica ou elétrica e de outras obras semelhantes, inclusive
sondagem, perfuração de poços, escavação, drenagem e irrigação, terraplanagem,
pavimentação, concretagem e a instalação e montagem de produtos, peças e equipamentos
(exceto o fornecimento de mercadorias produzidas pelo prestador de serviços fora do local
da prestação dos serviços, que fica sujeito ao ICMS).</p>

<p>7.03 &#150; Elaboração de planos diretores, estudos de viabilidade, estudos
organizacionais e outros, relacionados com obras e serviços de engenharia; elaboração
de anteprojetos, projetos básicos e projetos executivos para trabalhos de engenharia.</p>

<p>7.04 &#150; Demolição.</p>

<p>7.05 &#150; Reparação, conservação e reforma de edifícios, estradas, pontes, portos e
congêneres (exceto o fornecimento de mercadorias produzidas pelo prestador dos serviços,
fora do local da prestação dos serviços, que fica sujeito ao ICMS).</p>

<p>7.06 &#150; Colocação e instalação de tapetes, carpetes, assoalhos, cortinas,
revestimentos de parede, vidros, divisórias, placas de gesso e congêneres, com material
fornecido pelo tomador do serviço.</p>

<p>7.07 &#150; Recuperação, raspagem, polimento e lustração de pisos e congêneres.</p>

<p>7.08 &#150; Calafetação.</p>

<p>7.09 &#150; Varrição, coleta, remoção, incineração, tratamento, reciclagem,
separação e destinação final de lixo, rejeitos e outros resíduos quaisquer.</p>

<p>7.10 &#150; Limpeza, manutenção e conservação de vias e logradouros públicos,
imóveis, chaminés, piscinas, parques, jardins e congêneres.</p>

<p>7.11 &#150; Decoração e jardinagem, inclusive corte e poda de árvores.</p>

<p>7.12 &#150; Controle e tratamento de efluentes de qualquer natureza e de agentes físicos,
químicos e biológicos.</p>

<p>7.13 &#150; Dedetização, desinfecção, desinsetização, imunização, higienização,
desratização, pulverização e congêneres.</p>

<p>7.14 &#150; (<a href="../Mensagem_Veto/2003/Mv362-03.htm">VETADO</a>)</p>

<p>7.15 &#150; (<a href="../Mensagem_Veto/2003/Mv362-03.htm">VETADO</a>)</p>

<p>7.16 &#150; Florestamento, reflorestamento, semeadura, adubação e congêneres.</p>

<p>7.17 &#150; Escoramento, contenção de encostas e serviços congêneres.</p>

<p>7.18 &#150; Limpeza e dragagem de rios, portos, canais, baías, lagos, lagoas, represas,
açudes e congêneres.</p>

<p>7.19 &#150; Acompanhamento e fiscalização da execução de obras de engenharia,
arquitetura e urbanismo.</p>

<p>7.20 &#150; Aerofotogrametria (inclusive interpretação), cartografia, mapeamento,
levantamentos topográficos, batimétricos, geográficos, geodésicos, geológicos,
geofísicos e congêneres.</p>

<p>7.21 &#150; Pesquisa, perfuração, cimentação, mergulho, perfilagem, concretação,
testemunhagem, pescaria, estimulação e outros serviços relacionados com a exploração
e explotação de petróleo, gás natural e de outros recursos minerais.</p>

<p>7.22 &#150; Nucleação e bombardeamento de nuvens e congêneres.</p>

<p>8 &#150; Serviços de educação, ensino, orientação pedagógica e educacional,
instrução, treinamento e avaliação pessoal de qualquer grau ou natureza.</p>

<p>8.01 &#150; Ensino regular pré-escolar, fundamental, médio e superior.</p>

<p>8.02 &#150; Instrução, treinamento, orientação pedagógica e educacional, avaliação
de conhecimentos de qualquer natureza.</p>

<p>9 &#150; Serviços relativos a hospedagem, turismo, viagens e congêneres.</p>

<p>9.01 &#150; Hospedagem de qualquer natureza em hotéis, <b>apart-service</b> condominiais,
<b>flat</b>, apart-hotéis, hotéis residência, <b>residence-service</b>, <b>suite
service</b>, hotelaria marítima, motéis, pensões e congêneres; ocupação por
temporada com fornecimento de serviço (o valor da alimentação e gorjeta, quando
incluído no preço da diária, fica sujeito ao Imposto Sobre Serviços).</p>

<p>9.02 &#150; Agenciamento, organização, promoção, intermediação e execução de
programas de turismo, passeios, viagens, excursões, hospedagens e congêneres.</p>

<p>9.03 &#150; Guias de turismo.</p>

<p>10 &#150; Serviços de intermediação e congêneres.</p>

<p>10.01 &#150; Agenciamento, corretagem ou intermediação de câmbio, de seguros, de
cartões de crédito, de planos de saúde e de planos de previdência privada.</p>

<p>10.02 &#150; Agenciamento, corretagem ou intermediação de títulos em geral, valores
mobiliários e contratos quaisquer.</p>

<p>10.03 &#150; Agenciamento, corretagem ou intermediação de direitos de propriedade
industrial, artística ou literária.</p>

<p>10.04 &#150; Agenciamento, corretagem ou intermediação de contratos de arrendamento
mercantil (<b>leasing</b>), de franquia (<b>franchising</b>) e de faturização (<b>factoring</b>).</p>

<p>10.05 &#150; Agenciamento, corretagem ou intermediação de bens móveis ou imóveis, não
abrangidos em outros itens ou subitens, inclusive aqueles realizados no âmbito de Bolsas
de Mercadorias e Futuros, por quaisquer meios.</p>

<p>10.06 &#150; Agenciamento marítimo.</p>

<p>10.07 &#150; Agenciamento de notícias.</p>

<p>10.08 &#150; Agenciamento de publicidade e propaganda, inclusive o agenciamento de
veiculação por quaisquer meios.</p>

<p>10.09 &#150; Representação de qualquer natureza, inclusive comercial.</p>

<p>10.10 &#150; Distribuição de bens de terceiros.</p>

<p>11 &#150; Serviços de guarda, estacionamento, armazenamento, vigilância e congêneres.</p>

<p>11.01 &#150; Guarda e estacionamento de veículos terrestres automotores, de aeronaves e
de embarcações.</p>

<p>11.02 &#150; Vigilância, segurança ou monitoramento de bens e pessoas.</p>

<p>11.03 &#150; Escolta, inclusive de veículos e cargas.</p>

<p>11.04 &#150; Armazenamento, depósito, carga, descarga, arrumação e guarda de bens de
qualquer espécie.</p>

<p>12 &#150; Serviços de diversões, lazer, entretenimento e congêneres.</p>

<p>12.01 &#150; Espetáculos teatrais.</p>

<p>12.02 &#150; Exibições cinematográficas.</p>

<p>12.03 &#150; Espetáculos circenses.</p>

<p>12.04 &#150; Programas de auditório.</p>

<p>12.05 &#150; Parques de diversões, centros de lazer e congêneres.</p>

<p>12.06 &#150; Boates, <b>taxi-dancing</b> e congêneres.</p>

<p>12.07 &#150; <b>Shows</b><i>, </i><b>ballet</b>, danças, desfiles, bailes, óperas,
concertos, recitais, festivais e congêneres.</p>

<p>12.08 &#150; Feiras, exposições, congressos e congêneres.</p>

<p>12.09 &#150; Bilhares, boliches e diversões eletrônicas ou não.</p>

<p>12.10 &#150; Corridas e competições de animais.</p>

<p>12.11 &#150; Competições esportivas ou de destreza física ou intelectual, com ou sem a
participação do espectador.</p>

<p>12.12 &#150; Execução de música.</p>

<p>12.13 &#150; Produção, mediante ou sem encomenda prévia, de eventos, espetáculos,
entrevistas, <b>shows</b><i>, </i><b>ballet</b>, danças, desfiles, bailes, teatros,
óperas, concertos, recitais, festivais e congêneres.</p>

<p>12.14 &#150; Fornecimento de música para ambientes fechados ou não, mediante
transmissão por qualquer processo.</p>

<p>12.15 &#150; Desfiles de blocos carnavalescos ou folclóricos, trios elétricos e
congêneres.</p>

<p>12.16 &#150; Exibição de filmes, entrevistas, musicais, espetáculos, <b>shows</b>,
concertos, desfiles, óperas, competições esportivas, de destreza intelectual ou
congêneres.</p>

<p>12.17 &#150; Recreação e animação, inclusive em festas e eventos de qualquer natureza.</p>

<p>13 &#150; Serviços relativos a fonografia, fotografia, cinematografia e reprografia.</p>

<p>13.01 &#150; (<a href="../Mensagem_Veto/2003/Mv362-03.htm">VETADO</a>)</p>

<p>13.02 &#150; Fonografia ou gravação de sons, inclusive trucagem, dublagem, mixagem e
congêneres.</p>

<p>13.03 &#150; Fotografia e cinematografia, inclusive revelação, ampliação, cópia,
reprodução, trucagem e congêneres.</p>

<p>13.04 &#150; Reprografia, microfilmagem e digitalização.</p>

<p>13.05 &#150; Composição gráfica, fotocomposição, clicheria, zincografia, litografia,
fotolitografia.</p>

<p>14 &#150; Serviços relativos a bens de terceiros.</p>

<p>14.01 &#150; Lubrificação, limpeza, lustração, revisão, carga e recarga, conserto,
restauração, blindagem, manutenção e conservação de máquinas, veículos, aparelhos,
equipamentos, motores, elevadores ou de qualquer objeto (exceto peças e partes
empregadas, que ficam sujeitas ao ICMS).</p>

<p>14.02 &#150; Assistência técnica.</p>

<p>14.03 &#150; Recondicionamento de motores (exceto peças e partes empregadas, que ficam
sujeitas ao ICMS).</p>

<p>14.04 &#150; Recauchutagem ou regeneração de pneus.</p>

<p>14.05 &#150; Restauração, recondicionamento, acondicionamento, pintura, beneficiamento,
lavagem, secagem, tingimento, galvanoplastia, anodização, corte, recorte, polimento,
plastificação e congêneres, de objetos quaisquer.</p>

<p>14.06 &#150; Instalação e montagem de aparelhos, máquinas e equipamentos, inclusive
montagem industrial, prestados ao usuário final, exclusivamente com material por ele
fornecido.</p>

<p>14.07 &#150; Colocação de molduras e congêneres.</p>

<p>14.08 &#150; Encadernação, gravação e douração de livros, revistas e congêneres.</p>

<p>14.09 &#150; Alfaiataria e costura, quando o material for fornecido pelo usuário final,
exceto aviamento.</p>

<p>14.10 &#150; Tinturaria e lavanderia.</p>

<p>14.11 &#150; Tapeçaria e reforma de estofamentos em geral.</p>

<p>14.12 &#150; Funilaria e lanternagem.</p>

<p>14.13 &#150; Carpintaria e serralheria.</p>

<p>15 &#150; Serviços relacionados ao setor bancário ou financeiro, inclusive aqueles
prestados por instituições financeiras autorizadas a funcionar pela União ou por quem
de direito.</p>

<p>15.01 &#150; Administração de fundos quaisquer, de consórcio, de cartão de crédito ou
débito e congêneres, de carteira de clientes, de cheques pré-datados e congêneres.</p>

<p>15.02 &#150; Abertura de contas em geral, inclusive conta-corrente, conta de investimentos
e aplicação e caderneta de poupança, no País e no exterior, bem como a manutenção
das referidas contas ativas e inativas.</p>

<p>15.03 &#150; Locação e manutenção de cofres particulares, de terminais eletrônicos,
de terminais de atendimento e de bens e equipamentos em geral.</p>

<p>15.04 &#150; Fornecimento ou emissão de atestados em geral, inclusive atestado de
idoneidade, atestado de capacidade financeira e congêneres.</p>

<p>15.05 &#150; Cadastro, elaboração de ficha cadastral, renovação cadastral e
congêneres, inclusão ou exclusão no Cadastro de Emitentes de Cheques sem Fundos &#150;
CCF ou em quaisquer outros bancos cadastrais.</p>

<p>15.06 &#150; Emissão, reemissão e fornecimento de avisos, comprovantes e documentos em
geral; abono de firmas; coleta e entrega de documentos, bens e valores; comunicação com
outra agência ou com a administração central; licenciamento eletrônico de veículos;
transferência de veículos; agenciamento fiduciário ou depositário; devolução de bens
em custódia.</p>

<p>15.07 &#150; Acesso, movimentação, atendimento e consulta a contas em geral, por
qualquer meio ou processo, inclusive por telefone, fac-símile, internet e telex, acesso a
terminais de atendimento, inclusive vinte e quatro horas; acesso a outro banco e a rede
compartilhada; fornecimento de saldo, extrato e demais informações relativas a contas em
geral, por qualquer meio ou processo.</p>

<p>15.08 &#150; Emissão, reemissão, alteração, cessão, substituição, cancelamento e
registro de contrato de crédito; estudo, análise e avaliação de operações de
crédito; emissão, concessão, alteração ou contratação de aval, fiança, anuência e
congêneres; serviços relativos a abertura de crédito, para quaisquer fins.</p>

<p>15.09 &#150; Arrendamento mercantil (<b>leasing</b>) de quaisquer bens, inclusive cessão
de direitos e obrigações, substituição de garantia, alteração, cancelamento e
registro de contrato, e demais serviços relacionados ao arrendamento mercantil (<b>leasing</b>).</p>

<p>15.10 &#150; Serviços relacionados a cobranças, recebimentos ou pagamentos em geral, de
títulos quaisquer, de contas ou carnês, de câmbio, de tributos e por conta de
terceiros, inclusive os efetuados por meio eletrônico, automático ou por máquinas de
atendimento; fornecimento de posição de cobrança, recebimento ou pagamento; emissão de
carnês, fichas de compensação, impressos e documentos em geral.</p>

<p>15.11 &#150; Devolução de títulos, protesto de títulos, sustação de protesto,
manutenção de títulos, reapresentação de títulos, e demais serviços a eles
relacionados.</p>

<p>15.12 &#150; Custódia em geral, inclusive de títulos e valores mobiliários.</p>

<p>15.13 &#150; Serviços relacionados a operações de câmbio em geral, edição,
alteração, prorrogação, cancelamento e baixa de contrato de câmbio; emissão de
registro de exportação ou de crédito; cobrança ou depósito no exterior; emissão,
fornecimento e cancelamento de cheques de viagem; fornecimento, transferência,
cancelamento e demais serviços relativos a carta de crédito de importação,
exportação e garantias recebidas; envio e recebimento de mensagens em geral relacionadas
a operações de câmbio.</p>

<p>15.14 &#150; Fornecimento, emissão, reemissão, renovação e manutenção de cartão
magnético, cartão de crédito, cartão de débito, cartão salário e congêneres.</p>

<p>15.15 &#150; Compensação de cheques e títulos quaisquer; serviços relacionados a
depósito, inclusive depósito identificado, a saque de contas quaisquer, por qualquer
meio ou processo, inclusive em terminais eletrônicos e de atendimento.</p>

<p>15.16 &#150; Emissão, reemissão, liquidação, alteração, cancelamento e baixa de
ordens de pagamento, ordens de crédito e similares, por qualquer meio ou processo;
serviços relacionados à transferência de valores, dados, fundos, pagamentos e
similares, inclusive entre contas em geral.</p>

<p>15.17 &#150; Emissão, fornecimento, devolução, sustação, cancelamento e oposição de
cheques quaisquer, avulso ou por talão.</p>

<p>15.18 &#150; Serviços relacionados a crédito imobiliário, avaliação e vistoria de
imóvel ou obra, análise técnica e jurídica, emissão, reemissão, alteração,
transferência e renegociação de contrato, emissão e reemissão do termo de quitação
e demais serviços relacionados a crédito imobiliário.</p>

<p>16 &#150; Serviços de transporte de natureza municipal.</p>

<p>16.01 &#150; Serviços de transporte de natureza municipal.</p>

<p>17 &#150; Serviços de apoio técnico, administrativo, jurídico, contábil, comercial e
congêneres.</p>

<p>17.01 &#150; Assessoria ou consultoria de qualquer natureza, não contida em outros itens
desta lista; análise, exame, pesquisa, coleta, compilação e fornecimento de dados e
informações de qualquer natureza, inclusive cadastro e similares.</p>

<p>17.02 &#150; Datilografia, digitação, estenografia, expediente, secretaria em geral,
resposta audível, redação, edição, interpretação, revisão, tradução, apoio e
infra-estrutura administrativa e congêneres.</p>

<p>17.03 &#150; Planejamento, coordenação, programação ou organização técnica,
financeira ou administrativa.</p>

<p>17.04 &#150; Recrutamento, agenciamento, seleção e colocação de mão-de-obra.</p>

<p>17.05 &#150; Fornecimento de mão-de-obra, mesmo em caráter temporário, inclusive de
empregados ou trabalhadores, avulsos ou temporários, contratados pelo prestador de
serviço.</p>

<p>17.06 &#150; Propaganda e publicidade, inclusive promoção de vendas, planejamento de
campanhas ou sistemas de publicidade, elaboração de desenhos, textos e demais materiais
publicitários.</p>

<p>17.07 &#150; (<a href="../Mensagem_Veto/2003/Mv362-03.htm">VETADO</a>)</p>

<p>17.08 &#150; Franquia (<b>franchising</b>).</p>

<p>17.09 &#150; Perícias, laudos, exames técnicos e análises técnicas.</p>

<p>17.10 &#150; Planejamento, organização e administração de feiras, exposições,
congressos e congêneres.</p>

<p>17.11 &#150; Organização de festas e recepções; bufê (exceto o fornecimento de
alimentação e bebidas, que fica sujeito ao ICMS).</p>

<p>17.12 &#150; Administração em geral, inclusive de bens e negócios de terceiros.</p>

<p>17.13 &#150; Leilão e congêneres.</p>

<p>17.14 &#150; Advocacia.</p>

<p>17.15 &#150; Arbitragem de qualquer espécie, inclusive jurídica.</p>

<p>17.16 &#150; Auditoria.</p>

<p>17.17 &#150; Análise de Organização e Métodos.</p>

<p>17.18 &#150; Atuária e cálculos técnicos de qualquer natureza.</p>

<p>17.19 &#150; Contabilidade, inclusive serviços técnicos e auxiliares.</p>

<p>17.20 &#150; Consultoria e assessoria econômica ou financeira.</p>

<p>17.21 &#150; Estatística.</p>

<p>17.22 &#150; Cobrança em geral.</p>

<p>17.23 &#150; Assessoria, análise, avaliação, atendimento, consulta, cadastro,
seleção, gerenciamento de informações, administração de contas a receber ou a pagar
e em geral, relacionados a operações de faturização (<b>factoring</b>).</p>

<p>17.24 &#150; Apresentação de palestras, conferências, seminários e congêneres.</p>

<p>18 &#150; Serviços de regulação de sinistros vinculados a contratos de seguros;
inspeção e avaliação de riscos para cobertura de contratos de seguros; prevenção e
gerência de riscos seguráveis e congêneres.</p>

<p>18.01 - Serviços de regulação de sinistros vinculados a contratos de seguros;
inspeção e avaliação de riscos para cobertura de contratos de seguros; prevenção e
gerência de riscos seguráveis e congêneres.</p>

<p>19 &#150; Serviços de distribuição e venda de bilhetes e demais produtos de loteria,
bingos, cartões, pules ou cupons de apostas, sorteios, prêmios, inclusive os decorrentes
de títulos de capitalização e congêneres.</p>

<p>19.01 - Serviços de distribuição e venda de bilhetes e demais produtos de loteria,
bingos, cartões, pules ou cupons de apostas, sorteios, prêmios, inclusive os decorrentes
de títulos de capitalização e congêneres.</p>

<p>20 &#150; Serviços portuários, aeroportuários, ferroportuários, de terminais
rodoviários, ferroviários e metroviários.</p>

<p>20.01 &#150; Serviços portuários, ferroportuários, utilização de porto,
movimentação de passageiros, reboque de embarcações, rebocador escoteiro, atracação,
desatracação, serviços de praticagem, capatazia, armazenagem de qualquer natureza,
serviços acessórios, movimentação de mercadorias, serviços de apoio marítimo, de
movimentação ao largo, serviços de armadores, estiva, conferência, logística e
congêneres.</p>

<p>20.02 &#150; Serviços aeroportuários, utilização de aeroporto, movimentação de
passageiros, armazenagem de qualquer natureza, capatazia, movimentação de aeronaves,
serviços de apoio aeroportuários, serviços acessórios, movimentação de mercadorias,
logística e congêneres.</p>

<p>20.03 &#150; Serviços de terminais rodoviários, ferroviários, metroviários,
movimentação de passageiros, mercadorias, inclusive&nbsp;&nbsp;&nbsp;&nbsp; suas
operações, logística e congêneres.</p>

<p>21 &#150; Serviços de registros públicos, cartorários e notariais.</p>

<p>21.01 - Serviços de registros públicos, cartorários e notariais.</p>

<p>22 &#150; Serviços de exploração de rodovia. </p>

<p>22.01 &#150; Serviços de exploração de rodovia mediante cobrança de preço ou pedágio
dos usuários, envolvendo execução de serviços de conservação, manutenção,
melhoramentos para adequação de capacidade e segurança de trânsito, operação,
monitoração, assistência aos usuários e outros serviços definidos em contratos, atos
de concessão ou de permissão ou em &nbsp;&nbsp;&nbsp;&nbsp; normas oficiais.</p>

<p>23 &#150; Serviços de programação e comunicação visual, desenho industrial e
congêneres. </p>

<p>23.01 &#150; Serviços de programação e comunicação visual, desenho industrial e
congêneres.</p>

<p>24 &#150; Serviços de chaveiros, confecção de carimbos, placas, sinalização visual, <b>banners</b>,
adesivos e congêneres. </p>

<p>24.01 - Serviços de chaveiros, confecção de carimbos, placas, sinalização visual, <b>banners</b>,
adesivos e congêneres.</p>

<p>25 - Serviços funerários. </p>

<p>25.01 &#150; Funerais, inclusive fornecimento de caixão, urna ou esquifes; aluguel de
capela; transporte do corpo cadavérico; fornecimento de flores, coroas e outros
paramentos; desembaraço de certidão de óbito; fornecimento de véu, essa e outros
adornos; embalsamento, embelezamento, conservação ou restauração de cadáveres.</p>

<p>25.02 &#150; Cremação de corpos e partes de corpos cadavéricos.</p>

<p>25.03 &#150; Planos ou convênio funerários.</p>

<p>25.04 &#150; Manutenção e conservação de jazigos e cemitérios.</p>

<p>26 &#150; Serviços de coleta, remessa ou entrega de correspondências, documentos,
objetos, bens ou valores, inclusive pelos correios e suas agências franqueadas; <b>courrier</b><i>
</i>e congêneres.</p>

<p>26.01 &#150; Serviços de coleta, remessa ou entrega de correspondências, documentos,
objetos, bens ou valores, inclusive pelos correios e suas agências franqueadas; <b>courrier
</b>e congêneres.</p>

<p>27 &#150; Serviços de assistência social.</p>

<p>27.01 &#150; Serviços de assistência social.</p>

<p>28 &#150; Serviços de avaliação de bens e serviços de qualquer natureza.</p>

<p>28.01 &#150; Serviços de avaliação de bens e serviços de qualquer natureza.</p>

<p>29 &#150; Serviços de biblioteconomia.</p>

<p>29.01 &#150; Serviços de biblioteconomia.</p>

<p>30 &#150; Serviços de biologia, biotecnologia e química.</p>

<p>30.01 &#150; Serviços de biologia, biotecnologia e química.</p>

<p>31 &#150; Serviços técnicos em edificações, eletrônica, eletrotécnica, mecânica,
telecomunicações e congêneres.</p>

<p>31.01 - Serviços técnicos em edificações, eletrônica, eletrotécnica, mecânica,
telecomunicações e congêneres.</p>

<p>32 &#150; Serviços de desenhos técnicos.</p>

<p>32.01 - Serviços de desenhos técnicos.</p>

<p>33 &#150; Serviços de desembaraço aduaneiro, comissários, despachantes e congêneres.</p>

<p>33.01 - Serviços de desembaraço aduaneiro, comissários, despachantes e congêneres.</p>

<p>34 &#150; Serviços de investigações particulares, detetives e congêneres.</p>

<p>34.01 - Serviços de investigações particulares, detetives e congêneres.</p>

<p>35 &#150; Serviços de reportagem, assessoria de imprensa, jornalismo e relações
públicas.</p>

<p>35.01 - Serviços de reportagem, assessoria de imprensa, jornalismo e relações
públicas.</p>

<p>36 &#150; Serviços de meteorologia.</p>

<p>36.01 &#150; Serviços de meteorologia.</p>

<p>37 &#150; Serviços de artistas, atletas, modelos e manequins.</p>

<p>37.01 - Serviços de artistas, atletas, modelos e manequins.</p>

<p>38 &#150; Serviços de museologia.</p>

<p>38.01 &#150; Serviços de museologia.</p>

<p>39 &#150; Serviços de ourivesaria e lapidação.</p>

<p>39.01 - Serviços de ourivesaria e lapidação (quando o material for fornecido pelo
tomador do serviço).</p>

<p>40 &#150; Serviços relativos a obras de arte sob encomenda.</p>

<p>40.01 - Obras de arte sob encomenda.</p>
     */
    public static final String COD_LST      = "COD_LST";
    public static final String ALIQ_ICMS    = "ALIQ_ICMS";
    
    public R0200() {
        setName("Registro 0200 - Identificacao dos itens");
        setDelimiter("|");
       addFieldArchetype(REGISTRO,     new FieldDefaultArchetype("0200"));
       //2
        addFieldArchetype(COD_ITEM,     new FieldStringMaximumLengthArchetype(60));
        //3
        addFieldArchetype(DESCR_ITEM,   new FieldStringMaximumLengthArchetype(255));
        FieldArchetype fa = new FieldStringMaximumLengthArchetype(128);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        //4
        addFieldArchetype(COD_BARRA,    fa);
        fa = new FieldStringMaximumLengthArchetype(60);
        fa.setNullableRepresentation("");
        fa.setFullFillingNullable(false);
        //5
        addFieldArchetype(COD_ANT_ITEM, fa);
        //6
        addFieldArchetype(UNID_INV,     new FieldStringMaximumLengthArchetype(6));
        //7
        addFieldArchetype(TIPO_ITEM,    new FieldIntegerFixedLengthArchetype(2));
        //8
        addFieldArchetype(COD_NCM,      new FieldStringFixedLengthArchetype(8));
        fa = new FieldStringMaximumLengthArchetype(3);
        fa.setFullFillingNullable(false);
        fa.setNullableRepresentation("");
        //9
        addFieldArchetype(EX_IPI,       fa);
        fa = new FieldIntegerFixedLengthArchetype(2);
        fa.setFullFillingNullable(false);
        fa.setNullableRepresentation("");
        //10
        addFieldArchetype(COD_GEN,      fa);
        fa = new FieldIntegerFixedLengthArchetype(2);
        fa.setFullFillingNullable(false);
        fa.setNullableRepresentation("0000");
        //11
        addFieldArchetype(COD_LST,      fa);
        //12
        
        FormatWrapper fw = FormatFactory.getFormat(FormatType.DECIMAL);
        fw.setReplaceComa(false);
        FieldDecimalMaximumLengthArchetype fda = new FieldDecimalMaximumLengthArchetype(6, 2);
        fda.setNullableRepresentation("0,00");
        fda.setFormat(fw);
        addFieldArchetype(ALIQ_ICMS,    fda);
    }
}
