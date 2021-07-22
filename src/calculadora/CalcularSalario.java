package calculadora;

import java.util.Scanner;

public class CalcularSalario {
	
	public static void main (String [] args) {
		System.out.println("Informe seu sal�rio por hora: ");
		Scanner entrada = new Scanner(System.in);
		String valorSalario = entrada.next();
		
		System.out.println("Insira a quantidade de horas trabalhadas por m�s: ");
		String valorHorasTrabalhadas = entrada.next();
		
		System.out.println("Insira o percentual de desconto do INSS: ");
		String valorPercentual = entrada.next();
		
		entrada.close();
		
		Calcula calculo1 = new Calcula();
		calculo1.calculo(valorSalario, valorHorasTrabalhadas, valorPercentual);
		
		Imprimir.imprime("O resultado do sal�rio �: " + calculo1.salarioCalculado);
		Imprimir.imprime("o valor do desconto �: " + calculo1.valorDesconto);
		Imprimir.imprime("o valor do sal�rio bruto �: " + calculo1.valorBruto);
	} 
	
	}
	
	

	

