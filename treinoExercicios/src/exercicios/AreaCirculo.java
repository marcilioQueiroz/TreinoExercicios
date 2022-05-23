package exercicios;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaCirculo {
		/*
		 * A f�rmula para calcular a �rea de uma circunfer�ncia �: area = pi . raio2. Considerando para este problema que pi = 3.14159:
		 * 
		 * - Efetue o c�lculo da �rea, elevando o valor de raio ao quadrado e multiplicando por pi.
		 *      
		 *      **Entrada**
		 * A entrada cont�m um valor de ponto flutuante (dupla precis�o), no caso, a vari�vel raio.
		 * 
		 * 		**Saida**
		 * Apresentar a mensagem "A=" seguido pelo valor da vari�vel area, conforme exemplo abaixo, com 4 casas ap�s o ponto decimal.
		 * Utilize vari�veis de dupla precis�o (double).
		 * 
		 *		**ExemplosEntradas**          |       **ExemplosSaidas**
		 *		  2,0                         |         A=12,5664                           
		 *  ----------------------------------------------------------------                           
		 *        100,64                      |         A=31819,3103
		 *------------------------------------------------------------------                   
		 *       150,00                       |         A=70685,7750                         
		 * 
		 * */
	   public static Double calcularAreaCirculo(Double raio){
	        Double pi = 3.14159;
	        return pi*(raio*raio);
	    }

	   public static void main(String[] args) {
		   DecimalFormat df = new DecimalFormat("0.0000");
		    
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um numero");
			Double raio = sc.nextDouble();
			sc.close();
			
			Double resultado = calcularAreaCirculo(raio);
			
			System.out.println("A="+df.format(resultado));
	   }
}
