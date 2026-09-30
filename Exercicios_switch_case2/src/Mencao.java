import java.util.Scanner;

public class Mencao {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		String mencao;
		System.out.println(" Digite sua menção ");
		
		mencao  = ler.nextLine();
		
		switch(mencao) {
		case "MB" :
				System.out.println(" MB significa que você tem um excelente desempenho");
			break;
		case "B" :
				System.out.println(" B significa que você tem um bom desempenho");
			break;
		
		case "R" :
				System.out.println(" R significa que você tem um desempenho regular");
			break;
		
		case "I" :
				System.out.println(" I significa que você tem um desempenho insatisfatório");
			break;
		
		default:
				System.out.println(" Menção inválida, digite apenas MB, B, R ou I (em maiusculo) ");
			break;
			
		}
	}

}
