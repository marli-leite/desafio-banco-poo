
public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(Cliente titular, double limiteChequeEspecial) {
        super(titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente,incluindo cheque especial!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}