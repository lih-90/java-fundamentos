import java.util.Scanner;

public class CalculadoraIMC {

  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Digite a sua altura (m): ");
  double altura = sc.nextDouble();

  
  System.out.println("Digite o seu peso (kg): ");
  double peso = sc.nextDouble();

  if (peso <= 0 || altura <= 0) {
    System.out.println("\nPeso e altura devem ser maiores que zero.");
    sc.close();
    return;
  }

  System.out.println("\nCálculo de IMC");
  System.out.printf("Altura: %.1fm\n", altura);
  System.out.printf("Peso: %.1fkg\n", peso);

  double imc = peso / (altura * altura);

  if (imc < 18.5){
        System.out.printf("IMC: %.1f - Abaixo do peso.\n", imc);
  } else if (imc < 25){
        System.out.printf("IMC: %.1f - Peso normal.\n", imc);
  } else if (imc <30) {
        System.out.printf("IMC: %.1f - Sobrepeso.\n", imc);
  } else if (imc < 35) {
        System.out.printf("IMC: %.1f - Obesidade I.\n", imc);
  } else if (imc < 40) {
        System.out.printf("IMC: %.1f - Obesidade II.\n", imc);
  } else {
        System.out.printf("IMC: %.1f - Obesidade III.\n", imc);    
  }

  sc.close();
}  
}
