import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (ePalindromo(palavra)) {
            System.out.println("Resultado: A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("Resultado: A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }

    public static boolean ePalindromo(String palavra) {
        // Remove espaços em branco e converte a palavra para letras minúsculas
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        int tamanho = palavra.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
