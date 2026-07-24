import java.util.Scanner;

public class CalculadoraSimples{


  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Digite o primeiro valor: ");
  int valor1 = sc.nextInt();

  System.out.println("Digite o segundo valor: ");
  int valor2 = sc.nextInt();


  int soma = valor1 + valor2;
  int sub = valor1 - valor2;
  int multiplicacao = valor1 * valor2;

  System.out.printf("Resultado da soma: %d\n", soma);
  System.out.printf("Resultado da subtração: %d\n", sub);
  System.out.printf("Resultado da multiplicação: %d\n", multiplicacao);

  if (valor2 != 0) {
      double divisao = (double) valor1 / valor2;
      System.out.printf("Resultado da divisão: %.2f\n", divisao);
  } else {
      System.out.println("Resultado da divisão: não é possível dividir por zero.");
  }

  sc.close();
}
}

