package Laboratorio1;

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Vanderson dos Santos Araújo - 120110501
 */

import java.util.Scanner;

public class Aprovado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Float n1 = sc.nextFloat();
		Float n2 = sc.nextFloat();
		
		if(((n1+n2)/2)>=7.0) {
			System.out.println("pass: True!");
		}else {
			System.out.println("pass: False!");
		}
	}

}
