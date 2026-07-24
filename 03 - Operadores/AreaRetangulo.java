import java.util.Scanner;

public class AreaRetangulo {

  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Digite a largura do retângulo em centímetros: ");
  int largura = sc.nextInt();

  System.out.println("Digite a altura do retângulo em centímetros: ");
  int altura = sc.nextInt();

  int areaRetangulo = largura * altura;
  System.out.printf("A área do retângulo é %d cm\n ", areaRetangulo);

  sc.close();
  
}
}