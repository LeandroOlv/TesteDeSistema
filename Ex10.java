import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        scanner.close();

        if (validarSenha(senha)) {
            System.out.println("Resultado: A senha é válida.");
        } else {
            System.out.println("Resultado: A senha é inválida.");
        }
    }

    public static boolean validarSenha(String senha) {
        // Verificar o comprimento da senha
        if (senha.length() < 8) {
            return false;
        }

        // Verificar se há pelo menos uma letra maiúscula e uma letra minúscula
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        for (char caractere : senha.toCharArray()) {
            if (Character.isUpperCase(caractere)) {
                temMaiuscula = true;
            } else if (Character.isLowerCase(caractere)) {
                temMinuscula = true;
            }
        }

        // Verificar se há pelo menos um número
        boolean temNumero = false;
        for (char caractere : senha.toCharArray()) {
            if (Character.isDigit(caractere)) {
                temNumero = true;
            }
        }

        // Retornar verdadeiro apenas se todos os critérios forem atendidos
        return temMaiuscula && temMinuscula && temNumero;
    }
}
