import java.util.Scanner;
/**
 * <h1>Contador</h1>
 * O Contador calcula a diferença entre dois numeros informados e conta no terminal
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author  Paulo Bof
 * @version 1.0
 * @since   25/09/2023
 */
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.err.println("Parametros Invalidos, o 1º parametro não pode ser maior que o 2º parametro");
        }

    }

    /**
     * Este método é utilizado para contar a diferença entre dois números inteiros
     * @param parametroUm este é o primeiro parâmetro do método
     * @param parametroDois este é o segundo parâmetro do método
     * @throws ParametrosInvalidosException essa exceção será lançada se parametroUm for maior que parametroDois
     */
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        int contagem = parametroDois - parametroUm;

        if (contagem < 0) {
            throw new ParametrosInvalidosException();
        }

        for (int i = 1;i<=contagem;i++) {
            System.out.println("Imprimindo o numero " + i);
        }
    }
}