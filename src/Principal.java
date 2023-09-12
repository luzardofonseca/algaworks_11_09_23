
public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Conta suaConta = new Conta();

        conta.depositar(15_000);
        suaConta.depositar(20_000);
        conta.sacar(1_000);
        conta.sacar(20_000);

        System.out.println("saldo" + conta.saldo);
        System.out.println("saldo" + suaConta.saldo);

    }
}
