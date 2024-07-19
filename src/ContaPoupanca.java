
public class ContaPoupanca extends Conta {

    private double taxaRendimento;


    public ContaPoupanca(Cliente titular, double taxaRendimento) {
        super(titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}