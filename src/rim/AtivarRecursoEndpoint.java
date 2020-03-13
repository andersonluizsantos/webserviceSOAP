package rim;

import javax.xml.ws.Endpoint;

import servico.AtivarRecursoImpl;

public class AtivarRecursoEndpoint {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8086/AtivarServico/servico", new AtivarRecursoImpl());
		// Endereço WSDL para ser inserido no SOAPUI: http://localhost:8086/CalculadoraServico/servico?wsdl
		System.out.println("SERVIÇO PUBLICADO COM SUCESSO");
	}

}
