package menu.reprodutormusica;

public class Ipod implements ReprodutorMusica{

	@Override
	public void tocar() {
		System.out.println("Tocando musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musicas");
		
	}

	@Override
	public void SelecionarMusica() {
		System.out.println("Selecionando musica");
		
	}

}
