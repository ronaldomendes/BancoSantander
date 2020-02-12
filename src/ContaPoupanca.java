public class ContaPoupanca implements Conta {
    private Cliente cliente;
    private double saldo;
    private double juros;

    public ContaPoupanca(Cliente cliente, double saldo, double juros) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.juros = juros;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public void depositar(double dinheiro) {
        if (dinheiro > 0) {
            this.setSaldo(getSaldo() + dinheiro);
            System.out.println(String.format("Depósito realizado com sucesso! Saldo atual: R$ %.2f", this.getSaldo()));
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    @Override
    public void sacar(double dinheiro) {
        if (this.getSaldo() >= dinheiro) {
            this.setSaldo(getSaldo() - dinheiro);
            System.out.println(String.format("Saque realizado com sucesso! Saldo atual: R$ %.2f", this.getSaldo()));
        } else {
            System.out.println("Valor de saque inválido!");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println(String.format("Seu saldo atual é: R$ %.2f", this.getSaldo()));
    }

    public void recolherJuros() {
        this.setSaldo(getSaldo() - getJuros());
        System.out.println(String.format("Seu saldo atual é: R$ %.2f", this.getSaldo()));
    }
}
