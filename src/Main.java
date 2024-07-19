public class Main {
    public static void main(String[] args) {
        Cliente marli = new Cliente();
        marli.setNome("Marli");

        ContaCorrente cc = new ContaCorrente(marli, 1000);
        ContaPoupanca cp = new ContaPoupanca(marli, 0.05);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.depositar(100);
        cc.transferir(100, cp);
        cc.sacar(100);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cp.aplicarRendimento();
        cp.imprimirExtrato();
    }
}
