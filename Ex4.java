import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Dividir a frase em palavras usando espaços como delimitador
        String[] palavras = frase.trim().split("\\s+");

        if (palavras.length > 0 && !palavras[0].isEmpty()) {
            System.out.println("Resultado: A frase possui " + palavras.length + " palavras.");
        } else {
            System.out.println("Resultado: A frase não possui palavras.");
        }

        scanner.close();
    }
}
