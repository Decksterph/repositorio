package teste;

import java.util.Scanner;
public class AreadoQuadrado {
	public static void main (String[] args){
		
		Scanner s1 = new Scanner(System.in);
		int lado = s1.nextInt();
		System.out.println(area(lado));
	}
	
	public static int area (int lado) {
		return lado * lado;
	
	}
}
