import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira os números na lista
        System.out.println("Digite os números separados por espaços:");
        String input = scanner.nextLine();
        
        // Divide a entrada em uma matriz de strings
        String[] numerosStr = input.split(" ");
        
        // Cria uma lista para armazenar os números pares
        ArrayList<Integer> numerosPares = new ArrayList<>();
        
        // Variável para armazenar a soma dos números pares
        int somaPares = 0;
        
        // Converte cada string em um número inteiro e verifica se é par
        for (String numeroStr : numerosStr) {
            int numero = Integer.parseInt(numeroStr);
            if (numero % 2 == 0) {
                numerosPares.add(numero);
                somaPares += numero;
            }
        }
        
        // Verifica se há números pares na lista
        if (numerosPares.isEmpty()) {
            System.out.println("Resultado: A lista não contém números pares.");
        } else {
            System.out.println("Resultado: A soma dos números pares é " + somaPares + ".");
        }
        
        scanner.close();
    }
}
