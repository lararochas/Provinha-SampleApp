package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	
//Dados veículo
	public By automobile = By.xpath("//*[@id='nav_automobile']");
	public By montadora = By.xpath("//*[@id='make']");
	public By kW = By.xpath("//*[@id='engineperformance']");
	public By dataFabricacao = By.xpath("//*[@id='dateofmanufacture']");
	public By numeroAssentos = By.xpath("//*[@id='numberofseats']");
	public By tipoCombustivel = By.xpath("//*[@id='fuel']");
	public By precoLista = By.xpath("//*[@id='listprice']");
	public By placaVeiculo = By.xpath("//*[@id='licenseplatenumber']");
	public By quilometragemAnual = By.xpath("//*[@id='annualmileage']");
	public By btnNext = By.xpath("//*[@id='nextenterinsurantdata']");
	
	//Dados seguro
	public By firstName = By.xpath("//*[@id='firstname']");
	public By lastName = By.id("lastname");
	public By dateOfBirth = By.id("birthdate");
	public By genderMale = By.xpath("//*[text()='Male']/span");
	public By genderFemale = By.xpath("//*[text()='Female']/span");
	public By endereco = By.id("streetaddress");
	public By pais = By.id("country");
	public By cep = By.id("zipcode");
	public By cidade = By.id("city");
	public By ocupacao = By.id("occupation");
	public By hobbieSpeeding = By.xpath("//*[text()=' Speeding']/span");
	public By hobbieBungeeJumping = By.xpath("//*[text()=' Bungee Jumping']/span");
	public By hobbieCliffDiving = By.xpath("//*[text()=' Cliff Diving']/span");
	public By hobbieSkydiving = By.xpath("//*[text()=' Skydiving']/span");
	public By hobbieOther = By.xpath("//*[text()=' Other']/span");
	public By btnProximo = By.id("nextenterproductdata");
	
	//Dados produto
	public By startDate = By.id("startdate");
	public By insuranceSum = By.id("insurancesum");
	public By meritRating = By.id("meritrating");
	public By damageInsurance = By.id("damageinsurance");
	public By optionalEuro = By.xpath("//*[text()='Euro Protection']/span");
	public By courtesyCar = By.id("courtesycar");
	public By btnNext2 = By.id("nextselectpriceoption");
	
	//Dados cotação page
	
	public By email = By.id("email");
	public By phone = By.id("phone");
	public By username = By.id("username");
	public By password = By.id("password");
	public By confirmPassword = By.id("confirmpassword");
	public By btnEnviar = By.id("sendemail");
	
	
	
}
