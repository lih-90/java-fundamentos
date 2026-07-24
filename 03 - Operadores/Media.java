import java.util.Scanner;

public class Media
{
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite a primeira nota: ");
    float nota1 = sc.nextFloat();
    
    System.out.println("Digite a segunda nota: ");
    float nota2 = sc.nextFloat();
    
    System.out.println("Digite a terceira nota: ");
    float nota3 = sc.nextFloat();
    
    double media = (nota1 + nota2 + nota3) /3;
    System.out.printf("Média: %.1f\n", media);

    sc.close();
    
	}
}
