import java.util.Scanner;

public class Comparacao { // Nome da classe sem acento
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um numero negativo ou positivo: ");
            double numero01 = leitor.nextDouble();
            System.out.println("Digite outro numero, positivo ou negativo: ");
            double numero02 = leitor.nextDouble();

            if (numero01 < 0) {
                System.out.println("O primeiro número é negativo");
            }
            else if (numero01 == 0){
                System.out.println("O numero é zero");
            }
            else {
                System.out.println("O primeiro número é positivo");
            }

            if (numero02 < 0) {
                System.out.println("O segundo número é negativo");
            }
            else if (numero02 == 0){
                System.out.println("O numero é zero");
            }
            else {
                System.out.println("O segundo número é positivo");
            }
        }
    }
}
