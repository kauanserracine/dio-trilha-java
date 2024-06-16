public class ResultadoEscolar {
    
    public static void main(String[] args) {
        
        int n1 = 6;

        if(n1 >= 7)
            System.out.println("Aprovado");

        else if(n1 >= 5 && n1 < 7)
            System.out.println("Recuperação");

        else
            System.out.println("Reprovado");
    }
}
