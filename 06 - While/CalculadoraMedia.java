import java.util.Scanner;

public class CalculadoraMedia {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double nota;
    double media=0;
    double soma = 0;
    int quantidade = 0;

    System.out.println("Média do Aluno\n");

    System.out.println("Digite uma nota de 0 a 10: ");
    System.out.println("Digite -1 para finalizar.");

    nota = sc.nextDouble();

    while (nota != -1) {

      if (nota < 0 || nota > 10) {
        System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
      } else {
        soma += nota;
        quantidade++;
      }

      System.out.println("\nDigite outra nota ou -1 para finalizar: ");
      nota = sc.nextDouble();
    }

    if (quantidade > 0) {
      media = soma / quantidade;
      System.out.printf("\nMédia: %.1f%n", media);
    } else {
      System.out.println("\nNenhuma nota foi informada.\n");
      return;
    }

    if (media >= 7) {
      System.out.println("Situação: Aprovado.\n");
    } else if (media >= 5) {
      System.out.println("Situação: Recuperação.\n");
    } else {
      System.out.println("Situação: Reprovado.\n");
    }

    sc.close();
  }
}
