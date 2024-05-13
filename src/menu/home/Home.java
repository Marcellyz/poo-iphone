package menu.home;

import menu.browser.Browser;
import menu.reprodutormusica.ReprodutorMusica;
import menu.telefone.Telefone;

public class Home implements Telefone, ReprodutorMusica, Browser {

	
	public void adicionarPagina() {
		System.out.println("Adicionando a pagina");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a pagina");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo a pagina");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando a musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a musica");
		
	}

	@Override
	public void SelecionarMusica() {
		System.out.println("Selecionando a musica");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo o telefone");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando o telefone");
		
	}

	@Override
	public void discarCorreioVoz() {
		System.out.println("discando correio de voz");
		
	}

}
