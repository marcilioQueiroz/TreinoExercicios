package exercicios;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GastoCombustivel {

	/*
	 * Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, 
	 * ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através 
	 * de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) 
	 * e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida, 
	 * calcular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.
	 * 
	 * 
	 * 		**Entrada**
	 * O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a 
	 * velocidade média durante a mesma (em km/h).
	 * 
	 * 		**Saida**
	 * Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal
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
