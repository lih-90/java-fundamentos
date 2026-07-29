import java.util.Scanner;

public class PositivoMaiorOuIgual100 {
  
  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Digite um número: ");
  int numero = sc.nextInt();

  if (numero > 0 && numero <=100){
    System.out.printf("%d é positivo e menor ou igual ao valor 100.\n", numero);
  } else if (numero > 100){
    System.out.printf("%d é maior que 100.\n", numero);   
  } else if (numero < 0){
    System.out.printf("%d é negativo.\n", numero);  
  } else{
    System.out.printf("%d é igual a zero.\n", numero);
  }

  sc.close();
  }
}

