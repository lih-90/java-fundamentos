import java.util.Scanner;

public class MenuBancoWhile {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double saldo = 2000.00;
    int opcao = 0;

    System.out.println("========= BANCO =========");

    while (opcao != 4) {

      System.out.println("\nEscolha uma das opções abaixo: ");
      System.out.println("1 - Consultar saldo");
      System.out.println("2 - Depositar");
      System.out.println("3 - Sacar");
      System.out.println("4 - Sair");

      opcao = sc.nextInt();

      if (opcao == 1) {
        System.out.printf("%nSaldo atual: R$%.2f%n", saldo);

      } else if (opcao == 2) {
        System.out.print("\nDigite o valor que deseja depositar: R$");
        double deposito = sc.nextDouble();

        if (deposito > 0) {
          saldo += deposito;
          System.out.printf("Depósito realizado: R$ %.2f%n", deposito);
          System.out.printf("Saldo atual: R$ %.2f%n", saldo);

        } else {
          System.out.println("O valor do depósito deve ser maior que zero.");
        }

      } else if (opcao == 3) {
        System.out.print("\nDigite o valor do saque: R$");
        double saque = sc.nextDouble();

        if (saque <= 0) {
          System.out.println("O valor do saque deve ser maior que zero.");

        } else if (saque > saldo) {
          System.out.println("Saldo insuficiente.");

        } else {

          saldo -= saque;
          System.out.printf("Saque realizado: R$ %.2f%n", saque);
          System.out.printf("Saldo atual: R$ %.2f%n", saldo);
        }

      } else if (opcao == 4) {
        System.out.println("\nSaindo da sua conta.");

      } else {
        System.out.println("\nOpção inválida! Digite um número entre 1 e 4.");

      }
    }
    sc.close();
  }
}