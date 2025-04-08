import java.util.Scanner;

public class EXERCICIO2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero (CASO QUEIRA PARAR NUMERO NEGATIVO): ");
        numero = num.nextInt();

        while (numero >= 0) {System.out.println("Digite um numero(CASO QUEIRA PARAR NUMERO NEGATIVO): ");
            numero = num.nextInt();}
    }
}
