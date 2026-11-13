import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Questao {
    private static final Set<String> OPCOES_VALIDAS = Set.of("A", "B", "C", "D", "E");

    private final String pergunta;
    private final List<String> opcoes;
    private final String correta;

    public Questao(String pergunta, List<String> opcoes, String correta) {
        this.pergunta = Objects.requireNonNull(pergunta);
        this.opcoes = List.copyOf(Objects.requireNonNull(opcoes));
        this.correta = Objects.requireNonNull(correta).toUpperCase(Locale.ROOT);
    }

    public boolean isCorreta(String resposta) {
        if (resposta != null && resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns, resposta correta! Letra: " + this.correta);
            System.out.println();
            return true;
        }
        System.out.println("Resposta errada! A opção correta é a letra: " + this.correta);
        System.out.println();
        return false;
    }

    public String lerResposta(Scanner scanner) {
        while (true) {
            System.out.print("Digite a resposta (A-E): ");
            if (!scanner.hasNext()) {
                return "";
            }
            String resposta = scanner.next().trim().toUpperCase(Locale.ROOT);
            if (OPCOES_VALIDAS.contains(resposta)) {
                return resposta;
            }
            System.out.println("Resposta inválida! Digite uma opção entre A, B, C, D ou E.");
            System.out.println();
        }
    }

    public void exibir() {
        System.out.println(this.pergunta);
        System.out.println();
        for (String opcao : this.opcoes) {
            System.out.println(opcao);
        }
        System.out.println();
    }
}
