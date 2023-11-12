package challenges.level.one;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/*Passo 1: Vamos imaginar que em um processo seletivo, existe o valor base salarial de R$ 2.000,00 e o salário pretentido pelo candidato. Vamos elaborar um controle de fluxo onde:
Se o valor salário base, for maior que valor salário pretentido, imprima : LIGAR PARA O CANDIDATO;
Senão, Se o valor salário base for igual ao valor salário pretentido, imprima : LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA;
Senão imprima: AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.

Passo 2: Foi solicitado, que nosso sistema garanta que,
diante das inúmeras candidaturas sejam selecionados apenas
no máximo, 5 candidatos para entrevista, onde o salário pretendido
seja menor ou igual ao salário base.

Passo 3: Agora é hora de imprimir a lista dos candidatos
selecionados, para disponibilizar para o RH entrar em
contato.

Passo 4: O RH deverá realizar uma ligação, com no máximo
03 tentativas para cada candidato selecionado e caso o
candidato atenda, deve-se imprimir:

"CONSEGUIMOS CONTATO COM _[CANDIDATO] ``` APÓS **_**[TENTATIVA]`** TENTATIVA(S)" ;**

Do contrário imprima: "NÃO CONSEGUIMOS CONTATO COM O _[CANDIDATO]_".


**/

public class firstChallengeSelectionCase {
    public static void main(String[] args){
        System.out.println("PROCESSO SELETIVO");
        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        //primeiro um for para selecionar os candidatos
        for(String candidato: candidatosSelecionados) {
            contatandoCandidato(candidato);
        }
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }


    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecaoCandidatos(){
        // Array com a lista de candidatos

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE", "JOÃO"};

        int candidatosSelecionados = 0;
        int candidatoAtualIndex = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados<=5 && candidatoAtualIndex < candidatos.length){
            String candidato = candidatos[candidatoAtualIndex];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if(salarioPretendido >= salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtualIndex++;
        }
    }

    static void imprimiCandidatosSelecionados(){
        // Array com a lista de candidatos

        String [] candidatosSelecionados = {"FELIPE","MÁRCIA","JULIA","PAULO","JORGE"};
        for(int i=0; i<candidatosSelecionados.length; i++){
            System.out.println("O candidato de número " + (i+1) + " é o " + candidatosSelecionados[i]);
        }

        /*
        for(String candidato: candidatosSelecionados){
            System.out.println("O candidato selecionado foi " + candidato);
        }
        **/
    }

    //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void contatandoCandidato(String candidato){

        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");

    }


}

