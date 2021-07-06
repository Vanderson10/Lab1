package Laboratorio1;

import java.util.Scanner;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Vanderson dos Santos Araújo - 120110501
 * 
 */

public class AlunosNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linha = " ";
		int maior = 0;
		int menor = 0;
		int acima = 0;
		int abaixo = 0;
		int soma = 0;
		String nota = " ";
		while(linha!="-") {
			linha = sc.nextLine();
			if (linha.equals("-")){
				break;
			}
			for (String notas : linha.split(" ")) {
				nota = notas;
			}
			int notaconvertida = Integer.parseInt(nota);
			if (acima+abaixo==0) {
				menor = notaconvertida;
			}
			if (notaconvertida>maior) {
				maior = notaconvertida;
			}
			if (notaconvertida<menor) {
				menor = notaconvertida;
			}
			soma = soma+notaconvertida;
			if (notaconvertida>=700) {
				acima = acima+1;
			}else if(notaconvertida<700) {
				abaixo = abaixo+1;
			}
		}
		System.out.println("maior: "+maior);
		System.out.println("menor: "+menor);
		System.out.println("media: "+soma/(acima+abaixo));
		System.out.println("acima: "+acima);
		System.out.println("abaixo: "+abaixo);
	}

}
