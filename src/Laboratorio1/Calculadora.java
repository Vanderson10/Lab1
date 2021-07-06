package Laboratorio1;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Vanderson dos Santos Araújo - 120110501
 */

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcao = sc.next();
		
		if (opcao.equals("+")){	
			float n1 = sc.nextFloat();
			float n2 = sc.nextFloat();
			float soma = n1+n2;
			System.out.println("RESULTADO: "+soma);
		}
		else if(opcao.equals("-")){
			float n1 = sc.nextFloat();
			float n2 = sc.nextFloat();
			float subtracao = n1-n2;
			System.out.println("RESULTADO: "+subtracao);	
		}
		else if(opcao.equals("/")) {
			float n1 = sc.nextFloat();
			float n2 = sc.nextFloat();
			if(n2==0) {
				System.out.println("ERRO");
				System.exit(0);
			}
			float divisao = n1/n2;
			System.out.println("RESULTADO: "+divisao);
		}
		else if(opcao.equals("*")) {
			float n1 = sc.nextFloat();
			float n2 = sc.nextFloat();
			float multiplicacao = n1*n2;
			System.out.println("RESULTADO: "+multiplicacao);	
		}
		else {
			System.out.println("ENTRADA INVALIDA");
			System.exit(0);
		}
	}
}
