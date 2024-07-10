import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            double mediaAvaliacao = 0;
            double nota = 0;

            for (int i = 0; i < 3; i++) {
                System.out.println("Diga sua avaliação para o filme:");
                nota = leitura.nextDouble();
                mediaAvaliacao += nota; // Significa que ele recebe o que ele já tinha, mais a nota
            }
            System.out.println("Média de avaliação: " + mediaAvaliacao / 3);
        }
    }
}

