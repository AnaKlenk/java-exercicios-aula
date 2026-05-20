public class Conta {
    public static void main(String[] args) throws Exception {
        ContaBanco p1 = new ContaBanco();

        p1.setNome("Ana Julia");
        p1.setNumConta(1111);
        p1.setTipo("CC");
        p1.abrirConta();
        p1.depositar(200);
        p1.sacar(250);
        p1.fecharConta();

        p1.statusAtual();
    }
}

// A Classe vai ter:
// +numConta            +abrirConta()
// #tipo                        +fecharConta()
// -dono                      +depositar()     
// -saldo                      +sacar()
// -status                     +pagarMensal()

// 1 - Tipo da conta vai aceitar apenas 2 valores, ou poupança ou corrente: cc > corrente e cp > poupança
// 2 - Método de abrir conta, na hora de abrir a conta eu mudo o status para verdadeiro, se a conta estiver fechada é falso. Na hora de criar uma conta, voce vai declarar se ela é corrente ou poupança. Se for corrente ele ganha 50 R$, se for poupança ele começa com R$ 150.
// 3 - Método fechar conta, para fechar conta ele não pode ter dinheiro lá dentro, nem debito.
// 4 - Método depositar, para fazer um depósito ela tem que estar aberta.
// 5 -  Método sacar, também tem que estar aberta e também terá que ter saldo para fazer o saque.
// 6 - Método de pagar mensalidade, no momento que chamar a mensalidade será cobrada do saldo, cada vez que o metodo for chamado o cliente da CC vai pagar 12 reais de mensalidade e poupança 20REais

// Atributo numero da conta, terá getnumConta e setnumConta(), todos atributos terão get ou setter.

// Também teremos um método construtor, nesse método sempre que uma nova conta for criada o seu status vai ser definido como fechada e o saldo como 0.