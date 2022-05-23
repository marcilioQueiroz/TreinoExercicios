package exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MediaPonderada {
	/*
	 * Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. 
	 * A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 
	 * (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
	 * 
	 *		**Entrada**
	 * O arquivo de entrada contém 2 valores com uma casa decimal cada um.
	 * 
	 *		**Saida**
	 * Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e 
	 * com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double).
	 * 
	 *  **ExemplosEntradas**          |       **ExemplosSaidas**
	 *    5,0                         |
	 *    7,1                         |      MEDIA = 6,43182
	 *  --------------------------------------------------------
	 *    0,0                         | 
	 *    7,1                         |     MEDIA = 4,84091
	 *  --------------------------------------------------------
	 *   10,0                         |
	 *   10,0                         |     MEDIA = 10,00000
	 *    
	 * */
	public static void main(String[] args) {
	
		DecimalFormat df = new DecimalFormat("0.00000");
		Double p1 = 3.5;
		Double p2 = 7.5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		Double n1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		Double n2 = sc.nextDouble();
		sc.close();
		Double media = 0.0;
		
		media = ((n1*p1)+(n2*p2))/(p1+p2);
		
		
		System.out.println("MEDIA = "+df.format(media));
	}
}
