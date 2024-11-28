// Interface ContaBancaria
interface ContaBancaria {
    void depositar(double valor);

    void sacar(double valor);

    double consultarSaldo();
}

// Classe ContaCorrente
class ContaCorrente implements ContaBancaria {
    private String titular;
    private double saldo;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0; // Saldo inicial
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depoistado: R$ " + ".  + Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque inválido. Verifique o valor.");
        } else {
            System.out.println("Saque inválido. Verifique o valor.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

}

// Classe Principal
public class Exe_conta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaCorrente("João Silva");

        conta.depositar(1000);
        conta.sacar(300);
        System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
        conta.sacar(800);
        conta.depositar(-50);
    }
}