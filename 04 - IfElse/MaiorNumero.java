import  java.util.Scanner;

public class MaiorNumero {
  
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    int numero1 = sc.nextInt();

    System.out.println("Digite o segundo número: ");
    int numero2 = sc.nextInt();

    if (numero1 > numero2){
      System.out.printf("%d é um número maior que %d.\n.", numero1, numero2);
    } else {
      System.out.printf("%d é um número maior que %d.\n.", numero2, numero1);
    }
    
  sc.close();
  }
}
