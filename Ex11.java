import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        String[] palavras = {"elefante", "banana", "computador", "programacao", "girafa"};
        Random rand = new Random();
        String palavraEscolhida = palavras[rand.nextInt(palavras.length)];
        int maxTentativas = 6;
        int tentativas = 0;
        boolean palavraAdivinhada = false;
        StringBuilder palavraDescoberta = new StringBuilder("_".repeat(palavraEscolhida.length()));

        System.out.println("Bem-vindo ao Jogo da Forca!");
        System.out.println("Adivinhe a palavra: " + palavraDescoberta.toString());

        Scanner scanner = new Scanner(System.in);

        while (tentativas < maxTentativas && !palavraAdivinhada) {
            System.out.print("Tentativa " + (tentativas + 1) + " - Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            if (palavraEscolhida.contains(String.valueOf(letra))) {
                System.out.println("Letra correta!");
                for (int i = 0; i < palavraEscolhida.length(); i++) {
                    if (palavraEscolhida.charAt(i) == letra) {
                        palavraDescoberta.setCharAt(i, letra);
                    }
                }
                System.out.println("Palavra: " + palavraDescoberta.toString());
                if (!palavraDescoberta.toString().contains("_")) {
                    palavraAdivinhada = true;
                    System.out.println("Parabéns, você adivinhou a palavra!");
                }
            } else {
                tentativas++;
                System.out.println("Letra incorreta. Tentativas restantes: " + (maxTentativas - tentativas));
            }
        }

        if (!palavraAdivinhada) {
            System.out.println("Você esgotou suas tentativas. A palavra era: " + palavraEscolhida);
        }

        scanner.close();
    }
}
