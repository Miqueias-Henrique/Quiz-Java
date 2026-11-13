import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exibirCabecalho();

        List<Questao> questoes = criarQuestoes();
        int acertos = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            for (Questao questao : questoes) {
                questao.exibir();
                String resposta = questao.lerResposta(scanner);
                if (questao.isCorreta(resposta)) {
                    acertos++;
                }
            }
        }

        exibirResultado(acertos, questoes.size());
    }

    private static void exibirCabecalho() {
        System.out.println("-----------------------------------------");
        System.out.println("Unifan - Centro Universitário Alfredo Nasser");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Aluno: Miqueias Henrique Da Silva Carvalho");
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("* Quiz de 15 perguntas sobre Freakazoid *");
        System.out.println("Bem-vindo ao quiz! Responda digitando a letra correspondente.");
        System.out.println();
    }

    private static void exibirResultado(int acertos, int totalQuestoes) {
        int erros = totalQuestoes - acertos;
        double percentual = (double) acertos / totalQuestoes * 100.0;
        System.out.println("------------------------------------------------------------------");
        System.out.println("Quiz finalizado!");
        System.out.println("Total de acertos: " + acertos);
        System.out.println("Total de erros: " + erros);
        System.out.printf("Aproveitamento: %.2f%%%n", percentual);
        System.out.println("------------------------------------------------------------------");
    }

    private static List<Questao> criarQuestoes() {
        return List.of(
                new Questao(
                        "Pergunta 1: Qual é o verdadeiro nome do Freakazoid?",
                        List.of(
                                "A) Dexter Douglas",
                                "B) Bruce Wayne",
                                "C) Clark Kent",
                                "D) Peter Parker",
                                "E) Wally West"
                        ),
                        "A"
                ),
                new Questao(
                        "Pergunta 2: Qual é a origem do poder do Freakazoid?",
                        List.of(
                                "A) Um experimento científico",
                                "B) Um dispositivo alienígena",
                                "C) Um acidente de computador",
                                "D) Um feitiço mágico",
                                "E) Um legado familiar"
                        ),
                        "C"
                ),
                new Questao(
                        "Pergunta 3: Qual é o principal vilão que enfrenta o Freakazoid?",
                        List.of(
                                "A) O Cérebro",
                                "B) Dr. Estranho",
                                "C) O Incrível Shapiro",
                                "D) O Camaleão",
                                "E) O Louva-a-Deus"
                        ),
                        "A"
                ),
                new Questao(
                        "Pergunta 4: Quem é o amigo e parceiro do Freakazoid?",
                        List.of(
                                "A) Monk",
                                "B) Dexter",
                                "C) Joe Leal",
                                "D) Cosgrove",
                                "E) Ciber-Chefe"
                        ),
                        "D"
                ),
                new Questao(
                        "Pergunta 5: Qual é a característica mais notável do Freakazoid?",
                        List.of(
                                "A) Super força",
                                "B) Velocidade sobre-humana",
                                "C) Ele é completamente maluco!",
                                "D) Invisibilidade",
                                "E) Telepatia"
                        ),
                        "C"
                ),
                new Questao(
                        "Pergunta 6: Qual é o animal de estimação do Freakazoid?",
                        List.of(
                                "A) Um gato",
                                "B) Um cachorro",
                                "C) Um peixe",
                                "D) Um coelho",
                                "E) Um rato"
                        ),
                        "E"
                ),
                new Questao(
                        "Pergunta 7: Qual é o poder especial que o Freakazoid tem sobre os vilões?",
                        List.of(
                                "A) Telepatia",
                                "B) Humor insensato",
                                "C) Manipulação do tempo",
                                "D) Voo",
                                "E) Força sobre-humana"
                        ),
                        "B"
                ),
                new Questao(
                        "Pergunta 8: O que o Freakazoid frequentemente grita quando aparece?",
                        List.of(
                                "A) Hooray!",
                                "B) Uau!",
                                "C) Freakazoid!",
                                "D) Vamos nessa!",
                                "E) Eu sou o máximo!"
                        ),
                        "C"
                ),
                new Questao(
                        "Pergunta 9: Qual é a principal habilidade do Cérebro?",
                        List.of(
                                "A) Telepatia",
                                "B) Controle mental",
                                "C) Super força",
                                "D) Gênio da tecnologia",
                                "E) Transformação em monstro"
                        ),
                        "D"
                ),
                new Questao(
                        "Pergunta 10: Qual é o tema principal da série Freakazoid?",
                        List.of(
                                "A) Comédia de super-heróis",
                                "B) Mistério e suspense",
                                "C) Aventura espacial",
                                "D) Drama familiar",
                                "E) Fantasia épica"
                        ),
                        "A"
                ),
                new Questao(
                        "Pergunta 11: Qual é a frase famosa do Cosgrove?",
                        List.of(
                                "A) Vamos lá, parceiro!",
                                "B) Não se preocupe, Freakazoid!",
                                "C) Ei, quer comer um cachorro-quente?",
                                "D) Não faça nada!",
                                "E) Olá, Freakazoid!"
                        ),
                        "C"
                ),
                new Questao(
                        "Pergunta 12: Quem é a namorada do Freakazoid?",
                        List.of(
                                "A) Freakazette",
                                "B) Gwen",
                                "C) Jennifer",
                                "D) Lobe",
                                "E) Trixie"
                        ),
                        "A"
                ),
                new Questao(
                        "Pergunta 13: Qual é o lema do Freakazoid?",
                        List.of(
                                "A) Poder e Justiça!",
                                "B) Ser maluco é divertido!",
                                "C) Justiça é feita!",
                                "D) Humor é a melhor arma!",
                                "E) O que é mais legal?"
                        ),
                        "C"
                ),
                new Questao(
                        "Pergunta 14: O que o Freakazoid faz quando não está combatendo o crime?",
                        List.of(
                                "A) Estuda",
                                "B) Joga videogame",
                                "C) Viaja",
                                "D) Trabalha em um escritório",
                                "E) Faz piadas o tempo todo"
                        ),
                        "E"
                ),
                new Questao(
                        "Pergunta 15: Qual é o nome do assistente do Cérebro?",
                        List.of(
                                "A) Bob",
                                "B) Roger",
                                "C) Dork",
                                "D) Larry",
                                "E) Dave"
                        ),
                        "C"
                )
        );
    }
}
