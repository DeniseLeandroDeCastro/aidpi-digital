<div align="center">

<img width="1600" height="600" alt="banner_aidpi" src="https://github.com/user-attachments/assets/02561a33-c771-4183-8143-822db81736ce" />


# AIDPI Digital

### Tecnologia aplicada ao cuidado infantil

**Aplicativo Android nativo que transforma um fluxograma acadêmico de avaliação da saúde infantil em uma experiência digital, intuitiva e organizada.**

![Android](https://img.shields.io/badge/Android-Nativo-3DDC84?style=flat-square&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=flat-square&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack-Compose-4285F4?style=flat-square&logo=jetpackcompose&logoColor=white)
![Material 3](https://img.shields.io/badge/Material-3-6750A4?style=flat-square&logo=materialdesign&logoColor=white)

![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-blue?style=flat-square)

</div>

---

## Sobre o projeto

O **AIDPI Digital** é um aplicativo Android desenvolvido com **Kotlin e Jetpack Compose**, inspirado em um trabalho acadêmico da área de Enfermagem. 
O projeto utiliza como referência a estratégia de **Atenção Integrada às Doenças Prevalentes na Infância (AIDPI)**, transformando informações organizadas em um fluxograma em uma sequência de telas interativas.
A proposta é facilitar a navegação entre perguntas, respostas e caminhos de avaliação, apresentando as informações de maneira clara e visualmente organizada.Do ponto de vista técnico, o desenvolvimento envolve um desafio interessante: **transformar regras de decisão em fluxos de navegação, mantendo a interface consistente e o código preparado para evolução.**
O aplicativo está em desenvolvimento e novas etapas estão sendo implementadas progressivamente.

> **Aviso:** este é um projeto acadêmico e demonstrativo. Não substitui avaliação profissional, protocolos clínicos oficiais ou julgamento clínico.

---

## Conheça o aplicativo

A interface foi desenvolvida com atenção à experiência do usuário, utilizando cores suaves, componentes reutilizáveis e navegação orientada pelas respostas.

### Telas implementadas

<table align="center">
  <tr>
    <td align="center" width="33%">
      <strong>Tela inicial</strong>
    </td>
    <td align="center" width="33%">
      <strong>Sinais gerais de perigo</strong>
    </td>
    <td align="center" width="33%">
      <strong>Avaliação de sibilância</strong>
    </td>
  </tr>
  <tr>
    <td align="center" valign="top">
      <img src="https://github.com/user-attachments/assets/768699a8-cf25-4dff-b8d3-05e1dcc4bfc1" width="190" alt="Tela inicial do AIDPI Digital">
    </td>
    <td align="center" valign="top">
      <img src="https://github.com/user-attachments/assets/7fefe7eb-fbbd-4408-bb69-24768fae1d0b" width="190" alt="Pergunta sobre sinais gerais de perigo">
    </td>
    <td align="center" valign="top">
      <img src="https://github.com/user-attachments/assets/8e657f66-4ff1-4650-af9e-2e358477b15f" width="190" alt="Pergunta sobre sibilância">
    </td>
  </tr>
  <tr>
    <td align="center">
      <strong>Sinais respiratórios</strong>
    </td>
    <td align="center">
      <strong>Faixa etária</strong>
    </td>
    <td align="center">
      <strong>Frequência respiratória</strong>
    </td>
  </tr>
  <tr>
    <td align="center" valign="top">
      <img src="https://github.com/user-attachments/assets/a7515884-ebb3-4de1-a2a8-5566eec3224c" width="190" alt="Avaliação de sinais respiratórios">
    </td>
    <td align="center" valign="top">
      <img src="https://github.com/user-attachments/assets/69351ed4-68a8-4487-86a0-8565e3f9a260" width="190" alt="Seleção da faixa etária">
    </td>
    <td align="center" valign="top">
      <img src="https://github.com/user-attachments/assets/b63e0d07-0381-4143-8f0c-02f136be8f1c" width="190" alt="Avaliação da frequência respiratória">
    </td>
  </tr>
</table>

<div align="center">
  <sub>Interfaces reais do aplicativo Android em desenvolvimento.</sub>
</div>

---

## Funcionalidades implementadas

### Fluxo de avaliação por etapas

O aplicativo apresenta perguntas organizadas em uma sequência de avaliação, com um indicador visual de progresso. As respostas selecionadas determinam o próximo caminho do fluxo.

### Avaliação de sinais gerais de perigo

A primeira etapa apresenta sinais gerais de perigo e permite seguir para uma tela de resultado ou continuar a avaliação, conforme a resposta.

### Avaliação respiratória

O fluxo contempla perguntas sobre:

- Presença de sibilância.
- Tiragem subcostal.
- Estridor em repouso.
- Frequência respiratória.

### Seleção de faixa etária

O aplicativo apresenta duas opções:

- Menor de 12 meses.
- De 1 a 5 anos.

Cada opção direciona para sua respectiva tela de frequência respiratória.

### Frequência respiratória

As telas apresentam os critérios de frequência respiratória definidos no material acadêmico utilizado como referência.
Os cartões diferenciam as alternativas de respiração rápida e normal, permitindo a seleção da resposta correspondente.

### Telas de resultado

Alguns caminhos do fluxograma já possuem telas de resultado específicas. Essas telas fazem parte da implementação progressiva das etapas de avaliação.

---

## Tecnologias utilizadas

| Tecnologia | Utilização |
|---|---|
| **Kotlin** | Linguagem principal |
| **Jetpack Compose** | Desenvolvimento das interfaces |
| **Material 3** | Cartões e componentes visuais |
| **Navigation Compose** | Navegação entre as etapas |
| **Android SDK** | Plataforma Android nativa |
| **Gradle** | Configuração e gerenciamento de dependências |
| **Android Studio** | Desenvolvimento e execução |

---

## Organização e componentização

Uma das prioridades do projeto é manter a interface organizada, evitando a duplicação desnecessária de código.
Os componentes visuais reutilizáveis são separados das telas, permitindo ajustes específicos sem comprometer outras partes do aplicativo. A estrutura inclui:

```text
br.com.denisecastro.aidpidigital
│
├── ui
│   ├── home
│   │   ├── components
│   │   │   └── card
│   │   └── screen
│   │
│   ├── assessment
│   │   ├── components
│   │   │   ├── answer
│   │   │   ├── background
│   │   │   ├── header
│   │   │   ├── illustration
│   │   │   └── question
│   │   ├── result
│   │   └── screen
│   │
│   ├── navigation
│   └── theme
│
└── res
    ├── drawable
    └── values
```

### Componentes reutilizáveis

Alguns exemplos da organização adotada:

**AssessmentAnswerCard**

Cartão utilizado para apresentar respostas com ícones, cores e navegação.

**WheezingAssessmentAnswerCard**

Cartão específico para respostas que também apresentam uma descrição complementar.

**ChildAgeAnswerCard**

Cartão de seleção da faixa etária, com texto e indicador de navegação.

**RespiratoryRateAnswerCard**

Componente utilizado nas telas de frequência respiratória, permitindo configurar título, descrição e destaque visual.

**AssessmentChildIllustration**

Componente responsável pela ilustração utilizada em diferentes perguntas.

**AssessmentBackgroundWaves**

Elemento visual reutilizado para manter a identidade gráfica das telas de avaliação.

---

## Decisões técnicas

### Interface declarativa com Jetpack Compose

A construção das telas utiliza funções `@Composable`, permitindo organizar a interface em componentes independentes. Isso facilita a manutenção e a evolução visual do aplicativo.

### Componentes Material 3

Os cartões interativos utilizam `Card` do Material 3, em vez de estruturas que apenas simulam visualmente um cartão. A implementação permite configurar:

- Formato e arredondamento.
- Cores de fundo.
- Bordas.
- Espaçamento interno.
- Comportamento de clique.

### Navegação orientada pelas respostas

O fluxo utiliza Navigation Compose para direcionar o usuário conforme as respostas selecionadas. Na etapa de faixa etária, por exemplo, cada alternativa abre uma tela específica.
Essa abordagem permite representar ramificações do fluxograma e incorporar novas etapas progressivamente.

### Consistência visual

Durante o desenvolvimento, foram realizados ajustes para manter um padrão entre as telas:

- Posicionamento das ilustrações.
- Altura e espaçamento dos cartões.
- Alinhamento dos títulos.
- Tipografia.
- Cores.
- Indicadores de progresso.

O objetivo é oferecer uma experiência consistente mesmo quando as perguntas apresentam conteúdos diferentes.

### Previews no desenvolvimento

Os componentes e as telas utilizam `@Preview` para facilitar a visualização e os ajustes de interface durante o desenvolvimento.

---

## Desafios do projeto

### Transformar um fluxograma em navegação

Um fluxograma acadêmico apresenta decisões e diferentes caminhos. No aplicativo, essas decisões precisam ser representadas por telas, eventos de clique e destinos de navegação.

### Reutilizar componentes sem comprometer o layout

Diferentes perguntas podem exigir textos, descrições e cartões com características específicas. A componentização precisa equilibrar reutilização e flexibilidade.

### Padronizar telas com conteúdos diferentes

Títulos maiores, descrições menores e ilustrações podem provocar diferenças de posicionamento. Por isso, o desenvolvimento também envolve revisão de medidas, alinhamentos e espaçamentos.

### Evoluir o aplicativo por etapas

O fluxo é implementado progressivamente, permitindo validar as interfaces e a navegação antes de avançar para novas partes do projeto.

---

## Próximas etapas

- [x] Desenvolvimento da Home.
- [x] Implementação das primeiras perguntas.
- [x] Navegação entre respostas.
- [x] Componentes reutilizáveis.
- [x] Cartões Material 3.
- [x] Seleção de faixa etária.
- [x] Telas de frequência respiratória.
- [ ] Continuidade do fluxograma.
- [ ] Integração das próximas telas de resultado.
- [ ] Revisão completa dos caminhos de navegação.
- [ ] Ampliação dos testes automatizados.
- [ ] Validação final do conteúdo clínico.
- [ ] Preparação de uma versão demonstrativa.

---

## Como executar

### Pré-requisitos

- Android Studio.
- Android SDK configurado.
- Emulador Android ou dispositivo físico compatível.

### Execução

1. Clone o repositório:

```bash
git clone URL_DO_REPOSITORIO.git
```

2. Abra o projeto no Android Studio.
3. Aguarde a sincronização do Gradle.
4. Selecione um emulador ou dispositivo.
5. Execute o aplicativo.

---

## Sobre a desenvolvedora

Sou **Denise Castro**, desenvolvedora de software com mais de quatro anos de experiência profissional, com foco em desenvolvimento Android.
Minha trajetória inclui atuação em produtos financeiros como **PicPay, Stone e PagBank**, trabalhando com Kotlin, Java, desenvolvimento de interfaces, evolução de funcionalidades, manutenção de aplicações e práticas de engenharia de software.
O AIDPI Digital é um dos projetos que estou desenvolvendo para continuar explorando o ecossistema Android e aplicar minha experiência em diferentes contextos.

Neste projeto, tenho trabalhado especialmente com:

- Kotlin e Jetpack Compose.
- Componentização de interfaces.
- Material 3.
- Navegação entre telas.
- Organização e manutenção do código.
- Construção incremental de funcionalidades.

### Aberta a novas oportunidades

Atualmente, estou em busca de uma nova oportunidade como **Desenvolvedora Android**.Tenho interesse em contribuir com equipes que valorizem qualidade técnica, colaboração, aprendizado contínuo e desenvolvimento de produtos que resolvam problemas reais.
Se você trabalha com recrutamento ou conhece uma oportunidade compatível com meu perfil, ficarei feliz em conversar.

**LinkedIn:** [Denise Castro](LINK_DO_LINKEDIN)

**GitHub:** [denisecastro](https://github.com/denisecastro)

---

<div align="center">

### AIDPI Digital

**Tecnologia, desenvolvimento Android e cuidado infantil.**

Desenvolvido por **Denise Castro**.

</div>

