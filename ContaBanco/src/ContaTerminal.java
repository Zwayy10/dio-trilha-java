import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar e ler os dados da conta
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente
        
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta!");
        double saldo = scanner.nextDouble();
        
        // Formatando o saldo para exibição
        DecimalFormat df = new DecimalFormat("0.00");
        String saldoFormatado = df.format(saldo);
        
        // Exibir a mensagem com os dados da conta
        String mensagem = "Olá " + nomeCliente + 
                         ", obrigado por criar uma conta em nosso banco, " +
                         "sua agência é " + agencia + 
                         ", conta " + numero + 
                         " e seu saldo " + saldoFormatado + 
                         " já está disponível para saque.";
        
        System.out.println(mensagem);
        
        scanner.close();
    }
}
