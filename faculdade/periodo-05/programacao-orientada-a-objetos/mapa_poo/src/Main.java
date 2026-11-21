public class Main {
  public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Matheus", 1, 1000);
        System.out.println(conta);

        conta.depositar(140);

        conta.sacar(1000);
        System.out.printf("Saldo atual: R$%.2f\n", conta.getSaldo());

        conta.depositar(-123);
        conta.sacar(123405);
        conta.sacar(-3254);
    }
}
