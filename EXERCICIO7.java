import java.sql.SQLOutput;
import java.util.Scanner;

public class EXERCICIO7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE SEU LOGIN: ");
        String login = scanner.nextLine();
        System.out.println("DIGITE SEU SENHA: ");
        String senha = scanner.nextLine();

        if (login.equals("admin") && senha.equals("1234")) {
            System.out.println("Login com sucesso!");
        }
        else {
            System.out.println("Login ou Senha incorreta!");
        }
    }
}
