import java.util.Scanner;

public class SomaAteZero {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int soma = 0;

    while (true) {

      System.out.print("Digite um número (0 para sair): ");
      int numero = sc.nextInt();

      if (numero == 0) {
        break;
      }

      soma += numero;
      System.out.printf("Soma: %d%n", soma);
    }

    System.out.printf("%nSoma final: %d%n", soma);

    sc.close();
  }
}