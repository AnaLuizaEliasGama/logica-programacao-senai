import java.util.Scanner; // Importa a classe Scanner

public class cartera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner
        System.out.println("Exercícios");

        // Maioridade e Carteira de Motorista
        // O programa deve verificar se uma pessoa pode dirigir.
        // Para isso, a idade deve ser 18 anos ou mais e ela deve ter uma carteira de motorista válida.

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();


        // Verifica se a idade é maior ou igual a 18
        if (idade >= 18) {
            System.out.print("Você tem carteira de motorista válida? (S/N): ");
            char resposta = scanner.next().charAt(0); // Lê a primeira letra da resposta

            // Verifica se a resposta é 'S' ou 's'
            if (resposta == 'S' || resposta == 's') {
                System.out.println("Você pode dirigir!");
            } else {
                System.out.println("Você NÃO pode dirigir porque não possui carteira de motorista válida.");
            }
        } else {
            System.out.println("Você NÃO pode dirigir porque é menor de 18 anos.");
        }

        scanner.close(); // Fecha o objeto Scanner
    }
}