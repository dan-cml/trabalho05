package br.unicamp.ic.inf335.trab04;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnuncioBeanTest2 {

private AnuncioBean anuncio;
private ProdutoBean produto;
private ArrayList<URL> fotos;
	
	@BeforeEach
	void setUp() throws Exception {
		produto = new ProdutoBean("123", "Produto", "Descição exemplo", 100.00, "Novo");
		fotos = new ArrayList<URL>();
		fotos.add(new URL("https://examplo.com/fotodeexemplo1.jpg"));
		fotos.add(new URL("https://examplo.com/fotodeexemplo2.jpg"));
		anuncio = new AnuncioBean(produto, fotos, 0.2);
	}

	@Test
	void test() {
		assertEquals(80.0, anuncio.getValor());
	}

}
