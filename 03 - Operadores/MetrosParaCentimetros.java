import java.util.Scanner;

public class MetrosParaCentimetros {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite um valor em metros: ");
    double metros = sc.nextDouble();

    double conversaoCentimetros = metros * 100;
    System.out.printf("%.2f\n centímetros", conversaoCentimetros);

  sc.close();

  }      
}
