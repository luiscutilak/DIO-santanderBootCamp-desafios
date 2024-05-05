import java.util.Scanner;

public class ContaTerminal {

    static int numeroConta = 1021;
    String agencia;
    String nomeCliente;
    static double saldo = 237.48;

    public static void main(String[] args) throws Exception {
        Scanner leituraAgencia = new Scanner(System.in);
        System.out.println("\n Por favor digite o número da Agência: ");
        String agencia = leituraAgencia.nextLine();
        
        Scanner leituraNomeCliente = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeCliente = leituraNomeCliente.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\n sua agência é: " + agencia + "\n conta: " + numeroConta + "\n e seu saldo é de: R$ " + saldo +".");


    }
}
