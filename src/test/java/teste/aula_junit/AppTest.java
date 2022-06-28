package teste.aula_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	
	//Adultos
	
	@Test
	public void testeBaixoPesoMuitoGraveAdulto20() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso muito grave", calc.calcularImc(51, 1.79, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoMuitoGraveAdulto65() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso muito grave", calc.calcularImc(51, 1.79, 65, "m"));
	}
	
	@Test
	public void testeBaixoPesoGraveAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave", calc.calcularImc(49, 1.75, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoGraveAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave", calc.calcularImc(49, 1.75, 65, "m"));
	}
	
	@Test
	public void testeBaixoPesoGraveAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave", calc.calcularImc(49, 1.70, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoGraveAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso grave", calc.calcularImc(49, 1.75, 65, "m"));
	}
	
	@Test
	public void testeBaixoPesoAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(41, 1.55, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(41, 1.55, 65, "m"));
	}
	
	@Test
	public void testeBaixoPesoAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(46, 1.58, 20, "m"));
	}
	
	@Test
	public void testeBaixoPesoAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo peso", calc.calcularImc(46, 1.58, 65, "m"));
	}
	
	@Test
	public void testePesoNormalAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(47, 1.59, 20, "m"));
	}
	
	@Test
	public void testePesoNormalAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(47, 1.59, 65, "m"));
	}
	
	@Test
	public void testePesoNormalAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(68, 1.65, 20, "m"));
	}
	
	@Test
	public void testePesoNormalAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(68, 1.65, 65, "m"));
	}
	
	@Test
	public void testeSobrepesoAdulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(74, 1.72, 20, "m"));
	}
	
	@Test
	public void testeSobrepesoAdulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(74, 1.72, 65, "m"));
	}
	
	@Test
	public void testeSobrepesoAdulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(98, 1.81, 20, "m"));
	}
	
	@Test
	public void testeSobrepesoAdulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(98, 1.81, 65, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1Adulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 1", calc.calcularImc(103, 1.85, 20, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1Adulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 1", calc.calcularImc(103, 1.85, 65, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1Adulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 1", calc.calcularImc(125, 1.89, 20, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1Adulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 1", calc.calcularImc(125, 1.89, 65, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2Adulto20LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 2", calc.calcularImc(111, 1.78, 20, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2Adulto65LimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 2", calc.calcularImc(111, 1.78, 65, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2Adulto20LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 2", calc.calcularImc(101, 1.59, 20, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2Adulto65LimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 2", calc.calcularImc(101, 1.59, 65, "m"));
	}
	
	@Test
	public void testeObesidadeGrau3Adulto20() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 3", calc.calcularImc(117, 1.71, 20, "m"));
	}
	
	@Test
	public void testeObesidadeGrau3Adulto65() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade Grau 3", calc.calcularImc(117, 1.71, 65, "m"));
	}
	
	//Idosos
	
	@Test
	public void testeBaixoPesoIdosa() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(59, 1.64, 70, "f"));
	}
	
	@Test
	public void testePesoNormalIdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(55, 1.58, 70, "f"));
	}
	
	@Test
	public void testePesoNormalIdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(69, 1.60, 70, "f"));
	}
	
	@Test
	public void testeSobrepesoIdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(72, 1.63, 70, "f"));
	}
	
	@Test
	public void testeSobrepesoIdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(86, 1.64, 70, "f"));
	}
	
	@Test
	public void testeObesidadeGrau1IdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(96, 1.73, 70, "f"));
	}
	
	@Test
	public void testeObesidadeGrau1IdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(111, 1.71, 70, "f"));
	}
	
	@Test
	public void testeObesidadeGrau2IdosaLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(94, 1.59, 70, "f"));
	}
	
	@Test
	public void testeObesidadeGrau2IdosaLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(110, 1.62, 70, "f"));
	}
	
	@Test
	public void testeObesidadeGrau3Idosa() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 3", calc.calcularImc(105, 1.58, 70, "f"));
	}
	
	@Test
	public void testeBaixoPesoIdoso() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(59, 1.64, 70, "m"));
	}
	
	@Test
	public void testePesoNormalIdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(55, 1.58, 70, "m"));
	}
	
	@Test
	public void testePesoNormalIdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(69, 1.60, 70, "m"));
	}
	
	@Test
	public void testeSobrepesoIdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(74, 1.65, 70, "m"));
	}
	
	@Test
	public void testeSbrepesoIdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(95, 1.78, 70, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1IdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(90, 1.73, 70, "m"));
	}
	
	@Test
	public void testeObesidadeGrau1IdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 1", calc.calcularImc(93, 1.63, 70, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2IdosoLimiteMinimo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(99, 1.68, 70, "m"));
	}
	
	@Test
	public void testeObesidadeGrau2IdosoLimiteMaximo() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 2", calc.calcularImc(131, 1.81, 70, "m"));
	}
	
	@Test
	public void testeObesidadeGrau3Idoso() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade grau 3", calc.calcularImc(120, 1.173, 70, "m"));
	}
	
	// Crianças
	
	@Test
	public void testeBaixoPesoCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(11, 0.87, 2, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(12, 0.88, 2, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(16, 0.89, 2, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(17, 0.89, 2, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(15, 1.04, 4, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(18, 1.03, 4, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(18, 1.01, 4, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20, 1.05, 4, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(18, 1.15, 6, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(20, 1.18, 6, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(23, 1.16, 6, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(26, 1.17, 6, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(22, 1.26, 8, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(28, 1.26, 8, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(31, 1.26, 8, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(33, 1.26, 8, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(30, 1.46, 10, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(39, 1.46, 10, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(44, 1.46, 10, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(48, 1.46, 10, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(38, 1.61, 12, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(54, 1.61, 12, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(54, 1.60, 12, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(66, 1.60, 12, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(42, 1.64, 14, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(61, 1.64, 14, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(69, 1.63, 14, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(79, 1.64, 14, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(47, 1.67, 16, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(67, 1.67, 16, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(76, 1.66, 16, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(77, 1.67, 16, "m"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(52, 1.70, 18, "m"));
	}
	
	@Test
	public void testePesoNormalCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(74, 1.70, 18, "m"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(83, 1.70, 18, "m"));
	}
	
	@Test
	public void testeObesidadeCriancaMenino18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(88, 1.70, 18, "m"));
	}
	
	// Crianças Meninas
	
	@Test
	public void testeBaixoPesoCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(11, 0.86, 2, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(13, 0.85, 2, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(14, 0.86, 2, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina2Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(14, 0.85, 2, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(15, 1.03, 4, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(17, 1.02, 4, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(19, 1.03, 4, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina4Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(20, 1.04, 4, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(17, 1.14, 6, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(22, 1.13, 6, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(24, 1.13, 6, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina6Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(25, 1.13, 6, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(22, 1.26, 8, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(22, 1.25, 8, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(32, 1.25, 8, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina8Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(34, 1.25, 8, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(26, 1.37, 10, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(36, 1.37, 10, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(43, 1.37, 10, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina10Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(46, 1.37, 10, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(32, 1.48, 12, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(37, 1.49, 12, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(55, 1.49, 12, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina12Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(59, 1.48, 12, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(39, 1.58, 14, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(58, 1.58, 14, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(66, 1.58, 14, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina14Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(67, 1.58, 14, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(43, 1.60, 16, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(62, 1.61, 16, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(74, 1.61, 16, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina16Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(74, 1.60, 16, "f"));
	}
	
	@Test
	public void testeBaixoPesoCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Baixo Peso", calc.calcularImc(47, 1.65, 18, "f"));
	}
	
	@Test
	public void testePesoNormalCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Peso Normal", calc.calcularImc(72, 1.65, 18, "f"));
	}
	
	@Test
	public void testeSobrepesoCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Sobrepeso", calc.calcularImc(82, 1.65, 18, "f"));
	}
	
	@Test
	public void testeObesidadeCriancaMenina18Anos() {
		CalculadoraIMC calc = new CalculadoraIMC();
		assertEquals("Obesidade", calc.calcularImc(87, 1.65, 18, "f"));
	}
	
}