import java.util.Scanner;

public class Signo {

	public static void main(String[] args) {
		Scanner ler= new Scanner (System.in);
		int mes, dia;
		System.out.println(" Entre com o seu mês e dia de nascimento ");
		
		dia = ler.nextInt();
		mes = ler.nextInt();
		
		switch (mes) {
		case 4:
				if ( dia <=20 ) {
						System.out.println("Áries");
				} else {
						System.out.println("Touro");
			}
				break;
		case 5:
			if ( dia <=20) {
					System.out.println("Touro");
			} else {
					System.out.println("Gêmeos");
			}
			break;
			
		case 6:
			if ( dia <=20) {
					System.out.println("Gêmeos");
			} else {
					System.out.println("Câncer");
			}
			break;
			
		case 7:
			if ( dia <=21) {
					System.out.println("Câncer");
			} else {
					System.out.println("Leão");
			}
			break;
			
		case 8:
			if ( dia <=22) {
					System.out.println("Leão");
			} else {
					System.out.println("Virgem");
			}
			break;
			
		case 9:
			if ( dia <=22) {
					System.out.println("Virgem");
			} else {
					System.out.println("Libra");
			}
			break;
			
		case 10:
			if ( dia <=22) {
					System.out.println("Libra");
			} else {
					System.out.println("Escorpião");
			}
			break;
			
		case 11:
			if ( dia <=21) {
					System.out.println("Escorpião");
			} else {
					System.out.println("Sagitário");
			}
			break;
			
		case 12:
			if ( dia <=21) {
					System.out.println("Sagitário");
			} else {
					System.out.println("Capricórnio");
			}
			break;
			
		case 1:
			if ( dia <=20) {
					System.out.println("Capricórnio");
			} else {
					System.out.println("Aquário");
			}
			break;
			
		case 2:
			if ( dia <=19) {
					System.out.println("Aquário");
			} else {
					System.out.println("Peixes");
			}
			break;
			
		case 3:
			if ( dia <=19) {
					System.out.println("Peixes");
			} else {
				System.out.println("Áries");
			}
			
			break;
			
		default:
			System.out.println("O mês ou o dia são invalidos, lembre de colocar os dois, como mostra no exemplo a seguir: 20 (dia pimeiro) 5 (depois o mês, só os numeros e com espaços entre si) ");
		break;
		
		}
	}

}
