public class App {
    public static void main(String[] args) throws Exception {
        Produtos p1 = new Produtos();

        p1.setNome("mouse");
        p1.setPreco(117.8);
        p1.setQuantidade(8);

        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preco: " + p1.getPreco());
        System.out.println("Quantidade: " + p1.getQuantidade());
        System.out.println("Valor total: " + p1.valorTotalEmEstoque());
        p1.adicionarEstoque(5);
        p1.removerEstoque(3);
        System.out.println("Quantidade atual: " + p1.getQuantidade());
    }
}
