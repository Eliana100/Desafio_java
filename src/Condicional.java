public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1990; // Declaração e inicialização da variável anoDeLancamento
        boolean incluidoNoPlano = true; // Declaração e inicialização da variável incluidoNoPlano
        double notaDoFilme = 8.1; // Declaração e inicialização da variável notaDoFilme
        String tipoPlano = "plus"; // Declaração e inicialização da variável tipoPlano

        // Verificação do ano de lançamento
        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        // Verificação se o filme está incluído no plano e se o plano é "plus"
        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}

