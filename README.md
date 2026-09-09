# Algoritmo e Programação — Exemplos de Aula

Repositório com os **códigos-fonte usados em sala de aula** na disciplina de
**Algoritmo e Programação** do curso de Análise e Desenvolvimento de Sistemas da **Ânima Educação**.

Cada arquivo é um programa Java pequeno, autônomo e comentado, criado durante a aula
para demonstrar **um conceito de cada vez**. O objetivo não é ter uma aplicação, e sim
uma trilha de exemplos que acompanha a progressão do conteúdo do semestre.

---

## Objetivos de aprendizagem

Ao final da trilha de exemplos, o estudante deve ser capaz de:

- Entender o ciclo **editar → compilar → executar** de um programa Java.
- Declarar e usar **variáveis** e **tipos primitivos** (`int`, `double`).
- Ler dados do teclado com `Scanner` e exibir resultados com `System.out`.
- Escrever **expressões aritméticas** e entender divisão inteira vs. divisão real.
- Tomar decisões com **estruturas condicionais** (`if`, `else if`, `else`, `if` aninhado).
- Combinar condições com **operadores lógicos** (`&&`, `||`) e **relacionais** (`<`, `>=`, `==`).
- Repetir instruções com **laços** (`while` e `for`) e usar **acumuladores** e **contadores**.
- Escrever **métodos** com parâmetros e retorno, entender **escopo de variáveis** (passagem por
  valor) e **decompor** um programa maior em métodos reutilizáveis.

---

## Pré-requisitos

| Ferramenta | Versão recomendada | Observação |
|---|---|---|
| **JDK** (Java Development Kit) | 17 ou superior (ambiente da disciplina usa **JDK 25**) | Fornece `javac` (compilador) e `java` (execução) |
| Editor / IDE | IntelliJ IDEA Community, VS Code + Extension Pack for Java, ou qualquer editor de texto | O projeto já vem com metadados do IntelliJ (`.idea/`, `*.iml`), mas eles são ignorados no Git |
| Terminal | zsh, bash, PowerShell, cmd | Necessário para compilar e executar pela linha de comando |

Verifique a instalação:

```bash
java -version
javac -version
```

---

## Estrutura do repositório

```
algoritmo-programacao/
├── README.md
├── src/
│   ├── 1-introducao/
│   │   └── CalculaMedia.java        # variáveis, entrada/saída, aritmética
│   ├── 2-condicao/
│   │   └── CalculaResultado.java    # if/else if/else, if aninhado, operadores lógicos, for
│   ├── 3-repeticao/
│   │   ├── SomaCinco.java           # laço while + acumulador
│   │   └── Contador.java            # laço for + contador
│   └── 4-metodos/
│       ├── CalculaMediaMetodo.java  # anatomia de um método (parâmetros + retorno)
│       ├── Dobro.java               # passagem por valor / escopo
│       ├── MetodosSimples.java      # métodos com parâmetros e retorno (aquecimento)
│       ├── SituacaoAluno.java       # decomposição de um programa em métodos (gabarito)
│       └── MaiorSobrecarga.java     # sobrecarga de métodos (desafio opcional)
└── out/                             # artefatos de compilação do IntelliJ (ignorado no Git)
```

As pastas são numeradas **na ordem em que os assuntos são apresentados no curso**.
Novos exemplos devem ser adicionados à pasta do tópico correspondente ou a uma nova
pasta numerada (`4-...`, `5-...`).

> **Importante:** os arquivos **não declaram `package`**. As subpastas servem apenas para
> organizar o material didaticamente — todas as classes estão no *pacote default*. Isso muda
> a forma de compilar e executar (veja abaixo).

---

## Como compilar e executar

### Opção A — Executar direto o arquivo-fonte (mais simples)

A partir do JDK 11 é possível rodar um `.java` sem gerar `.class` manualmente.
Execute a partir da **raiz do projeto**:

```bash
java src/3-repeticao/Contador.java
```

### Opção B — Compilar e depois executar (fluxo tradicional)

Como não há `package`, entre na pasta do arquivo antes de compilar:

```bash
cd src/3-repeticao
javac Contador.java      # gera Contador.class
java Contador            # executa
```

### Programas que leem dados do teclado

