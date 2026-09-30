package exercicios_sc;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int placa;
		System.out.println("Qual o ultimo número da placa do seu veiculo: ");
		placa = in.nextInt();
		
		switch(placa) {
		case 1:
		case 2:
			System.out.println("Seu rodizio é na segunda-feira");
			break;
		case 3:
		case 4:
			System.out.println("Seu rodizio é na terça-feira");
			break;
		case 5:
		case 6:
			System.out.println("Seu rodizio é na quarta-feira");
			break;
		case 7:
		case 8:
			System.out.println("Seu rodizio é na quinta-feira");
			break;
		case 9:
		case 0:
			System.out.println("Seu rodizio é na sexta-feira");
			break;
		default:
			System.out.println("De 0 a 9 burrão");
		}
	}
}
	




      