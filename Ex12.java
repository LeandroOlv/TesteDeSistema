public class Ex12 {
    private double saldo;

    public Ex12(double saldoInicial) {
        saldo = saldoInicial;
    }

    public void deposito(double valor) {
        saldo += valor;
    }

    public boolean saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
            return false;
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        // Cenário 1: Depósito e Saque Bem Sucedidos
        Ex12 banco1 = new Ex12(500);
        banco1.deposito(200);
        if (banco1.saque(100)) {
            System.out.println("Resultado: Saldo atual: R$" + banco1.verificarSaldo());
        }

        // Cenário 2: Tentativa de Saque com Saldo Insuficiente
        Ex12 banco2 = new Ex12(100);
        if (banco2.saque(200)) {
            System.out.println("Resultado: Saldo atual: R$" + banco2.verificarSaldo());
        }
    }
}
