package menu.telefone;

public class AparelhoTelefonico implements Telefone{
	public void atender() {
		System.out.println("Atendendo telefone");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando o telefone");
		
	}

	@Override
	public void discarCorreioVoz() {
		System.out.println("discando o correio de voz");		
	}
}