`CalculaMedia` e `CalculaResultado` usam `Scanner` e ficam aguardando entrada.
Você pode digitar os valores normalmente ou fornecê-los via *pipe*:

```bash
cd src/1-introducao
javac CalculaMedia.java
printf "7.5\n8.0\n" | java CalculaMedia
```

> **Números decimais:** o `Scanner` respeita o *locale* do sistema. Em ambiente
> configurado em português, use **vírgula** (`7,5`); em inglês, use **ponto** (`7.5`).
> Se der `InputMismatchException`, tente trocar o separador.

### Pela IDE

Abra o projeto no IntelliJ IDEA e use o botão ▶️ ao lado do método `main` de cada classe.

---

## Descrição dos exemplos

### 1. `1-introducao/CalculaMedia.java`

**Conceitos:** declaração de variáveis `double`, leitura com `Scanner.nextDouble()`,
concatenação de `String` com `+`, expressão aritmética e precedência de parênteses.

Lê duas notas, exibe os valores digitados e calcula a média aritmética
`(nota + outraNota) / 2`.

```
Digite sua nota
7.5
Digite a outa nota
8.0
Nota: 7.5
Digite Outra Nota: 8.0
Média: 7.75
```

*Discussão em aula:* por que `(nota + outraNota) / 2` e não `nota + outraNota / 2`?
O que mudaria se as variáveis fossem `int`?

### 2. `2-condicao/CalculaResultado.java`

**Conceitos:** laço `for`, validação de faixa de valores, `if / else if / else`,
`if` aninhado, operadores relacionais e lógicos (`<`, `>`, `>=`, `==`, `||`, `&&`).

Repete 5 vezes: lê uma nota, valida se está entre 0 e 10 e classifica o resultado:

| Condição | Saída |
|---|---|
| `nota < 0` ou `nota > 10` | `Nota inválida!` |
| `nota >= 6` | `Aprovado` (e `Nota Cheia!!!` se `nota == 10`) |
| `nota >= 4` e `nota < 6` | `Exame Final` |
| caso contrário | `Reprovado` |

*Discussão em aula:* diferença entre `if` encadeado e vários `if` independentes;
por que a ordem das condições importa; risco de comparar `double` com `==`.

### 3. `3-repeticao/SomaCinco.java`

**Conceitos:** laço `while`, variável **acumuladora** (`soma`), variável de controle (`i`),
incremento `i++`.

Soma os números de 1 a 5, imprimindo o valor parcial a cada passo:

```
1
3
6
10
15
```

*Discussão em aula:* o que acontece se esquecermos o `i++`? (laço infinito).

### 4. `3-repeticao/Contador.java`

**Conceitos:** laço `for`, variável **contadora**, comparação `while` × `for`.

Imprime os números de 1 a 5, um por linha. É a versão "enxuta" do controle de repetição
que no `while` exige três linhas separadas (inicialização, condição, incremento).

```
1
2
3
4
5
```

> **Nota de planejamento:** a Aula 07 (07/09/2026) previa aprofundar laços **aninhados**
> (um `for`/`while` dentro de outro) antes de métodos, mas caiu em feriado nacional
> (Independência do Brasil) e não houve reposição nem aula assíncrona. Esse tópico ainda
> **não tem exemplo** neste repositório — deve ser reposto em `3-repeticao/` (ex.:
> `TabuadaCompleta.java`, com um `for` externo percorrendo números e um `for` interno
> percorrendo o multiplicador) antes de a turma precisar disso (ex.: manipulação de
> matrizes na UA3).

### 5. `4-metodos/CalculaMediaMetodo.java`

**Conceitos:** anatomia de um método (`static`, tipo de retorno, nome, parâmetros, `return`).

Refatoração de `1-introducao/CalculaMedia.java`: em vez de calcular a média dentro do
`main`, o cálculo vira o método `calcularMedia(double n1, double n2)`.

*Discussão em aula:* aponte, no código, cada parte da assinatura do método
(`static`, `double`, `calcularMedia`, `(double n1, double n2)`, `return`).

### 6. `4-metodos/Dobro.java`

**Conceitos:** parâmetros são cópias (**passagem por valor**), escopo local.

```
5 10
```

