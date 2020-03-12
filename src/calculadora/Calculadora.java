package calculadora;

import javax.xml.ws.Endpoint;

import servico.ServicoImpl;

public class Calculadora {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8086/CalculadoraServico/servico", new ServicoImpl());
		// Endere�o WSDL para ser inserido no SOAPUI: http://localhost:8086/CalculadoraServico/servico?wsdl
		System.out.println("SERVI�O PUBLICADO COM SUCESSO");
	}

}
