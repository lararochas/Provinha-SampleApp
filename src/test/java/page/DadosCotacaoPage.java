package page;

import elementos.Elementos;
import metodos.Metodos;

public class DadosCotacaoPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void preencherDadosCotacao(String email, String phone, String username, String password, String confirmPassword) {
		metodo.escrever(el.email, email);
		metodo.escrever(el.phone, phone);
		metodo.escrever(el.username, username);
		metodo.escrever(el.password, password);
		metodo.escrever(el.confirmPassword, confirmPassword);
		metodo.clicar(el.btnEnviar);
	}
}
