package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import page.DadosCotacaoPage;
import page.DadosOpcaoPrecoPage;
import page.DadosProdutoPage;
import page.DadosSeguroPage;
import page.DadosVeiculoPage;

public class DadosCarroPage {

	DadosVeiculoPage page1 = new DadosVeiculoPage();
	DadosSeguroPage page2 = new DadosSeguroPage();
	DadosProdutoPage page3 = new DadosProdutoPage();
	DadosOpcaoPrecoPage page4 = new DadosOpcaoPrecoPage();
	DadosCotacaoPage page5 = new DadosCotacaoPage();

	@Dado("que o usuário acesse o site e esteja na aba Automobile")
	public void queOUsuárioAcesseOSiteEEstejaNaAbaAutomobile() {
		page1.acessarSiteEAutomobile();
	}

	@Quando("acesso automobile e preencho dados do veículo")
	public void acessoAutomobileEPreenchoDadosDoVeículo() {
		page1.preencheerDadosVeiculo("BMW", "381", "10/16/2023", "4", "Petrol", "820.950", "2000");
	}

	@Quando("preencho dados do seguro")
	public void preenchoDadosDoSeguro() {
		page2.preencherDadosSeguro("Larissa", "Rocha", "12/28/2002", "Rua Hollywood", "Brazil", "0989800", "São Paulo",
				"Selfemployed");

	}

	@Quando("e preencho dados do produto")
	public void ePreenchoDadosDoProduto() {
		page3.preencherDadosProduto("12/10/2024", "7.000.000,00", "Bonus 3", "Full Coverage", "Yes");
	}

	@Quando("seleciono a opção de preço")
	public void selecionoAOpçãoDePreço() {
		page4.selecionarPreco();
		page4.clicarEmNext();
	}

	@Então("valido a cotação enviada")
	public void validoACotaçãoEnviada() {
		page5.preencherDadosCotacao("larissarscontato@gmail.com", "11986507056", "larissarocha", "123Larissa", "123Larissa");
	}

}
