import java.util.Scanner;

public class CalculadoraDesconto {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("=====Lojas Super=====\n");
    System.out.println("Digite uma opção: ");
    System.out.println("1 - Eletrônicos");
    System.out.println("2 - Livros");
    System.out.println("3 - Vestuário");
    System.out.println("4 - Alimentos");
    int opcao = sc.nextInt();

    System.out.print("\nDigite o valor da compra: R$");
    double valorCompra = sc.nextDouble();
    double desconto = 0;
    double valorFinal = 0;

    if (valorCompra <= 0) {
      System.out.println("\nO valor da compra deve ser maior que zero.");
      sc.close();
      return;
    }

    System.out.println("\n========Lojas Super========");

    switch (opcao) {
      case 1:
        System.out.println("\nCategoria: 1 - Eletrônicos");
        desconto = (valorCompra * 5) / 100.0;
        valorFinal = valorCompra - desconto;
        System.out.printf("Valor da Compra: R$%.2f%n", valorCompra);
        System.out.printf("Desconto (5%%): R$%.2f%n", desconto);
        System.out.printf("Valor Final: R$%.2f%n", valorFinal);
        break;

      case 2:
        System.out.println("\nCategoria: 2 - Livros");
        desconto = (valorCompra * 15) / 100.0;
        valorFinal = valorCompra - desconto;
        System.out.printf("Valor da Compra: R$%.2f%n", valorCompra);
        System.out.printf("Desconto (15%%): R$%.2f%n", desconto);
        System.out.printf("Valor Final: R$%.2f%n", valorFinal);
        break;

      case 3:
        System.out.println("\nCategoria: 3 - Vestuário");
        desconto = (valorCompra * 10) / 100.0;
        valorFinal = valorCompra - desconto;
        System.out.printf("Valor da Compra: R$%.2f%n", valorCompra);
        System.out.printf("Desconto (10%%): R$%.2f%n", desconto);
        System.out.printf("Valor Final: R$%.2f%n", valorFinal);
        break;

      case 4:
        System.out.println("\nCategoria: 4 - Alimentos");
        desconto = (valorCompra * 8) / 100.0;
        valorFinal = valorCompra - desconto;
        System.out.printf("Valor da Compra: R$%.2f%n", valorCompra);
        System.out.printf("Desconto (8%%): R$%.2f%n", desconto);
        System.out.printf("Valor Final: R$%.2f%n", valorFinal);
        break;

      default:
        System.out.println("Opção inválida.");
        break;
    }

    sc.close();
  }
}
