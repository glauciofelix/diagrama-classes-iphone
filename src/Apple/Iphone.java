package Apple;

import Apple.SmartPhone.SmartPhone;
import Apple.SmartPhone.Ipod.ReprodutorMusical;
import Apple.SmartPhone.Telefone.AparelhoTelefonico;
import Apple.SmartPhone.Telefone.Telefone;

public class Iphone {
	public static void main(String[] args) {
		SmartPhone iphone = new SmartPhone();
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica();
		
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina();
	}
}
