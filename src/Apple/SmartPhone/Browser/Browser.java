package Apple.SmartPhone.Browser;

public class Browser implements NavegadorNaInternet{

	@Override
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");		
	}

}
