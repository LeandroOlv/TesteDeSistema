import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> listaNumeros = new ArrayList<>();

        // Solicita ao usuário que insira os números da lista
        System.out.print("Digite os números da lista separados por espaços (ex: 5 10 15 20): ");
        String entrada = scanner.nextLine();
        String[] numeros = entrada.split(" ");

        // Verifica se a lista está vazia
        if (numeros.length == 0) {
            System.out.println("Resultado: A lista está vazia, não é possível calcular a média.");
            return;
        }

        // Converte os números de string para double e adiciona à lista
        for (String numero : numeros) {
            try {
                double num = Double.parseDouble(numero);
                listaNumeros.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida, um dos valores não é um número válido.");
                return;
            }
        }

        // Calcula a média dos números na lista
        double soma = 0;
        for (double numero : listaNumeros) {
            soma += numero;
        }
        double media = soma / listaNumeros.size();

        // Exibe o resultado
        System.out.printf("Resultado: A média dos números é %.2f%n", media);
    }
}
