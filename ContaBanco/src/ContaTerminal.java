/**
 * <h1>ContaTerminal</h1>
 * A Conta Terminal exibe no terminal as informações de Numero da Conta, Agencia, Nome Cliente e Saldo informados pelo Cliente via terminal
 * <p>
 *
 * @author  Paulo Bof
 * @version 1.0
 * @since   20/09/2023
 */
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int numberAccount = requestNumberAccount(scanner);
            String agency = requestAgency(scanner);
            String customerName = requestCustomerName(scanner);
            double balance = requestBalance(scanner);

            showAccountCreated(numberAccount, agency, customerName, balance);
        } catch (Exception e) {
            System.err.println("Operação Cancelada, por favor, verifique os valores digitados!!");
        }
    }

    private static int requestNumberAccount(Scanner scanner) {
        System.out.println("Por favor, digite o numero de sua conta bancária:");
        return scanner.nextInt();
    }
    private static String requestAgency(Scanner scanner) {
        System.out.println("Por favor, digite o numero de sua agência: (Com o digito verificador XXXX-X)");
        return scanner.next();
    }
    private static String requestCustomerName(Scanner scanner) {
        System.out.println("Por favor, digite o seu nome completo:");
        return scanner.next();
    }
    private static double requestBalance(Scanner scanner) {
        System.out.println("Por favor, digite o saldo atual de sua conta bancária:");
        return scanner.nextDouble();
    }
    private static void showAccountCreated(int numberAccount, String agency, String customerName, double balance) {
        System.out.println("Olá "
                + customerName
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agency
                + ",conta "
                + numberAccount
                + " e seu saldo "
                + balance
                + " já está disponível para saque.");
    }
}