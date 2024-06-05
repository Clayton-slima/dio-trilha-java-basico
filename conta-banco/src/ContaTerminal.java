import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua Conta !");
        int conta = scanner.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();


        //imprimindo os dados inseridos pelo usuário
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta " + conta + " e saldo " + saldo + " já disponível para saque.");

    }

}        
