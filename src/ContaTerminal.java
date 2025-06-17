import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo(a)!");
        System.out.print("\nPor favor, informe o número da sua conta: ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.print("\nPor favor, informe sua Agência: ");
        String agencia = sc.nextLine();
        System.out.print("\nPor favor, informe seu Nome: ");
        String nomeCliente = sc.nextLine();
        System.out.print("\nPor favor, informe o saldo atual: ");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+
                agencia + ", conta " + conta + " e seu saldo " + String.format("%.2f", saldo) + " já está disponível para saque.");
    }
}
