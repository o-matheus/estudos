public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("O valor depositado tem que ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if(valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else if (valor <= 0) {
            System.out.println("O valor sacado tem que ser maior que zero.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return String.format("Titular: %s | Número da conta: %d | Saldo: R$%.2f", this.titular, this.numeroConta, this.saldo);
    }
}
