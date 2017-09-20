import java.util.Scanner;

public class Techbiosis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int i = sc.nextInt();
		//Caso especial de ser zero
		if(i==0)
		{
			System.out.println("zero");
			return;
		}
		//Construtor para a classe numeros
		Numbers n=new Numbers();
		decompose(i,n,0);
	}
	//Função recursiva para dividir o numero por 1000, para neste caso conseguirmos separar os numeros por unidades de medida por exemplo o numero: 123456789 fica como
	//123 456 789, desta forma conseguimos contar as unidades de milhares, milhões e biliões mais facilmente...
	private static void decompose(int i,Numbers n,int houses)
	{
		if(i>=1000)
		{
			//Chama-se a si mesma com o numero divido por 1000
			decompose(i/1000,n,houses+1);
			System.out.print(n.numberToString(i%1000,houses));
		}
		else			
			System.out.print(n.numberToString(i,houses));
	}
}