`x` permanece `5` mesmo depois de `dobro(x)` alterar `n` — `n` é uma variável local do
método, independente de `x`. `y` recebe o valor retornado (`10`).

*Discussão em aula:* por que `x` não muda? O que aconteceria se `dobro` fosse `void` e
só imprimisse `n` em vez de retornar?

### 7. `4-metodos/MetodosSimples.java`

**Conceitos:** métodos com retorno (`int`, `double`, `boolean`) e método `void` (sem retorno).

Quatro métodos de aquecimento chamados a partir do `main`: `soma`, `areaRetangulo`,
`ehPar` e `saudacao`. Corresponde à **Parte A** do laboratório da Aula 08.

### 8. `4-metodos/SituacaoAluno.java`

**Conceitos:** decomposição de um programa em métodos reutilizáveis, `Scanner` como
parâmetro, escopo (a variável `media` só existe dentro de `calcularMedia`).

**Gabarito** da **Parte B** do laboratório da Aula 08: lê 3 notas, calcula a média,
classifica (`Aprovado` ≥ 7, `Recuperação` 4–6,9, `Reprovado` < 4) e exibe o resultado —
tudo decomposto em `lerNota`, `calcularMedia`, `classificar` e `exibirResultado`, com o
`main` apenas orquestrando as chamadas.

*Discussão em aula (escopo, Parte C):* peça para os alunos tentarem imprimir `media`
dentro do `main` (fora de `calcularMedia`) e lerem o erro `cannot find symbol` do
compilador — não corrija o arquivo para isso, é para o erro aparecer ao vivo.

### 9. `4-metodos/MaiorSobrecarga.java`

**Conceitos:** sobrecarga de métodos (*overloading*) — duas versões de `maior`, uma para
`int` e outra para `double`. Java escolhe a versão certa pelos parâmetros da chamada.
Desafio opcional da Aula 08.

---

## Convenções do repositório

- **Um programa por arquivo**, com uma classe `public` contendo `main`. O nome da classe
  é igual ao nome do arquivo.
- **Idioma português** em nomes de variáveis, comentários e mensagens.
- Código **propositalmente simples**: sem frameworks, sem build tool, sem tratamento de
  exceções, sem abstrações. O foco é a legibilidade para quem está começando.
- Alguns exemplos contêm **pequenos erros de digitação** nas mensagens (ex.: *"outa nota"*).
  Isso é comum em código escrito ao vivo; corrija apenas se for objetivo da aula.
- Não há testes automatizados, *lint* nem CI — e não se pretende adicionar, dada a
  finalidade didática do repositório.

---

## Fluxo de trabalho sugerido para os alunos

1. Faça um *fork* ou clone deste repositório.
2. Antes de cada aula, execute os exemplos da pasta correspondente ao tópico.
3. Modifique os exemplos: mude valores, condições e limites e **preveja a saída antes
   de rodar**.
4. Crie suas próprias variações em uma pasta pessoal (ex.: `src/exercicios/`).

---

## Roadmap de conteúdo

Pastas já criadas (1 a 4) cobrem a **UA1** (sequencial) e a **UA2** (condicionais,
repetição e métodos). Próximos tópicos que devem ganhar pastas, seguindo a ordem das
Unidades de Aprendizagem do [Plano de Aulas](../../Plano_de_Aulas_Algoritmos_e_Programacao_2026-2.docx):

- `5-arrays/` — arranjos unidimensionais (UA3 — Aulas 11–12)
- `6-matrizes-colecoes/` — arranjos bidimensionais, coleções, busca/inserção/remoção (UA3 — Aulas 13–14)
- `7-poo-classes/` — classes, objetos e encapsulamento (UA5 — Aulas 21–22)
- `8-poo-avancado/` — herança, polimorfismo, interfaces e exceções (UA6 — Aulas 23–26)

> A UA4 (Aulas 15–18) é o projeto Java integrador — não introduz sintaxe nova, então não
> deve gerar uma pasta própria; seus exemplos combinam os tópicos de `1-` a `6-`.

---

## Licença e uso

Material didático de uso educacional na disciplina de Algoritmo e Programação da
Ânima Educação (AGES). Livre para consulta, cópia e adaptação por estudantes e docentes.

**Professor:** Welber Macedo
