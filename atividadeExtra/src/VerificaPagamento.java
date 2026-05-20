import java.util.Scanner;

public class VerificaPagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Data prevista do pagamento (dd/mm/aaaa): ");
        String dataPrevista = sc.next();

        System.out.print("Data do pagamento (dd/mm/aaaa): ");
        String dataPagamento = sc.next();

        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        int diaPrev  = Integer.parseInt(dataPrevista.substring(0, 2));
        int mesPrev  = Integer.parseInt(dataPrevista.substring(3, 5));
        int anoPrev  = Integer.parseInt(dataPrevista.substring(6, 10));

        int diaPag   = Integer.parseInt(dataPagamento.substring(0, 2));
        int mesPag   = Integer.parseInt(dataPagamento.substring(3, 5));
        int anoPag   = Integer.parseInt(dataPagamento.substring(6, 10));

        int totalPrev = (anoPrev - 1) * 365 + (mesPrev - 1) * 30 + diaPrev;
        int totalPag  = (anoPag - 1) * 365 + (mesPag - 1) * 30 + diaPag;

        int atraso = totalPag - totalPrev;

        if (atraso <= 0) {
            System.out.println("\nPagamento realizado no prazo.");
            System.out.printf("Valor final: R$ %.2f%n", valor);
        } else {
            double juros = valor * 0.02;
            double total = valor + juros;

            System.out.println("\nPagamento em atraso.");
            System.out.println("Dias de atraso: " + atraso);
            System.out.printf("Juros: R$ %.2f%n", juros);
            System.out.printf("Valor final: R$ %.2f%n", total);
        }

        sc.close();
    }
}