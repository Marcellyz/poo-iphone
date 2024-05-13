package celular;

import menu.home.Home;
import menu.browser.Browser;
import menu.reprodutormusica.ReprodutorMusica;
import menu.telefone.Telefone;

class Iphone {
	
	
	public static void main(String[] args) {
		
		Home home = new Home();
		
		Browser browser = home;
		Telefone telefone = home;
		ReprodutorMusica reprodutorMusica = home;
		
		browser.adicionarPagina();
		browser.exibirPagina();
		browser.atualizarPagina();
		
		telefone.ligar();
		telefone.atender();
		telefone.discarCorreioVoz();
		
		reprodutorMusica.SelecionarMusica();
		reprodutorMusica.tocar();
		reprodutorMusica.pausar();
		
		
	}
}
