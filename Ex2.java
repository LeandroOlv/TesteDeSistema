import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite a frase
        System.out.print("Frase: ");
        String frase = scanner.nextLine();

        // Converter a frase para letras minúsculas para facilitar a contagem
        frase = frase.toLowerCase();

        // Inicializar contador de vogais
        int contadorVogais = 0;

        // Loop através de cada caractere da frase para contar vogais
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        // Exibir resultado
        if (contadorVogais > 0) {
            System.out.println("Resultado: A frase possui " + contadorVogais + " vogais.");
        } else {
            System.out.println("Resultado: A frase não possui vogais.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
