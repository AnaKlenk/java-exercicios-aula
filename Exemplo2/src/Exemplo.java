public class Exemplo {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.destampar();
        c1.rasbicar();

        Caneta c2 = new Caneta();
        c2.cor = "preta";
        c2.ponta = 0.7f;
        c2.tampada = true;
        c2.status();
        c2.rasbicar();



    }
}
