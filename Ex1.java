import java.util.Scanner;

public class Ex1 {
    // Função para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        } else if (numero == 2) {
            return true;
        } else if (numero % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(numero); i += 2) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é primo e exibe a saída correspondente
        if (ehPrimo(numero)) {
            System.out.println("Resultado: O número " + numero + " é primo.");
        } else {
            System.out.println("Resultado: O número " + numero + " não é primo.");
        }
    }
}
