public class Conta implements IConta {

    protected Titular titular;
    protected int numero;
    protected int agencia;
    protected double saldo;

    public Conta(Titular titular, int numero, int agencia, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(
                "A conta " + numero + " de " + titular.getNome() + " na agência " + agencia + " tem o saldo de "
                        + saldo + " reais!");
    }
}
