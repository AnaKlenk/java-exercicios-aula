public class Livro {
    public String titulo;
    public String nome;
    public int ano;

    public void exibirInfo(){
        System.out.println("Nome do livro: " + this.getTitulo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Autor: " + this.getNome());
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
// Crie uma classe Livro com os atributos titulo (String), autor (String) e ano (int) e o método exibirInfo()
// para apresentar na tela os dados do livro. No programa principal, instancie 2 livros à sua escolha
