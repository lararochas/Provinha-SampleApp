package page;

import elementos.Elementos;
import metodos.Metodos;
import runner.BaseTest;

public class DadosVeiculoPage {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	
	public void acessarSiteEAutomobile() {
		BaseTest.iniciarTeste();
		metodo.clicar(el.automobile);
	}
	
	public void preencheerDadosVeiculo(String montadora, String kW, String dataFabricacao, String numeroAssentos, String tipoCombustivel, String precoLista, String quilometragemAnual) {
		metodo.escrever(el.montadora, montadora);
		metodo.escrever(el.kW, kW);
		metodo.escrever(el.dataFabricacao, dataFabricacao);
		metodo.escrever(el.numeroAssentos, numeroAssentos);
		metodo.escrever(el.tipoCombustivel, tipoCombustivel);
		metodo.escrever(el.precoLista, precoLista);
		metodo.escrever(el.quilometragemAnual, quilometragemAnual);
		metodo.clicar(el.btnNext);
		
		
	}
}
