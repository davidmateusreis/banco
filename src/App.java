public class App {
    public static void main(String[] args) throws Exception {

        Titular titular = new Titular();
        titular.setNome("David Mateus");

        Conta contaCorrente = new ContaCorrente(titular, 1111, 0001, 100.0);

        contaCorrente.imprimirExtrato();

        contaCorrente.depositar(200);

        contaCorrente.imprimirExtrato();

        contaCorrente.sacar(100);

        contaCorrente.imprimirExtrato();

        Conta contaPoupanca = new ContaPoupanca(titular, 2222, 0001, 1000.0);

        contaPoupanca.imprimirExtrato();

        contaCorrente.transferir(contaPoupanca, 50);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaPoupanca.sacar(200);
        contaPoupanca.imprimirExtrato();

        contaPoupanca.transferir(contaCorrente, 600);
        contaPoupanca.imprimirExtrato();
    }
}
