import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String NomeCliente;
        Double Saldo;


        System.out.println("Digite o Nome do Cliente:  ");
        NomeCliente = scanner.nextLine();

        System.out.println("Digite sua agencia:");
        agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta");
        numero = scanner.nextInt();

        System.out.println("Digite o Saldo que deseja depositar: ");
        Saldo = scanner.nextDouble();

        System.out.println ("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta numero " + numero+ ", seu saldo é de " + Saldo + " e já está disponível para saque ");
    }
}
