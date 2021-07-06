package Laboratorio1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Vanderson dos Santos Araújo - 120110501
 */

public class AcimaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String linha = sc.nextLine();
		int soma = 0;
		int quant = 0;
		for (String palavra : linha.split(" ")) {
			soma += Integer.parseInt(palavra);
			quant+=1;
		}
		float media = soma/quant;
		
		int num;
		for (String palavra : linha.split(" ")) {
			num = Integer.parseInt(palavra);
			if (num>media) {
				System.out.print(num+" ");
			}
		}
		
	}
}
