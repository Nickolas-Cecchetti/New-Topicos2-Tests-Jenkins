package teste.aula_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	
	//Adultos
	
	@Test
	public void testeBaixoPesoMuitoGraveAdulto20() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso muito grave", calc.calcularImc(51.0, 1.79, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoMuitoGraveAdulto65() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso muito grave", calc.calcularImc(51.0, 1.79, 65, "m"));
	}
	
	@Test
	public void testeBaixoPesoGraveAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave", calc.calcularImc(49.0, 1.75, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoGraveAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave", calc.calcularImc(49.0, 1.75, 65, "m"));
	}
	
	@Test
	public void testeBaixoPesoGraveAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave", calc.calcularImc(49.0, 1.70, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoGraveAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave", calc.calcularImc(49.0, 1.75, 65, "m"));
	}
	
	@Test
	public void testeBaixoPesoAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(41.0, 1.55, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(41.0, 1.55, 65, "m"));
	}
	
	@Test
	public void testeBaixoPesoAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(46.0, 1.58, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(46.0, 1.58, 65, "m"));
	}
	
	@Test
	public void testePesoNormalAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(47.0, 1.59, 20, "m"));
	}
	
	@Test
	public void testePesoNormalAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(47.0, 1.59, 65, "m"));
	}
	
	@Test
	public void testePesoNormalAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(68.0, 1.65, 20, "m"));
	}
	
	@Test
	public void testePesoNormalAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(68.0, 1.65, 65, "m"));
	}
	
	@Test
	public void testeSobrepesoAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(74.0, 1.72, 20, "m"));
	}
	
	@Test
	public void testeSobrepesoAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(74.0, 1.72, 65, "m"));
	}
	
	@Test
	public void testeSobrepesoAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(98.0, 1.81, 20, "m"));
	}
	
	@Test
	public void testeSobrepesoAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(98.0, 1.81, 65, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1Adulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(103.0, 1.85, 20, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1Adulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(103.0, 1.85, 65, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1Adulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(120.0, 1.89, 20, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1Adulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(121.0, 1.89, 65, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2Adulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(111.0, 1.78, 20, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2Adulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(111.0, 1.78, 65, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2Adulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(101.0, 1.59, 20, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2Adulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(101.0, 1.59, 65, "m"));
	}
	
	@Test
	public void testeObesidadeGrau3Adulto20() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 3", calc.calcularImc(117.0, 1.71, 20, "m"));
	}
	
	@Test
	public void testeObesidadeGrau3Adulto65() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 3", calc.calcularImc(117.0, 1.71, 65, "m"));
	}
	
	//Idosos
	
	@Test
	public void testeBaixoPesoIdosa() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(49.0, 1.64, 70, "f"));
	}
	
	@Test
	public void testePesoNormalIdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(55.0, 1.58, 70, "f"));
	}
	
	@Test
	public void testePesoNormalIdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(60.0, 1.60, 70, "f"));
	}
	
	@Test
	public void testeSobrepesoIdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(72.0, 1.63, 70, "f"));
	}
	
	@Test
	public void testeSobrepesoIdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(80.0, 1.64, 70, "f"));
	}
	
	@Test
	public void testeObesidadeGrau1IdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(96.0, 1.73, 70, "f"));
	}
	
	@Test
	public void testeObesidadeGrau1IdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(102.0, 1.71, 70, "f"));
	}
	
	@Test
	public void testeObesidadeGrau2IdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(94.0, 1.59, 70, "f"));
	}
	
	@Test
	public void testeObesidadeGrau2IdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(101.0, 1.62, 70, "f"));
	}
	
	@Test
	public void testeObesidadeGrau3Idosa() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 3", calc.calcularImc(105.0, 1.58, 70, "f"));
	}
	
	@Test
	public void testeBaixoPesoIdoso() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(49.0, 1.64, 70, "m"));
	}
	
	@Test
	public void testePesoNormalIdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(55.0, 1.58, 70, "m"));
	}
	
	@Test
	public void testePesoNormalIdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(62.0, 1.60, 70, "m"));
	}
	
	@Test
	public void testeSobrepesoIdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(74.0, 1.65, 70, "m"));
	}
	
	@Test
	public void testeSbrepesoIdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(95.0, 1.78, 70, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1IdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(90.0, 1.73, 70, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1IdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(92.0, 1.63, 70, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2IdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(99.0, 1.68, 70, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2IdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(131.0, 1.81, 70, "m"));
	}
	
	@Test
	public void testeObesidadeGrau3Idoso() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 3", calc.calcularImc(120.0, 1.173, 70, "m"));
	}
	
	// Crianças
	
	@Test
	public void testeBaixoPesoCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 2, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 2, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 2, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20.0, 1.00, 2, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 4, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 4, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 4, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20.0, 1.00, 4, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 6, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 6, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 6, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20.0, 1.00, 6, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 8, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 8, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 8, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20.0, 1.00, 8, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 10, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 10, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 10, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20.0, 1.00, 10, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 12, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 12, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 12, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20.0, 1.00, 12, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 14, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 14, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 14, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20.0, 1.00, 14, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 16, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 16, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 16, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20.0, 1.00, 16, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 18, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 18, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 18, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20.0, 1.00, 18, "m"));
	}
	
	// Crianças Meninas
	
	@Test
	public void testeBaixoPesoCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 2, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 2, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 2, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(22.1, 1.00, 2, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 4, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 4, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 4, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(22.1, 1.00, 4, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 6, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 6, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 6, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(22.1, 1.00, 6, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 8, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 8, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 8, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(22.1, 1.00, 8, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 10, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 10, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 10, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(22.1, 1.00, 10, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 12, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 12, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 12, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(22.1, 1.00, 12, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 14, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 14, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 14, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(22.1, 1.00, 14, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 16, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 16, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 16, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(22.1, 1.00, 16, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(4.0, 1.00, 18, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso normal", calc.calcularImc(9.0, 1.00, 18, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14.0, 1.00, 18, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(22.1, 1.00, 18, "f"));
	}
	
}