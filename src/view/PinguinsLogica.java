// controller e view tudo junto

package view;

import java.util.Scanner;

public class PinguinsLogica {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o número de pinguins infectados: ");
		int PNGuin = ler.nextInt();

		int diaMorte = 2 + PNGuin;

		System.out.println("Situação: ");
		System.out.println("1° dia: O sol nasce e os pinguins são infectados.");
		System.out.println("2° dia: O predador aparece, mas desiste de caçar.");
		System.out.println("Alguns pinguins começaram a suspeitar.");
		for (int i = 2; i < diaMorte; i++) {
			System.out.println(i + "° dia: Normal, alguns pinguins se encaram.");
		}
		System.out.println(diaMorte + "° dia: Todos os " + PNGuin + " pinguins infectados perceberam e se mataram.");
		ler.close();
	}
}

