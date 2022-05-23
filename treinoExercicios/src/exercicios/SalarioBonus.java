package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioBonus {

	/*
	 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
	 * efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão 
	 * sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.
	 * 
	 *		**Entrada**
	 * O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão 
	 * (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das 
	 * vendas efetuadas por este vendedor, respectivamente.
	 * 
	 *		**Saida**
	 * Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
	 * 
	 *  **ExemplosEntradas**          |       **ExemplosSaidas**
	 *    JOAO                        |                               
	 *    500,00                      |         TOTAL = R$ 684,54                      
	 *    1230,30                     |
	 * -------------------------------------------------------------------------
	 *    PEDRO                       |                                         
	 *    700,00                      |         TOTAL = R$ 700,00
	 *    0,00                        |                                          
	 * -------------------------------------------------------------------------
	 *   MANGOJATA                    |                                         
	 *   1700,00                      |         TOTAL = R$ 1884,58
	 *   1230,50                      |                                         
	 * -------------------------------------------------------------------------                                                                                                        
	 * */
	public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor ");
        String nome = sc.next();
        System.out.println("Digite o Salario do vendedor ");
        Double salario = sc.nextDouble();
        System.out.println("Digite o valor total das vendas do vendedor ");
        Double vendasMes = sc.nextDouble();
        sc.close();
        Double total = salario + (vendasMes * 0.15);
        System.out.println("TOTAL = "+df.format(total));

	}

}
