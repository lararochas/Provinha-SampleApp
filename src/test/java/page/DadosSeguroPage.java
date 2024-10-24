package page;


import elementos.Elementos;
import metodos.Metodos;

public class DadosSeguroPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void preencherDadosSeguro(String firstName, String lastName, String dateOfBirth, String endereco, String pais, String cep, String cidade, String ocupacao) {
	  metodo.escrever(el.firstName, firstName);
	  metodo.escrever(el.lastName, lastName);
	  metodo.escrever(el.dateOfBirth, dateOfBirth);
	  metodo.clicar(el.genderFemale);
	  metodo.escrever(el.endereco, endereco);
	  metodo.escrever(el.pais, pais);
	  metodo.escrever(el.cep, cep);
	  metodo.escrever(el.cidade, cidade);
	  metodo.escrever(el.ocupacao, ocupacao);
	  metodo.clicar(el.hobbieBungeeJumping);
	  metodo.clicar(el.btnProximo);
	}
	
}
