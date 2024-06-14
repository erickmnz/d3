package app;

import java.util.ArrayList;

public class Navegador {
	private ArrayList<Pagina> abas=new ArrayList<Pagina>();
	private String homePage;
	
	public Navegador(String homepage) {
		this.homePage=homepage;
	}
	
	public Pagina exibirPagina(String endereco) {
		Pagina pagina = new Pagina(endereco);
		return pagina;
	}
	public Pagina novaAba() {
		Pagina pagina = new Pagina(this.homePage);
		abas.add(pagina);
		return pagina;
	}
	public void setHomePage(String endereco) {
		this.homePage=endereco;
	}
}
