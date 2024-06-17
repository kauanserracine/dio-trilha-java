import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args){
        double saldo = 237.48;
        int n = 1021;

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu número da agencia: ");
        String agencia = scanner.next();
        
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + n + " e seu saldo " + saldo + " já está disponível para saque!");
        


    }
}