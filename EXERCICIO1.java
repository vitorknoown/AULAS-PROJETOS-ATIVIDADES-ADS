import java.util.Scanner;
class calculadora {
    public double num1;
    public double num2;

    calculadora () {
        this.num1 = num1;
        this.num2 = num2;
    }

    double somar(double num1, double num2){
        return num1 + num2;
    }

    double subtrair(double num1, double num2){
        return num1 - num2;
    }

    double multiplicar(double num1, double num2){
        return num1 * num2;
    }
    double dividir(double num1, double num2){
        return num1 / num2;
    }
}
public class EXERCICIO1 {
    public static void main(String[] args) {
        calculadora calc = new calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.println("soma: "+ calc.somar(num1,num2));
        System.out.println("subtrair: "+ calc.subtrair(num1,num2));
        System.out.println("multiplicar: "+ calc.multiplicar(num1,num2));
        System.out.println("dividir:  "+ calc.dividir(num1,num2));

    }
    
}
