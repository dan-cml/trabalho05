package br.unicamp.ic.inf335.trab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoBeanTest {

	@Test
	void tesTMetodoCompareTo() {
		ProdutoBean produto1 = new ProdutoBean("001", "Produto 1", "Descição sobre o produto 1", 1000.00, "Usado");
		ProdutoBean produto2 = new ProdutoBean("002", "Produto 2", "Descição sobre o produto 2", 2000.00, "Usado");
		ProdutoBean produto3 = new ProdutoBean("003", "Produto 3", "Descição sobre o produto 3", 1000.00, "Novo");
		
		assertEquals(-1, produto1.compareTo(produto2));
		
		assertEquals(1, produto2.compareTo(produto1));
	}

}
