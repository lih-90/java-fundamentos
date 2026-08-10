import java.util.Scanner;

public class MenuBanco {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double saldoInicial = 2000.00;
    double saldoFinal = 0.0;

    System.out.println("========= BANCO =========\n");
    System.out.println("Escolha uma das opções abaixo: ");
    System.out.println("1 - Consultar saldo");
    System.out.println("2 - Depositar");
    System.out.println("3 - Sacar");
    System.out.println("4 - Sair");
    int opcao = sc.nextInt();

    switch (opcao) {
      case 1:
        System.out.printf("Saldo: R$%.2f%n", saldoInicial);
        break;

      case 2:
        System.out.print("\nDigite o valor que deseja depositar: R$");
        double deposito = sc.nextDouble();
        if (deposito <= 0) {
          System.out.println("O valor do depósito deve ser maior que zero.");
          sc.close();
          return;
        }

        saldoFinal = saldoInicial + deposito;
        System.out.printf("Depósito: R$%.2f%nSaldo: R$%.2f%n", deposito, saldoFinal);
        break;

      case 3:
        System.out.print("\nQual o valor do saque: R$");
        double saque = sc.nextDouble();
        if (saque <= 0) {
          System.out.println("O valor do saque deve ser maior que zero.");
          sc.close();
          return;
        }

        if (saldoInicial < saque) {
          System.out.println("Saldo insuficiente.");
          sc.close();
          return;
        }

        saldoFinal = saldoInicial - saque;
        System.out.printf("Saque: R$%.2f%nSaldo: R$%.2f%n", saque, saldoFinal);
        break;

      case 4:
        System.out.println("\nSaindo da sua conta.");
        break;

      default:
        System.out.println("\nOpção inválida! Digite um número entre 1 e 4.");

    }

    sc.close();
  }
}
