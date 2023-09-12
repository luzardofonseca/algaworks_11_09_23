public class Conta {
    String nomeTitular;
    int agencia;
    int numero;
    double saldo;

    void depositar(double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Saldo não pode ser menor que 0");
        }
        saldo = saldo + valor;
    }

    void sacar(double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Saldo não pode ser menor que 0");
        }
        if (saldo - valor < 0){
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo = saldo - valor;
    }
}
