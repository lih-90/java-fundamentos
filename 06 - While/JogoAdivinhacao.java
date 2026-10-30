import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random gerador = new Random();

    int numeroSecreto = gerador.nextInt(10) + 1;
    int numeroEscolhido = 0;
    int tentativas = 0;

    System.out.println("Jogo da Adivinhação!");

    while (numeroEscolhido != numeroSecreto) {
      System.out.print("\nDigite um número de 1 a 10: ");
      numeroEscolhido = sc.nextInt();

      if (numeroEscolhido < 1 || numeroEscolhido > 10) {
        System.out.println("Número inválido! Tente novamente.");
        continue;
      }

      tentativas++;

      if (numeroEscolhido < numeroSecreto) {
        System.out.printf("O número secreto é maior que %d.%n", numeroEscolhido);

      } else if (numeroEscolhido > numeroSecreto) {
        System.out.printf("O número secreto é menor que %d.%n", numeroEscolhido);

      } else {
        System.out.printf("%nParabéns, o número secreto é %d!%n", numeroEscolhido);
        System.out.printf("Tentativas: %d.%n", tentativas);
      }
    }

    sc.close();
  }
}
