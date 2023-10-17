package Apple.SmartPhone.Ipod;

public class Ipod implements ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("TOCANDO");
		
	}

	@Override
	public void pausar() {
		System.out.println("PAUSANDO");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MÚSICA");
		
	}

}
