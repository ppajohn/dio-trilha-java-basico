import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Configurando o locale para usar ponto como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar e ler os dados da conta
        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta !");
        double saldo = scanner.nextDouble();
        
        // Fechar o scanner
        scanner.close();
        
        // Exibir a mensagem final
        System.out.println("Olá " + nomeCliente + 
                         ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                         ", conta " + numero + 
                         " e seu saldo " + saldo + 
                         " já está disponível para saque");
    }
}