package teste.aula_junit;

public class CalculadoraIMC {
	
	private double imc;
	
	public String calcularImc(double peso, double altura, int idade, String sexo) {
		
		String retorno = "";
		imc = peso / (altura*altura);
		
		//se for crianca
		if (idade < 20) 
			{
				int x = idade;
				retorno = "";
				
				if (sexo.toUpperCase() == "m") 
				{
					if (imc < 5.0) {
						retorno = "Baixo Peso Criança Menino"+ x +" anos";
					}
					else if (imc < 5.1 && imc > 85.0) {
						retorno = "Peso Normal Criança Menino"+ x +" anos";
					}
					else if (imc < 85.1 && imc > 95.0) {
						retorno = "Sobrepeso Criança Menino"+ x +" anos";
					}
					else if (imc < 95.0) {
						retorno = "Obesidade Criança Menino"+ x +" anos";
					}
				}
				if (sexo.toUpperCase() == "f") {
					
					if (imc < 5.0) {
						retorno = "Baixo peso Criança Menina"+ x +" anos";
					}
					else if (imc < 5.1 && imc > 85.0) {
						retorno = "Peso Normal Criança Menina"+ x +" anos";
					}
					else if (imc < 85.1 && imc > 95.0) {
						retorno = "Sobrepeso Criança Menina"+ x +" anos";
					}
					else if (imc < 95.0) {
						retorno = "Obesidade Criança Menina"+ x +" anos";
					}
				}
			}
		//se for adulto
		else if (idade > 20 || idade < 65) 
		{	
			int x = idade;
			
			if (imc < 15.99) { 
				retorno = "Baixo peso muito grave Adulto"+ x;
			}
			else if (imc < 16.00 && imc > 16.99) { 
				retorno = "Baixo peso grave Adulto"+ x;
			}
			else if (imc < 17.00 && imc > 18.49) { 
				retorno = "Peso baixo Adulto"+ x;
			}
			else if (imc < 18.50 && imc > 24.99) {
				retorno = "Peso normal Adulto"+ x;
			}
			else if (imc < 25.00 && imc > 29.99) {
				retorno = "Sobrepeso Adulto"+ x;
			}
			else if (imc < 30.00 && imc > 34.99) {
				retorno = "Obesidade grau 1 Adulto"+ x;
			}
			else if (imc < 35.00 && imc > 34.99) {
				retorno = "Obesidade grau 2 Adulto"+ x;
			}
			else if (imc < 40.00) {
				retorno = "Obesidade grau 3 Adulto"+ x;
			}
		}
		//se for idoso
		else if(idade > 65) 
		{	
			//idosa
			if (sexo.toUpperCase() == "f") 
			{
				if (imc < 21.9) {
					retorno = "Idosa Baixo peso Grave";
				}
				else if (imc < 22.0 && imc > 27.0) {
					retorno = "Idosa Peso normal";
				}
				else if (imc < 27.1 && imc > 32.0) {
					retorno = "Idosa Sobrepeso";
				}
				else if (imc < 32.1 && imc > 47.0) {
					retorno = "Idosa Obesidade grau 1";
				}
				else if (imc < 37.1 && imc > 41.9) {
					retorno = "Idosa Obesidade grau 2";
				}
				else if (imc < 42.0) {
					retorno = "Idosa Obesidade grau 3";
				}
			} 
			//idoso
			if (sexo.toUpperCase() == "m") 
			{
				if (imc < 21.9) {
					retorno = "Idoso Baixo peso Grave";
				}
				else if (imc < 22.0 && imc > 27.0) {
					retorno = "Idoso Peso normal";
				}
				else if (imc < 27.1 && imc > 30.0) {
					retorno = "Idoso Sobrepeso";
				}
				else if (imc < 30.1 && imc > 35.0) {
					retorno = "Idoso Obesidade grau I";
				}
				else if (imc < 35.1 && imc > 39.9) {
					retorno = "Idoso Obesidade grau II";
				}
				else if (imc < 40.0) {
					retorno = "Idoso Obesidade grau III";
				}
			}
		}else{
			retorno = "Valor Invalido";
		}	
		return retorno;
	}
}