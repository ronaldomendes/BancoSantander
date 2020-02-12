public class Main {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente(1, "Godofredo", "Souza", "423420868", "32254248643");
        Cliente cliente02 = new Cliente(1, "Creuza", "Silva", "423909868", "32254294129");

        ContaPoupanca cp01 = new ContaPoupanca(cliente01, 500, 0.05); // valor juros em decimal
        ContaCorrente cc01 = new ContaCorrente(cliente02, 50, 1, 500);

        System.out.println("--- Conta Poupança ---");
        cp01.consultarSaldo();
        cp01.depositar(20);
        cp01.sacar(350);
        cp01.recolherJuros();

        System.out.println("\n--- Conta Corrente ---");
        cc01.consultarSaldo();
        cc01.sacar(50);
        cc01.depositarCheque(10, "Banco ABC", "12/02/2020");
        cc01.sacar(10);
        cc01.sacar(100);
        cc01.sacar(399);
        cc01.sacar(400);
    }
}
