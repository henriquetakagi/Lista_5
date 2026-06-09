public class Main {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);
        cc.sacar(200);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(100);
        cp.sacar(100);
    }
}