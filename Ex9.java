import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        
        long fatorial = calcularFatorial(numero);
        
        System.out.println("Resultado: O fatorial de " + numero + " é " + fatorial);
        
        scanner.close();
    }
    
    public static long calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        
        return resultado;
    }
}
