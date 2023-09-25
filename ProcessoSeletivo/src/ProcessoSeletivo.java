import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {

        selecaoCandidatos();

        imprimirSelecionados();

        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }

    }

    private static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu=false;

        do  {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (!continuaTentando){
                System.out.println("Contato Realizado com sucesso");
            }
            tentativasRealizadas++;
        } while(continuaTentando && tentativasRealizadas < 3);

        if (atendeu){
            System.out.println("Conseguimos contato com o " + candidato + " na " + --tentativasRealizadas);
        } else {
            System.out.println("Não conseguimos contato com o " + candidato + ", numero máximo de 3 tentativas");
        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for (int indice=0;indice<candidatos.length;indice++) {
            System.out.println("O candidato de nº " + indice+1 + " é o " + candidatos[indice]);
        }

        System.out.println("Forma Abrevidada");
        for (String candidato: candidatos){
            System.out.println("O candidato selecionado foi o " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase=2000.0;

        while (candidatosSelecionados<5 && candidatosAtual<candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salário " + salarioPretendido);
            if(salarioBase>=salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase==salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}