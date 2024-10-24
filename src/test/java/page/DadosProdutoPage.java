package page;

import elementos.Elementos;
import metodos.Metodos;

public class DadosProdutoPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void preencherDadosProduto(String startDate, String insuranceSum, String meritRating, String damageInsurance, String courtesyCar) {
		metodo.escrever(el.startDate, startDate);
		metodo.escrever(el.insuranceSum, insuranceSum);
		metodo.escrever(el.meritRating, meritRating);
		metodo.escrever(el.damageInsurance, damageInsurance);
		metodo.clicar(el.optionalEuro);
		metodo.escrever(el.courtesyCar, courtesyCar);
		metodo.clicar(el.btnNext2);
	}
	
}
