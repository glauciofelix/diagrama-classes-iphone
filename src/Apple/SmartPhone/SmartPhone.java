package Apple.SmartPhone;

import Apple.Iphone;
import Apple.SmartPhone.Browser.Browser;
import Apple.SmartPhone.Browser.NavegadorNaInternet;
import Apple.SmartPhone.Ipod.ReprodutorMusical;
import Apple.SmartPhone.Telefone.AparelhoTelefonico;

public class SmartPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{

	//REPRODUTOR
	public void tocar() {System.out.println("Tocando via Smartphone");}
	public void pausar() {System.out.println("Pausando via Smartphone");}
	public void selecionarMusica() {System.out.println("Selecionando musica via Smartphone");}

	//TELEFONE
	public void ligar() {System.out.println("Ligando via Smartphone");}
	public void atender() {System.out.println("Atendendo via Smartphone");}
	public void iniciarCorreioVoz() {System.out.println("Iniciando correio de voz via Smartphone");}

	//BROWSER
	public void exibirPagina() {System.out.println("Exibindo pagina via Smartphone");}
	public void adicionarNovaAba() {System.out.println("Adicionando nova aba via Smartphone");}
	public void atualizarPagina() {System.out.println("Atualizando pagina via Smartphone");}
	
}


