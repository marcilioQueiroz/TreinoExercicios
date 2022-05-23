package exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GastoCombustivel {

	/*
	 * Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, 
	 * ao utilizar um autom�vel que faz 12 KM/L. Para isso, ele gostaria que voc� o auxiliasse atrav�s 
	 * de um simples programa. Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) 
	 * e a velocidade m�dia durante a mesma (em km/h). Assim, pode-se obter dist�ncia percorrida e, em seguida, 
	 * calcular quantos litros seriam necess�rios. Mostre o valor com 3 casas decimais ap�s o ponto.
	 * 
	 * 
	 * 		**Entrada**
	 * O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na viagem (em horas) e o segundo � a 
	 * velocidade m�dia durante a mesma (em km/h).
	 * 
	 * 		**Saida**
	 * Imprima a quantidade de litros necess�ria para realizar a viagem, com tr�s d�gitos ap�s o ponto decimal
	 * 
	 *   **ExemplosEntradas**          |       **ExemplosSaidas**  
	 *     10                          |         70,833                       
	 *     85                          |                                 
	 * ------------------------------------------------------------------- 
	 *     2                           |         15,333                       
	 *     92                          |                                 
	 * -------------------------------------------------------------------  
	 *     22                          |         122,833                       
	 *     67                          |                                 
	 * -------------------------------------------------------------------                                  
	 * */
	public static void main(String[] args) {
		
		Double automovelKmLitro = 12.00;
		
		DecimalFormat df = new DecimalFormat("0.000");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tempo gasto na viagem em Horas ");
		Integer tempoHora = sc.nextInt();
		System.out.println("Digite a velocidade media durante a viagem (em km/h) ");
		Integer velocidadeMedia = sc.nextInt();
		sc.close();
		
		Double qtdLitros = (tempoHora * velocidadeMedia) / automovelKmLitro;
		
		System.out.println(df.format(qtdLitros));
	}

}
