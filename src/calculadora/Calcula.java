package calculadora;

public class Calcula {
	public Double valorBruto;
	public Double valorDesconto;
	public Double salarioCalculado;
	
	public void calculo(String valorSalario, String valorHorasTrabalhadas, String valorPercentual){
		this.valorBruto = Double.valueOf(valorSalario) * Double.valueOf(valorHorasTrabalhadas);
		this.valorDesconto = valorBruto * (Double.valueOf(valorPercentual) / 100); 
		this.salarioCalculado = valorBruto - valorDesconto;
	}
}
