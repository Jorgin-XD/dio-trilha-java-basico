import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            


            // Solicita o número da conta
            System.out.println("Por favor, digite o número da Conta!");
            int numero = scanner.nextInt();
    
            // Limpa o buffer do scanner
            scanner.nextLine();
    
            // Solicita a agência
            System.out.println("Por favor, digite o número da Agência!");
            String agencia = scanner.nextLine();
    
            // Solicita o nome do cliente
            System.out.println("Por favor, digite o seu Nome!");
            String nomeCliente = scanner.nextLine();
    
            // Solicita o saldo
            System.out.println("Por favor, digite o seu Saldo!");
            double saldo = scanner.nextDouble();
    
            // Exibe a mensagem final
            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                    + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
            System.out.println(mensagem);

        
        
       
        



    }
}
