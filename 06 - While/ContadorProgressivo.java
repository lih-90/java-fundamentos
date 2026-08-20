import java.util.Scanner;

public class ContadorProgressivo {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int contador = 0;
    int numero = 0;

    System.out.println("Digite um número: ");
    numero = sc.nextInt();

    if (numero == 0) {
      System.out.println("O número deve ser maior do que 0.");
    }

    while (contador < numero) {

      contador++;
      System.out.println(contador);

    }

    sc.close();
  }
}