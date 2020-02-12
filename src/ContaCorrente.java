public class ContaCorrente extends ContaPoupanca implements Conta {
    private double chequeEspecial;
    private String bancoEmissor;
    private String dataPgto;

    public ContaCorrente(Cliente cliente, double saldo, double juros, double chequeEspecial) {
        super(cliente, saldo, juros);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String bancoEmissor) {
        this.bancoEmissor = bancoEmissor;
    }

    public String getDataPgto() {
        return dataPgto;
    }

    public void setDataPgto(String dataPgto) {
        this.dataPgto = dataPgto;
    }

    @Override
    public void depositar(double dinheiro) {
        super.depositar(dinheiro);
    }

    @Override
    public void sacar(double dinheiro) {
        if (this.getSaldo() > 0) {
            super.sacar(dinheiro);
        } else if (getSaldo() <= 0 && getChequeEspecial() > 0) {
            this.setSaldo(getSaldo() - dinheiro);
            this.setChequeEspecial(getChequeEspecial() - dinheiro);
            System.out.println(String.format(
                    "Saque realizado com sucesso! Saldo atual: R$ %.2f (Saldo Cheque Especial: R$ %.2f)",
                    this.getSaldo(), this.getChequeEspecial()));
        } else {
            System.out.println("Operação inválida!");
        }
    }

    public void depositarCheque(double valorCheque, String bancoEmissor, String dataPgto) {
        if (valorCheque > 0) {
            this.setSaldo(getSaldo() + valorCheque);
            this.setBancoEmissor(bancoEmissor);
            this.setDataPgto(dataPgto);

            System.out.println(String.format("Saque realizado com sucesso! Saldo atual: R$ %.2f", getSaldo()));
        } else {
            System.out.println("Cheque inválido!");
        }
    }
}
