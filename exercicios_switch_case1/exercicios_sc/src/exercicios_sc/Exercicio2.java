package exercicios_sc;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int mes;
		System.out.println("Digite um número entre 1 a 12 para saber quantos dias o mês correspondente tem: ");
		mes = in.nextInt();
		
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("O mês tem 31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("O mês tem 30 dias");
			break;
		case 2:
			System.out.println("O mês tem 28 dias");
			break;
		default:
			System.out.println("Não existe esse mês");
		}
	}
}
	

