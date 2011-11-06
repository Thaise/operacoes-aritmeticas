import static org.junit.Assert.*;

import org.junit.Test;


public class OperacoesAritmeticasTest {

	@Test
	public void deveSomar() throws CalculaOperacaoException {
		double resultado = CalculaOperacao.efetuarCalculoEscolhido(1, 10, 5);
		assertEquals(15, resultado, 0);
	}
	
	@Test
	public void deveSubtrair() throws CalculaOperacaoException {
		double resultado = CalculaOperacao.efetuarCalculoEscolhido(2, 10, 5);
		assertEquals(5, resultado, 0);
	}
	
	@Test
	public void deveMultiplicar() throws CalculaOperacaoException {
		double resultado = CalculaOperacao.efetuarCalculoEscolhido(3, 10, 5);
		assertEquals(50, resultado, 0);
	}
	
	@Test
	public void deveDividir() throws CalculaOperacaoException {
		double resultado = CalculaOperacao.efetuarCalculoEscolhido(4, 10, 5);
		assertEquals(2, resultado, 0);
	}
	
	@Test(expected = CalculaOperacaoException.class )
	public void naoDeveDividir() throws CalculaOperacaoException {
		double resultado = CalculaOperacao.efetuarCalculoEscolhido(4, 10, 0);
		assertEquals(2, resultado, 0);
	}
	
	@Test
	public void naoDeveCalcular() throws CalculaOperacaoException {
		double resultado = CalculaOperacao.efetuarCalculoEscolhido(5, 10, 0);
		assertEquals(0, resultado, 0);
	}

}
