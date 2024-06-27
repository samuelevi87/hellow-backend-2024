where# Jogo de Investigação Futurista

## Contexto da História

### Introdução

**Ano 2054.** A Terra está mergulhada em um caos sem precedentes. Depois de décadas de avanços tecnológicos desenfreados, uma série de eventos catastróficos colocou a humanidade à beira da extinção. Desastres naturais, pandemias e conflitos globais devastaram a civilização como a conhecemos. As cidades estão em ruínas, e poucos lugares na Terra permanecem habitáveis.

### Missão do Investigador

Você, um investigador renomado, foi convocado pela última organização governamental remanescente, **A Aliança para a Sobrevivência da Humanidade (ASH)**, para desvendar o que levou o mundo a esse estado de calamidade. Sua missão é crucial: **descobrir as causas da destruição e encontrar uma forma de salvar os sobreviventes.**

### A Jornada Começa

Sua primeira pista está nos registros das estações espaciais que orbitam a Terra. Essas estações foram construídas para monitorar o planeta e servir de refúgio em caso de emergência. No entanto, muitos desses postos avançados caíram em silêncio, deixando a ASH sem informações vitais.

Para iniciar sua investigação, você deve acessar o banco de dados central das estações espaciais e começar a vasculhar os dados. Mas isso não será fácil. Os sistemas de segurança e criptografia estão ativos, e apenas um investigador com seu nível de habilidade pode decifrá-los.

### Desafios à Frente

Cada etapa da sua jornada apresentará um novo desafio. Você precisará utilizar seus conhecimentos em SQL para navegar pelos registros, filtrando e ordenando dados para encontrar as informações necessárias. A cada pergunta respondida corretamente, você desbloqueará uma nova parte da história, aproximando-se cada vez mais da verdade.

### Enigmas e Revelações

#### Descubra as Estações Offline
1. Para começar sua investigação, selecione todas as informações das estações espaciais. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes;
    ```
2. Filtre as estações que estão offline. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    WHERE status = 'offline';
    ```
3. Encontre as estações que foram construídas após o ano 2040. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    WHERE ano_construcao > 2040;
    ```

#### Investigação de Intrusões
4. Liste as estações offline por ordem de última manutenção. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    WHERE status = 'offline' 
    ORDER BY data_ultima_manutencao;
    ```
5. Ordene as estações pelo número de tripulantes em ordem crescente. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    ORDER BY tripulantes ASC;
    ```
6. Ordene as estações pelo número de tripulantes em ordem decrescente. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    ORDER BY tripulantes DESC;
    ```

#### Manutenção dos Sistemas
7. Liste as estações offline mais recentes primeiro. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    WHERE status = 'offline' 
    ORDER BY data_ultima_manutencao DESC;
    ```
8. Agora, liste as estações offline mais antigas primeiro. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    WHERE status = 'offline' 
    ORDER BY data_ultima_manutencao ASC;
    ```
9. Encontre as estações que tiveram mais de 5 manutenções no último ano. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    WHERE manutencoes_ultimo_ano > 5;
    ```

#### Recursos e Tripulação
10. Selecione apenas as estações localizadas no setor Alfa. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    WHERE setor = 'Alfa';
    ```
11. Liste as estações com capacidade para mais de 100 tripulantes. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    WHERE capacidade_tripulantes > 100;
    ```
12. Ordene as estações pelo consumo de energia em ordem crescente. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    ORDER BY consumo_energia ASC;
    ```

#### Setores Prioritários
13. Ordene as estações pelo consumo de energia em ordem decrescente. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    ORDER BY consumo_energia DESC;
    ```
14. Encontre as estações que relatam problemas críticos. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    WHERE problemas_criticos = 'sim';
    ```
15. Selecione as estações que estão funcionando perfeitamente. Complete a query:
    ```sql
    SELECT * 
    FROM estacoes 
    WHERE status = 'online';
    ```

### Um Fim Incerto

Sua investigação é a última esperança da humanidade. Cada dado descoberto pode ser a chave para a sobrevivência ou o fim. Prepare-se para uma jornada repleta de mistérios, perigos e descobertas. O destino da Terra está em suas mãos.

---

**Prepare-se, Investigador. A jornada começa agora. Boa sorte!**

---
