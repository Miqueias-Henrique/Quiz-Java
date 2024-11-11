import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int acertos = 0;
        int erros = 0;
        int totalq = 15;

        //Cabeçalho
        System.out.println("-----------------------------------------");
        //Faculdade
        System.out.println("Unifan - Centro Universitário Alfredo Nasser.");
        //Nome do Aluno
        for (String s : Arrays.asList("Aluno: Miqueias Henrique Da Silva Carvalho")) {
            //Nome_professor
            System.out.println("Professor: Brenno Pimenta.");
            System.out.println(s);
            System.out.println("-----------------------------------------");


        }

        System.out.println("**");
        System.out.println("* Quiz de 15 perguntas sobre Freakazoid! *");
        System.out.println("**");

        System.out.println("Opa, bem-vindo ao Quiz sobre Freakazoid!, espero que se divirta!");

        Questao q1 = new Questao();
        q1.pergunta = "Pergunta 1: Qual é o verdadeiro nome do Freakazoid?";
        q1.opcaoA = "A) Dexter Douglas";
        q1.opcaoB = "B) Bruce Wayne";
        q1.opcaoC = "C) Clark Kent";
        q1.opcaoD = "D) Peter Parker";
        q1.opcaoE = "E) Wally West";
        q1.correta = "A";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();

        if (q1.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q2 = new Questao();
        q2.pergunta = "Pergunta 2: Qual é a origem do poder do Freakazoid?";
        q2.opcaoA = "A) Um experimento científico";
        q2.opcaoB = "B) Um dispositivo alienígena";
        q2.opcaoC = "C) Um acidente de computador";
        q2.opcaoD = "D) Um feitiço mágico";
        q2.opcaoE = "E) Um legado familiar";
        q2.correta = "C";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        if (q2.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q3 = new Questao();
        q3.pergunta = "Pergunta 3: Qual é o principal vilão que enfrenta o Freakazoid?";
        q3.opcaoA = "A) O Cérebro";
        q3.opcaoB = "B) Dr. Estranho";
        q3.opcaoC = "C) O Incrível Shapiro";
        q3.opcaoD = "D) O Camaleão";
        q3.opcaoE = "E) O Louva-a-Deus";
        q3.correta = "A";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        if (q3.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q4 = new Questao();
        q4.pergunta = "Pergunta 4: Quem é o amigo e parceiro do Freakazoid?";
        q4.opcaoA = "A) Monk";
        q4.opcaoB = "B) Dexter";
        q4.opcaoC = "C) Joe Leal";
        q4.opcaoD = "D) Cosgrove";
        q4.opcaoE = "E) Ciber-Chefe";
        q4.correta = "D";

        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        if (q4.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q5 = new Questao();
        q5.pergunta = "Pergunta 5: Qual é a característica mais notável do Freakazoid?";
        q5.opcaoA = "A) Super força";
        q5.opcaoB = "B) Velocidade sobre-humana";
        q5.opcaoC = "C) Ele é completamente maluco!";
        q5.opcaoD = "D) Invisibilidade";
        q5.opcaoE = "E) Telepatia";
        q5.correta = "C";

        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        if (q5.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q6 = new Questao();
        q6.pergunta = "Pergunta 6: Qual é o animal de estimação do Freakazoid?";
        q6.opcaoA = "A) Um gato";
        q6.opcaoB = "B) Um cachorro";
        q6.opcaoC = "C) Um peixe";
        q6.opcaoD = "D) Um coelho";
        q6.opcaoE = "E) Um rato";
        q6.correta = "E";

        q6.escrevaQuestao();
        resposta = q6.leiaResposta();
        if (q6.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q7 = new Questao();
        q7.pergunta = "Pergunta 7: Qual é o poder especial que o Freakazoid tem sobre os vilões?";
        q7.opcaoA = "A) Telepatia";
        q7.opcaoB = "B) Humor insensato";
        q7.opcaoC = "C) Manipulação do tempo";
        q7.opcaoD = "D) Vôo";
        q7.opcaoE = "E) Força sobre-humana";
        q7.correta = "B";

        q7.escrevaQuestao();
        resposta = q7.leiaResposta();
        if (q7.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q8 = new Questao();
        q8.pergunta = "Pergunta 8: O que o Freakazoid frequentemente grita quando aparece?";
        q8.opcaoA = "A) Hooray!";
        q8.opcaoB = "B) Uau!";
        q8.opcaoC = "C) Freakazoid!";
        q8.opcaoD = "D) Vamos nessa!";
        q8.opcaoE = "E) Eu sou o máximo!";
        q8.correta = "C";

        q8.escrevaQuestao();
        resposta = q8.leiaResposta();
        if (q8.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q9 = new Questao();
        q9.pergunta = "Pergunta 9: Qual é a principal habilidade do Cérebro?";
        q9.opcaoA = "A) Telepatia";
        q9.opcaoB = "B) Controle mental";
        q9.opcaoC = "C) Super força";
        q9.opcaoD = "D) Gênio da tecnologia";
        q9.opcaoE = "E) Transformação em monstro";
        q9.correta = "D";

        q9.escrevaQuestao();
        resposta = q9.leiaResposta();
        if (q9.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q10 = new Questao();
        q10.pergunta = "Pergunta 10: Qual é o tema principal da série Freakazoid?";
        q10.opcaoA = "A) Comédia de super-heróis";
        q10.opcaoB = "B) Mistério e suspense";
        q10.opcaoC = "C) Aventura espacial";
        q10.opcaoD = "D) Drama familiar";
        q10.opcaoE = "E) Fantasia épica";
        q10.correta = "A";

        q10.escrevaQuestao();
        resposta = q10.leiaResposta();
        if (q10.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q11 = new Questao();
        q11.pergunta = "Pergunta 11: Qual é a frase famosa do Cosgrove?";
        q11.opcaoA = "A) Vamos lá, parceiro!";
        q11.opcaoB = "B) Não se preocupe, Freakazoid!";
        q11.opcaoC = "C) Ei, quer comer um cachorro-quente?";
        q11.opcaoD = "D) Não faça nada! ";
        q11.opcaoE = "E) Olá, Freakazoid!";
        q11.correta = "C";

        q11.escrevaQuestao();
        resposta = q11.leiaResposta();
        if (q11.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q12 = new Questao();
        q12.pergunta = "Pergunta 12: Quem é a namorada do Freakazoid?";
        q12.opcaoA = "A) Freakazette";
        q12.opcaoB = "B) Gwen";
        q12.opcaoC = "C) Jennifer";
        q12.opcaoD = "D) Lobe";
        q12.opcaoE = "E) Trixie";
        q12.correta = "A";

        q12.escrevaQuestao();
        resposta = q12.leiaResposta();
        if (q1.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q13 = new Questao();
        q13.pergunta = "Pergunta 13: Qual é o lema do Freakazoid?";
        q13.opcaoA = "A) Poder e Justiça!";
        q13.opcaoB = "B) Ser maluco é divertido!";
        q13.opcaoC = "C) Justiça é feita!";
        q13.opcaoD = "D) Humor é a melhor arma!";
        q13.opcaoE = "E) O que é mais legal?";
        q13.correta = "C";

        q13.escrevaQuestao();
        resposta = q13.leiaResposta();
        if (q13.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q14 = new Questao();
        q14.pergunta = "Pergunta 14: O que o Freakazoid faz quando não está combatendo o crime?";
        q14.opcaoA = "A) Estuda";
        q14.opcaoB = "B) Joga videogame";
        q14.opcaoC = "C) Viajar";
        q14.opcaoD = "D) Trabalha em um escritório";
        q14.opcaoE = "E) Faz piadas o tempo todo";
        q14.correta = "E";

        q14.escrevaQuestao();
        resposta = q14.leiaResposta();
        if (q14.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        //
        Questao q15 = new Questao();
        q15.pergunta = "Pergunta 15: Qual é o nome do assistente do Cérebro?";
        q15.opcaoA = "A) Bob";
        q15.opcaoB = "B) Roger";
        q15.opcaoC = "C) Dork";
        q15.opcaoD = "D) Larry";
        q15.opcaoE = "E) Dave";
        q15.correta = "C";

        q15.escrevaQuestao();
        resposta = q15.leiaResposta();
        if (q15.isCorreta(resposta)) {
            acertos++;
        } else {
            erros++;
        }
        double totalp = (double) acertos/(double) totalq * 100.0;
        System.out.println("------------------------------------------------------------------");
        System.out.println("        Parabéns você respondeu todas as perguntas do quiz!       ");
        System.out.println("Total de acertos:" + acertos);
        System.out.println("Total de erros:" + erros);
        System.out.printf("Total de acertos em porcentagem:= %.2f %n",  (totalp / 3));
        System.out.println("------------------------------------------------------------------");




    }
}