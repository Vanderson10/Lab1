/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Vanderson dos Santos Araújo - 120110501
 */

package Laboratorio1;

import java.util.ArrayList;
import java.util.Scanner;

public class EncontraWally {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho;
		String tem = "não";
		String nome = "";
		String nomes = "";
		while(nomes!="wally") {
			nomes = sc.nextLine();
			if (nomes.equals("wally")) {
				System.exit(0);
			}
			for (String palavra : nomes.split(" ")) {
				tamanho = palavra.length();
				if(tamanho==5) {
					nome = palavra;
					tem = "tem";
				}
			}
			if (nome=="wally") {
				System.exit(0);
			}
			if (tem=="tem"){
				System.out.println(nome);
			}else if(tem=="não") {
				System.out.println("?");
			}
			tem ="não";
		}
	}
}
