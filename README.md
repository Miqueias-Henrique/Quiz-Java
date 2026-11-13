# Quiz-Java

Aplicação de linha de comando em Java desenvolvida para a disciplina de Algoritmos e Programação (UNIFAN). O programa apresenta um quiz interativo de 15 perguntas de múltipla escolha sobre a série *Freakazoid*, valida as entradas do usuário e exibe a pontuação final com percentual de acertos.

## Estrutura

```
src/
├── Main.java      # Fluxo do quiz, lista de questões e cálculo do resultado
└── Questao.java   # Modelo da questão, exibição, leitura e validação de resposta
```

## Como executar

Requer JDK 11 ou superior.

```bash
javac -d out src/*.java
java -cp out Main
```

## Funcionamento

- Cada questão aceita opções de `A` a `E` (maiúsculas ou minúsculas).
- Entradas inválidas solicitam nova digitação até receber uma alternativa válida.
- Ao final das 15 questões, o terminal exibe o total de acertos, erros e o percentual de aproveitamento.
