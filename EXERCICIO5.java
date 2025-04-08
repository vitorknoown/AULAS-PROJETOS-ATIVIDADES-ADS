import java.util.Scanner;

class ContaBancaria {
     String titular;
     double saldo = 0;
     int numeroConta;

     void Depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    void Sacar(double valor){
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    public void getSaldo(String titular, int numeroConta) {
        System.out.println("Nome: "+titular + " Numero da Conta: "+numeroConta+"\nSaldo atual: R$" + saldo);
    }
}


public class EXERCICIO5 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String titular = scanner.next().toUpperCase();

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Deseja Sacar ou Depositar uma conta? (S/D): ");
        String opc = scanner.next().toUpperCase();

        switch (opc) {
            case "S":
                System.out.println("Digite quanto deseja sacar: ");
                double sacar = scanner.nextDouble();
                conta.Sacar(sacar);
                break;
            case "D":
                System.out.println("Digite quanto deseja depositar: ");
                double depositar = scanner.nextDouble();
                conta.Depositar(depositar);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        conta.getSaldo(titular, numeroConta);
        scanner.close();
    }

}


