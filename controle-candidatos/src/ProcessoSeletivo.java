import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
        public static void main(String[] args) {
            imprimirSelecionados();
        }

        static void imprimirSelecionados(){
            String [] candidatos = {"JOÃO", "DIEGO", "KAUAN", "GABRIEL","PEDRO"};

            System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

            for(int indice=0; indice < candidatos.length;indice++){
                System.out.println("O candidato de número " + (indice++) + " é o " + candidatos[indice]);
            }
            System.out.println("Forma abreviada de interação for each");

            for(String candidato: candidatos){
                System.out.println("O candidato selecionado foi " + candidato);
            }

        }
        static void entrandoEmContato(String candidato){
            
        }


        static void selecaoCandidatos(){
            String [] candidatos = {"JOÃO","DIEGO","KAUAN","GABRIEL","PEDRO"};
            int candidatosSelecionados = 0;
            int candidatosAtual = 0;
            double salarioBase = 2000.0;
            while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            }
        }






    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}