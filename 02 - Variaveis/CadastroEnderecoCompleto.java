import java.util.Scanner;

public class CadastroEnderecoCompleto {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o seu nome: ");
    String nome = sc.nextLine();

		System.out.println("Digite a sua idade: ");
    int idade = sc.nextInt();
    
    System.out.println("Digite o seu peso: ");
    float peso = sc.nextFloat();
    sc.nextLine();

    System.out.println("Digite o seu RG: ");
    String rg = sc.nextLine();
    
    System.out.println("Digite o seu CPF: ");
    String cpf = sc.nextLine();
        
    System.out.println("Digite o seu e-mail: ");
    String email = sc.nextLine();
    
    System.out.println("Digite o seu CEP: ");
    String cep = sc.nextLine();
    
		System.out.println("Digite o seu endereço completo: ");
    String endCompleto = sc.nextLine();

		System.out.println("Informações do cliente:\n");
		System.out.println("Nome: " +nome);
		System.out.println("Idade: " +idade);
		System.out.println("Peso: " +peso);	
		System.out.println("RG: " +rg);		
		System.out.println("CPF: " +cpf);	
		System.out.println("e-mail: " +email);
		System.out.println("CEP: " +cep);
		System.out.println("Endereço: " +endCompleto);	

	
	sc.close();

	}
}
