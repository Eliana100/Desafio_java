import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número positivo ou negativo: ");
        int numero = leitor.nextInt();

        if(numero < 0){
            System.out.println("Este número é negativo");
        } else if (numero == 0) {
            System.out.println("Este é o número 0 ");
        } else {
            System.out.println("Este número é positivo");
        } leitor.close();
    }
}
