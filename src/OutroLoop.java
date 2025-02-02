import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            double mediaAvaliacao = 0;
            double nota = 0;
            int totalDeNotas = 0; // Mudança para int, pois é um contador

            while (nota != -1) {
                System.out.println("Diga sua avaliação para o filme ou -1 para encerrar: ");
                nota = leitura.nextDouble();

                if (nota != -1) {
                    mediaAvaliacao += nota;
                    totalDeNotas++; // Incrementa o contador de avaliações
                }
            }

            if (totalDeNotas > 0) {
                System.out.println("Média de avaliações: " + (mediaAvaliacao / totalDeNotas));
            } else {
                System.out.println("Nenhuma avaliação foi fornecida.");
            }
        }
    }
}

