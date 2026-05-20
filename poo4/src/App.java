public class App {
    public static void main(String[] args) throws Exception {
        Livro l1 = new Livro(); 

        l1.titulo = "OI";
        l1.nome = "hoje";
        l1.ano = 2026;
        l1.exibirInfo();
    }
}
// Crie uma classe Livro com os atributos titulo (String), autor (String) e ano (int) e o método exibirInfo()
// para apresentar na tela os dados do livro. No programa principal, instancie 2 livros à sua escolha