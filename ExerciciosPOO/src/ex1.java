public class ex1 {
    public static void main(String[] args) throws Exception {
        ContaBancaria c1 = new ContaBancaria();

        c1.titular = "Ana";
        c1.saldo = 0;
        c1.status();
        c1.depositar();
        c1.sacar();

    }
}
