import java.util.Scanner;

public class ConversorTemperatura {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Conversor de temperatura\n");
    System.out.println("Digite uma opção: ");
    System.out.println("1 - Celsius → Fahrenheit");
    System.out.println("2 - Fahrenheit → Celsius");
    int opcao = sc.nextInt();

    double temperatura;
    double celsius = 0;
    double fahrenheit = 0;

    switch (opcao) {

      case 1:
        System.out.println("\nDigite a temperatura em Celsius: ");
        temperatura = sc.nextDouble();
        fahrenheit = (temperatura * 9 / 5) + 32;
        System.out.printf("%.1f ºC equivale a %.1f ºF.%n", temperatura, fahrenheit);
        break;

      case 2:
        System.out.println("\nDigite a temperatura em Fahrenheit: ");
        temperatura = sc.nextDouble();
        celsius = (temperatura - 32) * 5 / 9;
        System.out.printf("%.1f ºF equivale a %.1f ºC.%n", temperatura, celsius);
        break;

      default:
        System.out.println("Opção inválida.");
    }

    sc.close();

  }
}
