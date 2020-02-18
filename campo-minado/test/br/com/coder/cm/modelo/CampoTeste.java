package br.com.coder.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.coder.cm.excecao.ExplosaoException;
import br.com.coder.cm.modelo.Campo;

public class CampoTeste
{
	private Campo campo;
	
	@BeforeEach
	void inicializarCampo() {
		campo = new Campo(3,3);
	}
	
	@Test
	void TesteVizinhoEsquerda() {
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void TesteVizinhoDireita() {
		Campo vizinho = new Campo(3,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void TesteVizinhoEmCima() {
		Campo vizinho = new Campo(2,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void TesteVizinhoEmBaixo() {
		Campo vizinho = new Campo(4,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void TesteVizinhoDiagonal() {
		Campo vizinho = new Campo(2,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void TesteNaoVizinho() {
		Campo vizinho = new Campo(1,1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
	@Test
	void TesteValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void TesteAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void TesteAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void TesteAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	
	@Test
	void TesteAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void TesteAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void TesteAbrirMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class, ()->{
			campo.abrir();
		});
		
	}
	
	@Test
	void TesteAbrirComVizinhos() {
		Campo vizinho1 = new Campo(2, 2);
		Campo vizinhoDoVizinho = new Campo(1, 1);
		
		campo.adicionarVizinho(vizinho1);
		vizinho1.adicionarVizinho(vizinhoDoVizinho);
		campo.abrir();
			
		assertTrue(vizinho1.isAberto() && vizinhoDoVizinho.isAberto());
	}
	
	@Test
	void TesteAbrirComVizinhos2() {
		Campo campo22 = new Campo(2, 2);
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		campo12.minar();
		
		campo.adicionarVizinho(campo22);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo.abrir();
			
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
}
