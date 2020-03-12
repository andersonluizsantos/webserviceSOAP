package servico;

import javax.jws.WebService;

import entidade.ResponseSoap;

@WebService (endpointInterface = "servico.Servico")

public class ServicoImpl implements Servico{
	
	public static final String SUCESSO = "SUCESSO";
	public static final String FALHA = "FALHA. O valor2 não pode ser igual a zero";
	
	@Override
	public ResponseSoap somar(double valor1, double valor2) {
		ResponseSoap response = new ResponseSoap();
		response.setCodigoResponse(0);
		response.setMensagemResponse(SUCESSO);
		response.setValorResponse(valor1 + valor2);
		
		return response;
	}

	@Override
	public ResponseSoap subtrair(double valor1, double valor2) {
		ResponseSoap response = new ResponseSoap();
		response.setCodigoResponse(0);
		response.setMensagemResponse(SUCESSO);
		response.setValorResponse(valor1 - valor2);
		
		return response;
	}

	@Override
	public ResponseSoap multiplicar(double valor1, double valor2) {
		ResponseSoap response = new ResponseSoap();
		response.setCodigoResponse(0);
		response.setMensagemResponse(SUCESSO);
		response.setValorResponse(valor1 * valor2);
		
		return response;		
	}

	@Override
	public ResponseSoap dividir(double valor1, double valor2) {
		ResponseSoap response = new ResponseSoap();
		response.setCodigoResponse(0);
		if (valor2 == 0) {
			response.setValorResponse(-1);
			response.setMensagemResponse(FALHA);
		}else {
			response.setValorResponse(valor1 / valor2);
			response.setMensagemResponse(SUCESSO);
		}
		return response;	
	}

}
