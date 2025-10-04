package controller;

import java.util.Scanner;

public class PinguinController {

	private int PNGuin = 0;
	private int diaMorte = 0;
	private Scanner ler = new Scanner(System.in);
	
	public PinguinController(int PNGuin, int diaMorte) {
		this.PNGuin = PNGuin;
		this.diaMorte = diaMorte;
	}
	
	public PinguinController() {
		super();
	}
	
	public void run(){
		System.out.print("Insira o número de pinguins infectados: ");
		PNGuin = ler.nextInt();
		diaMorte = 2 + PNGuin;
		
		System.out.println("\nSituação: ");
		System.out.println("1° dia: O sol nasce e os pinguins são infectados.");
		System.out.println("2° dia: O predador aparece, mas desiste de caçar.");
		try {
		Thread.sleep(1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(">>Alguns pinguins começaram a suspeitar.");
		for (int i = 2; i < diaMorte; i++) {
			try {
				Thread.sleep(1000);
				} catch(Exception e) {
					e.printStackTrace();
				}
			if (i == diaMorte - 1) {
				System.out.println(i + "° dia: Algo está prestes a acontecer..."); 
			} else if (i == 3) {
				System.out.println(">>Os pinguins perceberam que algo de errado não está certo.");
			}else {
				System.out.println(i + "° dia: Dia normal, alguns pinguins se encaram.");				
			}
		}
		try {
			Thread.sleep(2000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println(diaMorte + "° dia: Todos os " + PNGuin + " pinguins infectados perceberam e se mataram.");
		ler.close();
	}
}
