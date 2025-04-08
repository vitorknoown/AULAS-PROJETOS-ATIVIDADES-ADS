import java.util.Scanner;

public class EXERCICIO6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero: ");
            double numero =  sc.nextDouble();

            resultado = resultado + numero;
        }
        System.out.println("RESULTADO " + resultado);

    }
}
