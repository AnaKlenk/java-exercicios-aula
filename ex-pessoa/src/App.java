public class App {
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa();
        p1.nome = "Ana";
        p1.idade = 20;
       
        p1.comer("manga");
        p1.pararComer();
        p1.falar();
    }
}
