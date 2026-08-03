import java.util.Scanner;

public class Calculadora {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    double numero1 = sc.nextDouble();

    System.out.println("Digite o segundo número: ");
    double numero2 = sc.nextDouble();


    System.out.println("\nDigite uma opção: ");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão\n");

    int opcao = sc.nextInt();

    switch (opcao) {

      case 1:
        double soma = numero1 + numero2;
        System.out.printf("%.1f\n", soma);
        break;

      case 2:
        double subtracao = numero1 - numero2;
        System.out.printf("%.1f\n", subtracao);
        break;

      case 3:
        double multiplicacao = numero1 * numero2;
        System.out.printf("%.1f\n", multiplicacao);
        break;

      case 4:
        if (numero2 == 0) {
          System.out.println("Não é possível dividir por zero.");
        } else {
          double divisao = numero1 / numero2;
          System.out.printf("%.1f\n", divisao);
        }
        break;

      default:
        System.out.println("Opção inválida.");
        break;

    }

    sc.close();
  }
}
