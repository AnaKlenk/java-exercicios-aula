public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if(preco > 0){
            this.preco = preco;
        }
        else{
            System.out.println("Preço não pode ser valor negativo.");
        }
        
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;

        }
        else{
            System.out.println("Quantidade não pode ser menor que zero.");
    }

    }
    public double valorTotalEmEstoque(){   
        double valorTotal = this.getPreco() * this.getQuantidade();
        return valorTotal;
    }
    public void adicionarEstoque(int quantidade){
        this.setQuantidade(getQuantidade() + quantidade);
    }
    public void removerEstoque(int quantidade){
        this.setQuantidade(this.getQuantidade() - quantidade);
    }
}

// com validação: atributos preço e quantidade não podem ser negativos.