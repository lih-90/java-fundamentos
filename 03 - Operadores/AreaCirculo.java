import java.util.Scanner;

public class AreaCirculo {
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  double pi = 3.14159;

  System.out.println("Digite o raio do círculo em centímetros: ");
  double raio = sc.nextDouble();

  double areaCirculo = pi * (raio * raio);
  System.out.printf("A área do círculo é %.2f cm\n ", areaCirculo);

  sc.close();
  
}
}
