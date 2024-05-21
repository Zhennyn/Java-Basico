
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual o seu nome? ");

        String nome = scanner.next();

        System.out.println("Qual o seu sobrenome? ");

        String sobrenome = scanner.next();

        System.out.println(nome+ " " + sobrenome);
    }
}
