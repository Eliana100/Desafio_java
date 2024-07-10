import java.util.Scanner; // Importando a classe Scanner do pacote java.util

public class Leitura { // Declarando uma classe chamada Leitura

    public static void main(String[] args)
        // public: significa que o método pode ser acessado de qualquer lugar
        // static: significa que você não precisa criar uma instância (ou um objeto) da classe Leitura para executar este método
        // void: significa que este método não retorna nenhum valor
        // main: é o nome do método especial que o Java procura quando inicia o programa
        // Este é o ponto de partida do programa


        {
            Scanner Leitura = new Scanner(System.in); // Cria um novo objeto Scanner para ler a entrada do usuário

            System.out.println("Digite seu Filme favorito"); // Exibe uma mensagem pedindo para o usuário digitar seu filme favorito
            String filme = Leitura.nextLine(); // Lê a linha de texto digitada pelo usuário e armazena na variável 'filme'

            System.out.println(filme); // Exibe o filme que o usuário digitou

            System.out.println("Digite o ano de lançamento do filme"); // Exibe uma mensagem pedindo para o usuário digitar o ano de lançamento do filme
            int anoDeLancamento = Leitura.nextInt(); // Lê o próximo número inteiro digitado pelo usuário e armazena na variável 'anoDeLancamento'

            System.out.println(anoDeLancamento); // Exibe o ano de lançamento que o usuário digitou

            Leitura.close(); // Fecha o Scanner para liberar recursos
        }
    }//Este c&oacute;digo l&ecirc; o nome do filme favorito do usu&aacute;rio e o ano de lan&ccedil;amento, exibindo ambas as entradas no console.
