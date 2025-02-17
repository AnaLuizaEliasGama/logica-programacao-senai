import java.util.Scanner;

// Desconto no Produto
// Um cliente recebe um desconto se for membro VIP OU se o valor da compra for maior que 500 reais.
// O programa deve verificar se o cliente recebe o desconto.

public class ExercicioDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner

        // Solicita o preço da compra
        System.out.print("Entre com o preço: R$ ");
        float preco = scanner.nextFloat();

        // Limpa o buffer do teclado
        scanner.nextLine();

        // Solicita se o cliente é membro VIP
        System.out.print("O cliente é membro VIP? (S/N): ");
        char respostaVIP = scanner.next().charAt(0);

        // Verifica se o cliente recebe desconto
        if (preco > 500 || respostaVIP == 'S' || respostaVIP == 's') {
            System.out.println("O cliente tem direito ao desconto!");
        } else {
            System.out.println("O cliente NÃO tem direito ao desconto.");
        }

        scanner.close(); // Fecha o objeto Scanner
    }
}