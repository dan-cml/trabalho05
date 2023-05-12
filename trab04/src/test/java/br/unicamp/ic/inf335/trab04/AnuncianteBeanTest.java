package br.unicamp.ic.inf335.trab04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import java.net.URL;
import java.util.ArrayList;


class AnuncianteBeanTest {

	
	@Test
	void test() {
		AnuncianteBean anunciante = new AnuncianteBean();
		anunciante.setNome("Anunciante p/ Teste");
		anunciante.setCPF("1234567890");
		
		ProdutoBean produto1 = new ProdutoBean("Produto1", "bla bla", "bla bla", 100.00, "bla bla");
		ArrayList<URL> foto1 = new ArrayList<>();
		AnuncioBean anuncio1 = new AnuncioBean(produto1, foto1, 0.1);
		anunciante.addAnuncio(anuncio1);
		
		ProdutoBean produto2 = new ProdutoBean("Produto1", "bla bla", "bla bla", 200.00, "bla bla");
		ArrayList<URL> foto2 = new ArrayList<>();
		AnuncioBean anuncio2 = new AnuncioBean(produto2, foto2, 0.1);
		anunciante.addAnuncio(anuncio2);
		
		assertEquals(135.0, anunciante.valorMedioAnuncios());
		
		anunciante.removeAnuncio(0);
		assertEquals(180.0, anunciante.valorMedioAnuncios());
	}
	
	

}
