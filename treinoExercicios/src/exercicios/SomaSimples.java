package exercicios;

import java.util.Scanner;

public class SomaSimples {

	public static Integer somarNumeros(Integer num1, Integer num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro numero:");
		Integer n1 = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		Integer n2 = sc.nextInt();
		sc.close();
		System.out.println("Soma = "+(n1+n2));
	}

}
