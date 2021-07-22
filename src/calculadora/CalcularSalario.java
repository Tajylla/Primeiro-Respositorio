package calculadora;

import java.util.Scanner;

public class CalcularSalario {
	
	public static void main (String [] args) {
		System.out.println("Informe seu salário por hora: ");
		Scanner entrada = new Scanner(System.in);
		String valorSalario = entrada.next();
		
		System.out.println("Insira a quantidade de horas trabalhadas por mês: ");
		String valorHorasTrabalhadas = entrada.next();
		
		System.out.println("Insira o percentual de desconto do INSS: ");
		String valorPercentual = entrada.next();
		
		entrada.close();
		
		Calcula calculo1 = new Calcula();
		calculo1.calculo(valorSalario, valorHorasTrabalhadas, valorPercentual);
		
		Imprimir.imprime("O resultado do salário é: " + calculo1.salarioCalculado);
		Imprimir.imprime("o valor do desconto é: " + calculo1.valorDesconto);
		Imprimir.imprime("o valor do salário bruto é: " + calculo1.valorBruto);
	} 
	
	}
	
	

	

