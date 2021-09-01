package main;

import java.util.Scanner;

import entity.Atm;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade que deseja sacar[exemplo- 80,00]: ");
		float valorDoSaque = entrada.nextFloat();

		Atm atm = new Atm();
		
		System.out.println(atm.retornarQuantidadeDeNotas(valorDoSaque));
		
		entrada.close();
	}
	
	
	
}
