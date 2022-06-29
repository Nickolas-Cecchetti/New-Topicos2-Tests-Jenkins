package teste.aula_junit;

public class CalculadoraIMC {
	
	private double imc;
	
	public String calcularImc(double peso, double altura, int idade, String sexo) {
		
		String retorno = "";
		imc = peso / (altura*altura);
		
		//se for crianca
		if (idade < 20) 
			{
				retorno = "";
				
				if (sexo.equals("m")) 
				{
					if (imc <= 5.0) {
						retorno = "Baixo peso";
					}
					else if (imc >= 5.1 && imc <= 10.0) {
						retorno = "Peso normal";
					}
					else if (imc >= 10.1 && imc <= 15.0) {
						retorno = "Sobrepeso";
					}
					else if (imc >= 15.1) {
						retorno = "Obesidade";
					}
				}
				if (sexo.equals("f")) {
					
					if (imc <= 4.5) {
						retorno = "Baixo peso";
					}
					else if (imc >= 4.6 && imc <= 12.0) {
						retorno = "Peso normal";
					}
					else if (imc >= 12.1 && imc <= 22.0) {
						retorno = "Sobrepeso";
					}
					else if (imc >= 22.1) {
						retorno = "Obesidade";
					}
				}
			}
		//se for adulto
		else if (idade > 20 || idade < 65) 
		{				
			if (imc <= 15.99) { 
				retorno = "Baixo peso muito grave";
			}
			else if (imc >= 16.00 && imc <= 16.99) { 
				retorno = "Baixo peso grave";
			}
			else if (imc >= 17.00 && imc <= 18.49) { 
				retorno = "Baixo peso";
			}
			else if (imc >= 18.50 && imc <= 24.99) {
				retorno = "Peso normal";
			}
			else if (imc >= 25.00 && imc <= 29.99) {
				retorno = "Sobrepeso";
			}
			else if (imc >= 30.00 && imc <= 34.99) {
				retorno = "Obesidade grau 1";
			}
			else if (imc >= 35.00 && imc <= 39.99) {
				retorno = "Obesidade grau 2";
			}
			else if (imc >= 40.00) {
				retorno = "Obesidade grau 3";
			}
		}
		//se for idoso
		else if(idade > 65) 
		{	
			//idosa
			if (sexo.equals("f")) 
			{
				if (imc <= 21.9) {
					retorno = "Baixo peso";
				}
				else if (imc >= 22.0 && imc <= 27.0) {
					retorno = "Peso normal";
				}
				else if (imc >= 27.1 && imc <= 32.0) {
					retorno = "Sobrepeso";
				}
				else if (imc >= 32.1 && imc <= 37.0) {
					retorno = "Obesidade grau 1";
				}
				else if (imc >= 37.1 && imc <= 41.9) {
					retorno = "Obesidade grau 2";
				}
				else if (imc >= 42.0) {
					retorno = "Obesidade grau 3";
				}
			} 
			//idoso
			else if (sexo.equals("m")) 
			{
				if (imc <= 21.9) {
					retorno = "Baixo peso";
				}
				else if (imc >= 22.0 && imc <= 27.0) {
					retorno = "Peso normal";
				}
				else if (imc >= 27.1 && imc <= 30.0) {
					retorno = "Sobrepeso";
				}
				else if (imc >= 30.1 && imc <= 35.0) {
					retorno = "Obesidade grau 1";
				}
				else if (imc >= 35.1 && imc <= 39.9) {
					retorno = "Obesidade grau 2";
				}
				else if (imc >= 40.0) {
					retorno = "Obesidade grau 3";
				}
			}
		}else{
			retorno = "Valor Invalido";
		}	
		return retorno;
	}
}