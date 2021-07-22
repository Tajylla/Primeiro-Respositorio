package calculadora;

import java.util.Scanner;

public class CalculoPorcentagem {

	public static void main (String [] args) {
		System.out.println("Informe o valor do seu salário : ");
		Scanner entrada = new Scanner(System.in);
		Double valorSalario = Double.valueOf(entrada.next());
		
		Double porcento = 0.3;
		
		Double calculo = valorSalario * porcento; 
		System.out.println("O resultado é: " + calculo);
		
								
	}

	
}
