import java.util.Scanner;

public class Cantina {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int codigo;
		System.out.println(" Digite o codigo da comida ");

		codigo = ler.nextInt();
		
		switch(codigo) {
		case 1 :
				System.out.println(" Descrição: cachorro quente");
				System.out.println(" Valor: R$ 8,00");
			break;
		
		case 2 :
				System.out.println(" Descrição: cheeseburger");
				System.out.println(" Valor: R$ 12,00");
			break;
		
		case 3 :
				System.out.println(" Descrição: X-salada");
				System.out.println(" Valor: R$ 15,00");
			break;
		
		case 4 :
				System.out.println(" Descrição: misto quente");
				System.out.println(" Valor: R$ 11,00");
			break;
		
		case 5 :
				System.out.println(" Descrição: pão na chapa");
				System.out.println(" Valor: R$ 6,00");
			break;
			
		default:
				System.out.println(" codigo incorreto, digite um numero de 1 a 5.");
				break;
		}
	}

}
